package io.github.ones1kk.beakjoon.suggestion.day02

import spock.lang.Specification

class Problem1789Test extends Specification {

    def "수들의 합"() {
        when:
        def solution = Problem1789.solve(arg as long)

        then:
        solution == result as int


        where:
        arg || result
        200 || 19
    }
}


