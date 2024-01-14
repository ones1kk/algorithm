package io.github.ones1kk.beakjoon.suggestion.day02

import spock.lang.Specification

class Problem9012Test extends Specification {

    def "괄호"() {
        when:
        def solution = Problem9012.solve(arg)

        then:
        solution == result as String

        where:
        arg                     | result
        "(())())"               | "NO"
        "(((()())()"            | "NO"
        "(()())((()))"          | "YES"
        "((()()(()))(((())))()" | "NO"
        "(("                    | "NO"
        "))"                    | "NO"
        "())(()"                | "NO"
    }
}
