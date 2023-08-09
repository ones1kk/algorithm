package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12909Test extends Specification {

    def "올바른 괄호"() {
        when:
        def solution = Lesson12909.solution(s as String)

        then:
        solution == answer as boolean

        where:
        s        | answer
        "()()"   | true
        "(())()" | true
        ")()("   | false
        "(()("   | false
    }
}
