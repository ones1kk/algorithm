package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson77484Test extends Specification {

    def "로또의 최고 순위와 최저 순위"() {
        when:
        def solution = Lesson77484.solution(lottos as int[], win_nums as int[])

        then:
        solution == result as int[]

        where:
        lottos                | win_nums                 | result
        [44, 1, 0, 0, 31, 25] | [31, 10, 45, 1, 6, 19]   | [3, 5]
        [0, 0, 0, 0, 0, 0]    | [38, 19, 20, 40, 15, 25] | [1, 6]
        [45, 4, 35, 20, 3, 9] | [20, 9, 3, 45, 4, 35]    | [1, 1]
    }
}
