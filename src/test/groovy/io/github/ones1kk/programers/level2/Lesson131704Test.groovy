package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson131704Test extends Specification {

    def "택배 상자"() {
        when:
        def solution = Lesson131704.solution(order as int[])

        then:
        solution == result as int

        where:
        order           | result
        [4, 3, 1, 2, 5] | 2
        [5, 4, 3, 2, 1] | 5
        [3, 5, 4, 2, 1] | 5
    }
}
