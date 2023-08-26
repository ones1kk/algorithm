package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42583Test extends Specification {

    def "다리를 지나는 트럭"() {
        when:
        def solution = Lesson42583.solution(bridge_length as int, weight as int, truck_weights as int[])

        then:
        solution == result as int

        where:
        bridge_length | weight | truck_weights                            | result
        2             | 10     | [7, 4, 5, 6]                             | 8
        100           | 100    | [10]                                     | 101
        100           | 100    | [10, 10, 10, 10, 10, 10, 10, 10, 10, 10] | 110
    }
}
