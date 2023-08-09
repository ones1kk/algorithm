package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12939Test extends Specification {

    def "최댓값과 최솟값"() {
        when:
        def solution = Lesson12939.solution(s as String)

        then:
        solution == result

        where:
        s             | result
        "1 2 3 4"     | "1 4"
        "-1 -2 -3 -4" | "-4 -1"
        "-1 -1"       | "-1 -1"
    }
}
