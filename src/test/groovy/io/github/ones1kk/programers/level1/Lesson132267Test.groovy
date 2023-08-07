package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson132267Test extends Specification {

    def "콜라 문제"() {
        when:
        def solution = Lesson132267.solution(a as int, b as int, n as int)

        then:
        solution == result

        where:
        a | b | n  | result
        2 | 1 | 20 | 19
        3 | 1 | 20 | 9
        3 | 2 | 10 | 16
        3 | 2 | 20 | 36
    }
}
