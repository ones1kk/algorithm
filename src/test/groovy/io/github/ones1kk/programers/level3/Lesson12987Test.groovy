package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson12987Test extends Specification {

    def "숫자 게임"() {
        when:
        def solution = Lesson12987.solution(a as int[], b as int[])

        then:
        solution == result as int

        where:
        a            | b            || result
        [5, 1, 3, 7] | [2, 2, 6, 8] || 3
        [2, 2, 2, 2] | [1, 1, 1, 1] || 0
    }
}
