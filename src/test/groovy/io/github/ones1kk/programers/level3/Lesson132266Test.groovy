package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson132266Test extends Specification {

    def "부대복귀"() {
        when:
        def solution = Lesson132266.solution(n as int, roads as int[][], sources as int[], destination as int)

        then:
        solution == result as int[]

        where:
        n | roads                                    | sources   | destination | result
        3 | [[1, 2], [2, 3]]                         | [2, 3]    | 1           | [1, 2]
        5 | [[1, 2], [1, 4], [2, 4], [2, 5], [4, 5]] | [1, 3, 5] | 5           | [2, -1, 0]

    }
}
