package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson42627Test extends Specification {

    def "디스크 컨트롤러"() {
        when:
        def solution = Lesson42627.solution(jobs as int[][])

        then:
        solution == result as int

        where:
        jobs                        | result
        [[0, 3], [1, 9], [2, 6]]    | 9
        [[0, 3], [10, 1]]           | 2
        [[7, 8], [3, 5], [9, 6]]    | 9
        [[1, 4], [7, 9], [1000, 3]] | 5
        [[0, 1], [2, 2], [2, 3]]    | 2
    }
}
