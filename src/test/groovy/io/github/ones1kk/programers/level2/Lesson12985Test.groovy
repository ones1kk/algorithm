package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12985Test extends Specification {

    def "예상 대진표"() {
        when:
        def solution = Lesson12985.solution(N as int, A as int, B as int)

        then:
        solution == answer as int

        where:
        N | A | B | answer
        8 | 4 | 7 | 3
    }
}
