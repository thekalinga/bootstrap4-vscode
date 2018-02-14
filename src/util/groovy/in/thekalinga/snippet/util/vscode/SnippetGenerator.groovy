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
        putSnippet(descriptionToSnippet, 'fa4-\$', '<link rel="stylesheet" href="${1:https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css}">$0', 'Font awesome 4 css link')

        def iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome.json'), Icons.class)
        iconsContainer.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "fa4-${iconStr}", "<i class=\"fa fa-${iconStr}\${1}\" aria-hidden=\"true\"></i>\$0", iconStr)
        })

        // Font awesome 5 Free
        putSnippet(descriptionToSnippet, 'fa5-\$-js', '<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>$0', 'Font Awesome 5 Free JS link')
        putSnippet(descriptionToSnippet, 'fa5-\$-css', '<link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">$0', 'Font Awesome 5 Free CSS link')

        iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome5.json'), Icons.class)
        iconsContainer.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "fa5-${iconStr}", "<i class=\"\${1|fas,fab|} fa-${iconStr} \${2| ,fa-xs,fa-sm,fa-lg,fa-2x,fa-3x,fa-4x,fa-5x,fa-6x,fa-7x,fa-8x,fa-9x,fa-10x|} \${3| ,fa-fw|}\$4\"></i>\$0", iconStr)
        })

        putSnippet(descriptionToSnippet, 'fa5-ul', 'fa-ul', 'Unordered list. Apply on html ul element')
        putSnippet(descriptionToSnippet, 'fa5-li', 'fa-li', 'List item. Apply on html li element')
        putSnippet(descriptionToSnippet, 'fa5-border', 'fa-border', 'Icon with border')
        putSnippet(descriptionToSnippet, 'fa5-pull-right', 'fa-pull-right', 'Pull icon to right')
        putSnippet(descriptionToSnippet, 'fa5-pull-left', 'fa-pull-left', 'Pull icon to left')
        putSnippet(descriptionToSnippet, 'fa5-spin', 'fa-spin', 'Animates continuously rotating icon')
        putSnippet(descriptionToSnippet, 'fa5-pulse', 'fa-pulse', 'Animates 8 step rotating icon')
        putSnippet(descriptionToSnippet, 'fa5-rotate-90', 'fa-rotate-90', 'Rotates icon by 90 degrees')
        putSnippet(descriptionToSnippet, 'fa5-rotate-180', 'fa-rotate-180', 'Rotates icon by 180 degrees')
        putSnippet(descriptionToSnippet, 'fa5-rotate-270', 'fa-rotate-270', 'Rotates icon by 270 degrees')
        putSnippet(descriptionToSnippet, 'fa5-flip-horizontal', 'fa-flip-horizontal', 'Flips icon horizontally')
        putSnippet(descriptionToSnippet, 'fa5-flip-vertical', 'fa-flip-vertical', 'Flips icon vertically')
        putSnippet(descriptionToSnippet, 'fa5-stack', 'fa-stack', 'Stacks multiple icons. Apply on parent')
        putSnippet(descriptionToSnippet, 'fa5-stack-1x', 'fa-stack-1x', 'Regular sized stacked icon')
        putSnippet(descriptionToSnippet, 'fa5-stack-2x', 'fa-stack-2x', 'Larger sized stacked icon')
        putSnippet(descriptionToSnippet, 'fa5-inverse', 'fa-inverse', 'Alternative colored icon')

        // Font awesome 5 Pro
        putSnippet(descriptionToSnippet, 'fa5p-\$-js', '<script defer src="$0"></script>$1', 'Font Awesome 5 Pro js link')
        putSnippet(descriptionToSnippet, 'fa5p-\$-css', '<link href="$0" rel="stylesheet">$1', 'Font Awesome 5 Pro CSS link')

        iconsContainer = mapper.readValue(getClass().getResourceAsStream('/font-awesome5-pro.json'), Icons.class)
        iconsContainer.icons.forEach({ iconStr ->
            putSnippet(descriptionToSnippet, "fa5p-${iconStr}", "<i class=\"\${1|fas,far,fal,fab|} fa-${iconStr} \${2| ,fa-xs,fa-sm,fa-lg,fa-2x,fa-3x,fa-4x,fa-5x,fa-6x,fa-7x,fa-8x,fa-9x,fa-10x|} \${3| ,fa-fw|}\$4\"></i>\$0", iconStr)
        })

        mapper = new ObjectMapper()
        mapper.enable(INDENT_OUTPUT)
        File file = new File("snippets.json")

        mapper.writeValue(file, descriptionToSnippet)
        println "Regenerated snippets. Saved to ${file.absolutePath}"
    }

    static void putSnippet(Map<String, Snippet> descriptionToSnippetTarget, String triggerPattern, String templateStr, String helpMsg) {
        descriptionToSnippetTarget.put(helpMsg, Snippet.builder().prefix(triggerPattern).body(templateStr).description(helpMsg).scope('').build())
    }
}
