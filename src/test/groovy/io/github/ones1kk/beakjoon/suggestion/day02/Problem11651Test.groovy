package io.github.ones1kk.beakjoon.suggestion.day02

import spock.lang.Specification

class Problem11651Test extends Specification {

    def "좌표 정렬하기 2"() {
        when:
        def solution = Problem11651.solve(arg as int[][])

        then:
        solution == result as int[][]


        where:
        arg                                       || result
        [[0, 4], [1, 2], [1, -1], [2, 2], [3, 3]] || [[1, -1], [1, 2], [2, 2], [3, 3], [0, 4]]
    }
}


