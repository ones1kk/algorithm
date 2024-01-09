package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson42884Test extends Specification {

    def "단속카메라"() {
        when:
        def solution = Lesson42884.solution(routes as int[][])

        then:
        solution == result as int

        where:
        routes                                                               | result
        [[-20, -15], [-14, -5], [-18, -13], [-5, -3]]                        | 2
        [[-100, 100], [50, 170], [150, 200], [-50, -10], [10, 20], [30, 40]] | 4
    }
}
