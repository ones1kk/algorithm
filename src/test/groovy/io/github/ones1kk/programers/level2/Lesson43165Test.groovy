package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson43165Test extends Specification {

    def "타겟 넘버"() {
        when:
        def solution = Lesson43165.solution(numbers as int[], target as int)

        then:
        solution == result as int

        where:
        numbers         | target | result
        [1, 1, 1, 1, 1] | 3      | 5
        [4, 1, 2, 1]    | 4      | 2
    }
}
