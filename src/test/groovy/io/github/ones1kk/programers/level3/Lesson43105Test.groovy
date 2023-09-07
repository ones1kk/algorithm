package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson43105Test extends Specification {

    def "정수 삼각형"() {
        when:
        def solution = Lesson43105.solution(triangle as int[][])

        then:
        solution == result as int;

        where:
        triangle                                                | result
        [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]] | 30
    }
}
