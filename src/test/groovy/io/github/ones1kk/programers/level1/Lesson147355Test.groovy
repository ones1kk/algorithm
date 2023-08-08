package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson147355Test extends Specification {

    def "크기가 작은 부분 문자열"() {
        when:
        def solution = Lesson147355.solution(t as String, p as String)

        then:
        solution == result

        where:
        t                        | p       | result
        "3141592"                | "271"   | 2
        "500220839878"           | "7"     | 8
        "10203"                  | "15"    | 3
        "1221351118575141528544" | "12511" | 3
    }
}
