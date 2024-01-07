package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson1844Test extends Specification {

    def "게임 맵 최단거리"() {
        when:
        def solution = Lesson1844.solution(maps as int[][])

        then:
        solution == result as int

        where:
        maps                                                                                  | result
        [[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 0, 1], [0, 0, 0, 0, 1]] | 11
        [[1, 0, 1, 1, 1], [1, 0, 1, 0, 1], [1, 0, 1, 1, 1], [1, 1, 1, 0, 0], [0, 0, 0, 0, 1]] | -1
    }
}
