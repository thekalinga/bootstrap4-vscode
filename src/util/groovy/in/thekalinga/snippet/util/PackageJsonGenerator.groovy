package in.thekalinga.snippet.util

import org.apache.commons.io.IOUtils

import static java.nio.charset.Charset.defaultCharset

class PackageJsonGenerator {

    static void main(String[] args) {
        StringWriter readmeTemplate = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream("/package-template.json"), readmeTemplate, defaultCharset())
        String readmeContent = readmeTemplate.toString().replaceAll(/@@@VERSION@@@/,
                IOUtils.readLines(new FileInputStream(new File(".version")), defaultCharset()).get(0))

        File readme = new File("package.json")
        IOUtils.write(readmeContent, new FileOutputStream(readme), defaultCharset())
        println "Regenerated package metadata. Saved to ${readme.absolutePath}"
    }

}
