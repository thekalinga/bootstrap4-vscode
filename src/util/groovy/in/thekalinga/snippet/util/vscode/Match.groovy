package in.thekalinga.snippet.util.vscode

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.builder.Builder

@ToString(includePackage = false)
@Builder
@EqualsAndHashCode(includes = "index")
public class Match implements Comparable<Match> {
    int index
    String suggestion

    int compareTo(Match other) {
        index.compareTo(other.index)
    }
}
