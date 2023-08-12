package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson76502Test extends Specification {

    def "괄호 회전하기"() {
        when:
        def solution = Lesson76502.solution(s as String)

        then:
        solution == result as int

        where:
        s        | result
        "[](){}" | 3
        "}]()[{" | 2
        "[)(]"   | 0
        "}}}"    | 0
        "{(["    | 0
    }
}
