package io.github.ones1kk.beakjoon.silver.silver05

import spock.lang.Specification

class Problem2751Test extends Specification {

    def "수 정렬하기 2"() {
        when:
        def solve = Problem2751.solve(arr as int[])

        then:
        solve == result as int[]

        where:
        arr             | result
        [5, 4, 3, 2, 1] | [1, 2, 3, 4, 5]
    }
}
