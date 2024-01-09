package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson12979Test extends Specification {

    def "기지국 설치"() {
        when:
        def solution = Lesson12979.solution(n as int, stations as int[], w as int)

        then:
        solution == result as int

        where:
        n  | stations   | w | result
        13 | [3, 7, 11] | 1 | 4
        6  | [3]        | 2 | 1
        16 | [1, 16]    | 2 | 2
        6  | [4]        | 2 | 1
        11 | [1, 4]     | 1 | 2
        11 | [4, 11]    | 1 | 3
        16 | [9]        | 2 | 3
    }
}
