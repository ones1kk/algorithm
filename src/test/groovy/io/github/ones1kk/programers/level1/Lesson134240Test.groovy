package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson134240Test extends Specification {

    def "푸드 파이트 대회"() {
        when:
        def solution = Lesson134240.solution(food as int[])

        then:
        solution == result

        where:
        food         | result
        [1, 3, 4, 6] | "1223330333221"
        [1, 7, 1, 2] | "111303111"
    }
}
