package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42586Test extends Specification {

    def "기능 개발"() {
        when:
        def solution = Lesson42586.solution(progresses as int[], speeds as int[])

        then:
        solution == result as int[]

        where:
        progresses               | speeds             | result
        [93, 30, 55]             | [1, 30, 5]         | [2, 1]
        [95, 90, 99, 99, 80, 99] | [1, 1, 1, 1, 1, 1] | [1, 3, 2]
        [99, 99, 99, 90, 90, 90] | [1, 1, 1, 1, 1, 1] | [3, 3]
    }
}
