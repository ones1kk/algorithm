package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson135808Test extends Specification {

    def "과일 장수"() {
        when:
        def solution = Lesson135808.solution(k as int, m as int, score as int[])

        then:
        solution == result as int

        where:
        k | m | score                                | result
        3 | 4 | [1, 2, 3, 1, 2, 3, 1]                | 8
        4 | 3 | [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2] | 33
    }
}
