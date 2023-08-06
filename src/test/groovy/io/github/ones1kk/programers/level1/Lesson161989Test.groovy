package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson161989Test extends Specification {

    def "덧칠하기"() {
        when:
        def solution = Lesson161989.solution(n as int, m as int, section as int[])

        then:
        solution == result

        where:
        n | m | section      | result
        8 | 4 | [2, 3, 6]    | 2
        5 | 4 | [1, 3]       | 1
        4 | 1 | [1, 2, 3, 4] | 4
        4 | 2 | [3, 4]       | 1
    }
}
