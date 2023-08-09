package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12941Test extends Specification {

    def "최솟값 만들기"() {
        when:
        def solution = Lesson12941.solution(A as int[], B as int[])

        then:
        solution == answer

        where:
        A         | B         | answer
        [1, 4, 2] | [5, 4, 4] | 29
        [1, 2]    | [3, 4]    | 10
    }
}
