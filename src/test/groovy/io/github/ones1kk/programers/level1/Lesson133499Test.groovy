package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson133499Test extends Specification {

    def "옹알이(2)"() {
        when:
        def solution = Lesson133499.solution(babbling as String[])

        then:
        solution == result as int

        where:
        babbling                                       | result
        ["aya", "yee", "u", "maa"]                     | 1
        ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"] | 2
    }
}
