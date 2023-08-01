package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson64061Test extends Specification {

    def "크레인 인형 뽑기"() {
        when:
        def solution = Lesson64061.solution(board as int[][], move as int[])

        then:
        solution == result

        where:
        board                                                                                 | move                     | result
        [[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]] | [1, 5, 3, 5, 1, 2, 1, 4] | 4
    }
}
