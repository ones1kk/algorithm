package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson49189Test extends Specification {

    def "가장 먼 노드"() {
        when:
        def solution = Lesson49189.solution(n as int, vertex as int[][])

        then:
        solution == result as int

        where:
        n | vertex                                                   | result
        6 | [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]] | 3
    }
}
