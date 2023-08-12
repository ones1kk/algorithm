package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson87390Test extends Specification {

    def "n^2 배열 자르기"() {
        when:
        def solution = Lesson87390.solution(n as int, left as int, right as int)

        then:
        solution == result as int[]

        where:
        n | left | right | result
        3 | 2    | 5     | [3, 2, 2, 3]
        4 | 7    | 14    | [4, 3, 3, 3, 4, 4, 4, 4]
    }
}
