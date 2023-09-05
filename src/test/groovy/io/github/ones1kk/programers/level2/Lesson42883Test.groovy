package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42883Test extends Specification {

    def "큰 수 만들기"() {
        when:
        def solution = Lesson42883.solution(number as String, k as int)

        then:
        solution == result as String

        where:
        number       | k | result
        "1924"       | 2 | "94"
        "1231234"    | 3 | "3234"
        "4177252841" | 4 | "775841"
    }
}
