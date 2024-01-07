package io.github.ones1kk.programers.level3


import spock.lang.Specification

class Lesson43162Test extends Specification {

    def "네트워크"() {
        when:
        def solution = Lesson43162.solution(n as int, computers as int[][])

        then:
        solution == result as long

        where:
        n | computers                         | result
        3 | [[1, 1, 0], [1, 1, 0], [0, 0, 1]] | 2
        3 | [[1, 1, 0], [1, 1, 1], [0, 1, 1]] | 1
    }
}
