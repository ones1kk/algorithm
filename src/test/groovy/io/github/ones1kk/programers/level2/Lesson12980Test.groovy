package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12980Test extends Specification {

    def "점프와 순간 이동"() {
        when:
        def solution = Lesson12980.solution(N as int)

        then:
        solution == result as int

        where:
        N    | result
        1    | 1
        5    | 2
        6    | 2
        5000 | 5
    }
}
