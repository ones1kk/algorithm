package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson133502Test extends Specification {

    def "햄버거 만들기"() {
        when:
        def solution = Lesson133502.solution(ingredient as int[])

        then:
        solution == result

        where:
        ingredient                        | result
        [2, 1, 1, 2, 3, 1, 2, 3, 1]       | 2
        [1, 3, 2, 1, 2, 1, 3, 1, 2]       | 0
        [1, 1, 3, 2, 1, 2, 3, 1, 1, 1, 2] | 1
    }
}
