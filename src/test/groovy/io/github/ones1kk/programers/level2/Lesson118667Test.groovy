package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson118667Test extends Specification {

    def "두 큐 합 같게 만들기"() {
        when:
        def solution = Lesson118667.solution(queue1 as int[], queue2 as int[])

        then:
        solution == result as int

        where:
        queue1       | queue2        | result
        [3, 2, 7, 2] | [4, 6, 5, 1]  | 2
        [1, 2, 1, 2] | [1, 10, 1, 2] | 7
        [1, 1]       | [1, 5]        | -1
    }
}
