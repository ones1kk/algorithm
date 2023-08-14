package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson87946Test extends Specification {

    def "피로도"() {
        when:
        def solution = Lesson87946.solution(k as int, dungeons as int[][])

        then:
        solution == result as int

        where:
        k  | dungeons                                  | result
        80 | [[80, 20], [50, 40], [30, 10]]            | 3
        8  | [[7, 3], [5, 4], [1, 1]]                  | 3
        10 | [[9, 2], [10, 3], [7, 3], [5, 4], [1, 1]] | 4
    }
}
