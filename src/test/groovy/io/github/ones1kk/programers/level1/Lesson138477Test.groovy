package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson138477Test extends Specification {

    def "명예의 전당"() {
        when:
        def solution = Lesson138477.mostLikedSolution(k as int, score as int[])

        then:
        solution == result as int[]

        where:
        k | score                                         | result
        3 | [10, 100, 20, 150, 1, 100, 200]               | [10, 10, 10, 20, 20, 100, 100]
        4 | [0, 300, 40, 300, 20, 70, 150, 50, 500, 1000] | [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    }
}
