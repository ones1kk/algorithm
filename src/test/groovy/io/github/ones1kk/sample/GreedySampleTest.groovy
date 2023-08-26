package io.github.ones1kk.sample

import spock.lang.Specification

class GreedySampleTest extends Specification {

    def "거스름돈 문제"() {
        when:
        def solution = GreedySample.solution1(n as int)

        then:
        solution == result as int

        where:
        n    | result
        1260 | 6
    }

    def "1이 될 때까지"() {
        when:
        def solution = GreedySample.solution2(n as int, k as int)

        then:
        solution == result as int

        where:
        n  | k | result
        25 | 3 | 6
    }

}
