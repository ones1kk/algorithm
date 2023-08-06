package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson12921Test extends Specification {

    def "소수 찾기"() {
        when:
        def solution = Lesson12921.solution(n as int)

        then:
        solution == result as int

        where:
        n  | result
        10 | 4
        5  | 3
    }
}
