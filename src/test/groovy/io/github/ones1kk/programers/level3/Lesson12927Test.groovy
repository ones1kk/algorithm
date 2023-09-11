package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson12927Test extends Specification {

    def "야근 지수"() {
        when:
        def solution = Lesson12927.solution(n as int, works as int[])

        then:
        solution == result as long

        where:
        works               | n  | result
        [4, 3, 3]           | 4  | 12
        [2, 1, 2]           | 1  | 6
        [1, 1]              | 3  | 0
        [2, 15, 22, 55, 55] | 99 | 580
    }
}
