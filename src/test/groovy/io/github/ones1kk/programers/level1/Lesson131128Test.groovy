package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson131128Test extends Specification {

    def "숫자 짝궁"() {
        when:
        def solution = Lesson131128.solution(X as String, Y as String)

        then:
        solution == result as String

        where:
        X       | Y        | result
        "100"   | "2345"   | "-1"
        "100"   | "203045" | "0"
        "100"   | "123450" | "10"
        "12321" | "42531"  | "321"
        "5525"  | "1255"   | "552"
        "1002"  | "30005"  | "0"
    }
}
