package io.github.ones1kk.beakjoon.series16

import spock.lang.Specification

class Problem9012Test extends Specification {

    def "괄호"() {
        when:
        def main = Problem9012.Main
        def solve = main.solve(arg)

        then:
        solve == result as String

        where:
        arg                     | result
        "(())())"               | "NO"
        "(((()())()"            | "NO"
        "(()())((()))"          | "YES"
        "((()()(()))(((())))()" | "NO"
    }
}
