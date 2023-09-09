package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson12938Test extends Specification {

    def "최고의 집합"() {
        when:
        def solution = Lesson12938.solution(n as int, s as int)

        then:
        solution == result as int[]

        where:
        n | s  | result
        3 | 11 | [3, 4, 4]
        2 | 9  | [4, 5]
        2 | 1  | [-1]
        2 | 8  | [4, 4]
    }
}
