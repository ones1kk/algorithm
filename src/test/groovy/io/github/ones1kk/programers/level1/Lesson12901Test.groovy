package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson12901Test extends Specification {

    def "2016"() {
        when:
        def solution = Lesson12901.solution(a as int, b as int)

        then:
        solution == result

        where:
        a | b  | result
        5 | 24 | "TUE"

    }
}
