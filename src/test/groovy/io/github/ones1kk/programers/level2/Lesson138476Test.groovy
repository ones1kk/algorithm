package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson138476Test extends Specification {

    def "귤 고르기"() {
        when:
        def solution = Lesson138476.solution(k as int, tangerine as int[])

        then:
        solution == result as int

        where:
        k | tangerine                | result
        6 | [1, 3, 2, 5, 4, 5, 2, 3] | 3
        4 | [1, 3, 2, 5, 4, 5, 2, 3] | 2
        2 | [1, 1, 1, 1, 2, 2, 2, 3] | 1
    }
}
