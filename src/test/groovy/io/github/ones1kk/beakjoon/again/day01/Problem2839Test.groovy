package io.github.ones1kk.beakjoon.again.day01


import spock.lang.Specification

class Problem2839Test extends Specification {

    def "설탕 배달"() {
        when:
        def solve = Problem2839.solve(weight)

        then:
        solve === result as Integer

        where:
        weight | result
        18    || 4
        4     || -1
        6     || 2
        9     || 3
        11    || 3
    }
}
