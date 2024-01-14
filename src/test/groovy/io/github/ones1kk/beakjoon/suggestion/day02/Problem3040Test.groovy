package io.github.ones1kk.beakjoon.suggestion.day02

import spock.lang.Specification

class Problem3040Test extends Specification {

    def "백설 공주와 일곱 난쟁이"() {
        when:
        def solution = Problem3040.solve(arg as int[])

        then:
        solution == result as Integer[]


        where:
        arg                                || result
        [7, 8, 10, 13, 15, 19, 20, 23, 25] || [7, 8, 10, 13, 19, 20, 23]
        [8, 6, 5, 1, 37, 30, 28, 22, 36]   || [8, 6, 5, 1, 30, 28, 22]
    }
}
