package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42747Test extends Specification {

    def "H-Index"() {
        when:
        def solution = Lesson42747.solution(citations as int[])

        then:
        solution == result

        where:
        citations        | result
        [25, 8, 5, 3, 3] | 3
        [3, 0, 6, 1, 5]  | 3
        [1, 4, 5]        | 2
        [5, 6, 7]        | 3
    }
}
