package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson132265Test extends Specification {

    def "롤케이크 자르기"() {
        when:
        def solution = Lesson132265.solution(topping as int[])

        then:
        solution == result as int

        where:
        topping                  || result
        [1, 2, 1, 3, 1, 4, 1, 2] || 2
        [1, 2, 3, 1, 4]          || 0
    }
}
