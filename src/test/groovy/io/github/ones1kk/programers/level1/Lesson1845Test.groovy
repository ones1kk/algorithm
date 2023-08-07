package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson1845Test extends Specification {

    def "포켓몬"() {
        when:
        def solution = Lesson1845.solution(nums as int[])

        then:
        solution == result as int

        where:
        nums               | result
        [3, 1, 2, 3]       | 2
        [3, 3, 3, 2, 2, 4] | 3
        [3, 3, 3, 2, 2, 2] | 2
    }
}
