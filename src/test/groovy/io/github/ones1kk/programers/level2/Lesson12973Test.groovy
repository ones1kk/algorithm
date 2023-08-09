package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12973Test extends Specification {

    def "짝지어 제거하기"() {
        when:
        def solution = Lesson12973.solution(s as String)

        then:
        solution == result as int

        where:
        s        | result
        "baabaa" | 1
        "cdcd"   | 0
    }
}
