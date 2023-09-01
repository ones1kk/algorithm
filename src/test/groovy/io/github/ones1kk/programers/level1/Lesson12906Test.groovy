package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson12906Test extends Specification {

    def "같은 숫자는 싫어"() {
        when:
        def solution = Lesson12906.solution(arr as int[])

        then:
        solution == result as int[]

        where:
        arr                   | result
        [1, 1, 3, 3, 0, 1, 1] | [1, 3, 0, 1]
        [4, 4, 4, 3, 3]       | [4, 3]
    }
}
