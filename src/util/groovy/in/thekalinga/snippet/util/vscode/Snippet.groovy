package in.thekalinga.snippet.util.vscode

import groovy.transform.builder.Builder

@Builder
class Snippet {
    String prefix
    String body
    String description
    String scope
}
