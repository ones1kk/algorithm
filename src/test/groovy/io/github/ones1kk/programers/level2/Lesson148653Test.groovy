package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson148653Test extends Specification {

    def "마법의 엘리베이터"() {
        when:
        def solution = Lesson148653.solution(storey as int)

        then:
        solution == result as int

        where:
        storey || result
        16     || 6
        2554   || 16
    }
}
