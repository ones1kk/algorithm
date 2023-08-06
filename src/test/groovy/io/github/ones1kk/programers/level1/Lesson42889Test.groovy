package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson42889Test extends Specification {

    def "실패율"() {
        when:
        def solution = Lesson42889.solution(n as int, stages as int[])

        then:
        solution == result as int[]

        where:
        n | stages                   | result
        5 | [2, 1, 2, 6, 2, 4, 3, 3] | [3, 4, 2, 1, 5]
        4 | [4, 4, 4, 4, 4]          | [4, 1, 2, 3]
    }
}
