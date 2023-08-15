package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42584Test extends Specification {

    def "주식가격"() {
        when:
        def solution = Lesson42584.solution(prices as int[])

        then:
        solution == result as int[]

        where:
        prices          | result
        [1, 2, 3, 2, 3] | [4, 3, 1, 1, 0]
        [3, 2, 1, 2, 3] | [1, 1, 2, 1, 0]
    }
}
