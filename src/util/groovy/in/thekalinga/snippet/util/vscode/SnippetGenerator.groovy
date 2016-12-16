package in.thekalinga.snippet.util.vscode

import com.fasterxml.jackson.databind.ObjectMapper
import in.thekalinga.snippet.util.Icons
import org.apache.commons.io.IOUtils
import org.springframework.core.io.support.PathMatchingResourcePatternResolver

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static java.nio.charset.Charset.defaultCharset

class SnippetGenerator {

    static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper()
        Map<String, Snippet> descriptionToSnippet = new LinkedHashMap<>()

        def templateStr
        def triggerPattern
        def helpMsg

        // Bootstrap
        PathMatchingResourcePatternResolver resourceLoader = new PathMatchingResourcePatternResolver();
        def snippetResources = Arrays.asList(resourceLoader.getResources("/bootstrap/**/*.html"))
        snippetResources.forEach({ snippetResource ->
            StringWriter writer = new StringWriter()
            IOUtils.copy(snippetResource.getInputStream(), writer, defaultCharset())
            def contentUntouched = writer.toString()

            def fileParent = new File(snippetResource.file.parent).name
            def fileBaseName = snippetResource.file.name.take(snippetResource.getFile().name.lastIndexOf('.'))

            templateStr = contentUntouched

            triggerPattern = fileBaseName != '$' ? "b4-${fileParent}-${fileBaseName}" : 'b4-$'
            templateStr = templateStr.contains("\$END\$") ? templateStr.trim().replaceAll("\\\$END\\\$", '\\\$0') : "${templateStr.trim()}\$0"
            helpMsg = fileBaseName != '$' ? "${fileParent} ${fileBaseName}".replace(/-/, ' ') : 'Bootstrap master template'

            def snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)
        })

        // Font awesome
        triggerPattern = 'fa-\$'
        templateStr = '<link rel="stylesheet" href="${1:https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css}">$0'
        helpMsg = 'Font awesome css link'

        def snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
        descriptionToSnippet.put(helpMsg, snippet)

        def iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome.json'), Icons.class)
        iconsContainer.icons.forEach({ iconStr ->
            triggerPattern = "fa-${iconStr}"
            templateStr = "<i class=\"fa fa-${iconStr}\${1}\" aria-hidden=\"true\"></i>\$0"
            helpMsg = iconStr

            snippet = Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build()
            descriptionToSnippet.put(helpMsg, snippet)
        })

        mapper = new ObjectMapper()
        mapper.enable(INDENT_OUTPUT)
        File file = new File("snippets.json")

        mapper.writeValue(file, descriptionToSnippet)
        println file.absolutePath
    }
}
