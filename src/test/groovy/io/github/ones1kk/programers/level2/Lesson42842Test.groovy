package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42842Test extends Specification {

    def "카펫"() {
        when:
        def solution = Lesson42842.solution(brown as int, yellow as int)

        then:
        solution == result as int[]

        where:
        brown | yellow | result
        10    | 2      | [4, 3]
        8     | 1      | [3, 3]
        24    | 24     | [8, 6]
        4004  | 999999 | [1003, 1001]
    }
}
