package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12924Test extends Specification {

    def "숫자의 표현"() {
        when:
        def solution = Lesson12924.solution(n as int)

        then:
        solution == result

        where:
        n  | result
        15 | 4
    }
}
