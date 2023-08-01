package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson67256Test extends Specification {

    def "키패드 누르기"() {
        when:
        def solution = Lesson67256.solution(numbers as int[], hand as String)

        then:
        solution == result

        where:
        numbers                           | hand    | result
        [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5] | "right" | "LRLLLRLLRRL"
        [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2] | "left"  | "LRLLRRLLLRR"
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]    | "right" | "LLRLLRLLRL"
    }
}
