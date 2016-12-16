package in.thekalinga.snippet.util

import in.thekalinga.snippet.util.readme.ReadmeGenerator
import in.thekalinga.snippet.util.vscode.SnippetGenerator

class RegeneratePlugin {
    static void main(String[] args) {
        SnippetGenerator.main()
        ReadmeGenerator.main()
        PackageJsonGenerator.main()
    }
}
