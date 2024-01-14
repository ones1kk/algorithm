package io.github.ones1kk.beakjoon.suggestion.day02

import spock.lang.Specification

class Problem11403Test extends Specification {

    def "경로 찾기"() {
        when:
        def solution = Problem11403.solve(arg as int[][])

        then:
        solution == result as int[][]


        where:
        arg                                                                                                                                                               || result
        [[0, 1, 0], [0, 0, 1], [1, 0, 0]]                                                                                                                                 || [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
        [[0, 0, 0, 1, 0, 0, 0], [0, 0, 0, 0, 0, 0, 1], [0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 1, 1, 0], [1, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 1], [0, 0, 1, 0, 0, 0, 0]] || [[1, 0, 1, 1, 1, 1, 1], [0, 0, 1, 0, 0, 0, 1], [0, 0, 0, 0, 0, 0, 0], [1, 0, 1, 1, 1, 1, 1], [1, 0, 1, 1, 1, 1, 1], [0, 0, 1, 0, 0, 0, 1], [0, 0, 1, 0, 0, 0, 0]]
    }
}
