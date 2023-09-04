package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12899Test extends Specification {

    def "124 나라의 숫자"() {
        when:
        def solution = Lesson12899.solution(n as int)

        then:
        solution == result as String

        where:
        n | result
        1 | "1"
        2 | "2"
        3 | "4"
        4 | "11"
    }
}
