package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12911Test extends Specification {

    def "다음 큰 숫자"() {
        when:
        def solution = Lesson12911.solution(n as int)

        then:
        solution == result as int

        where:
        n  | result
        78 | 83
        15 | 23
    }
}
