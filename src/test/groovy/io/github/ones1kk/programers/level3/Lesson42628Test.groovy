package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson42628Test extends Specification {

    def "이중우선순위큐"() {
        when:
        def solution = Lesson42628.solution(operations as String[])

        then:
        solution == result as int[]

        where:
        operations                                                                  | result
        ["I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"]                  | [0, 0]
        ["I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"] | [333, -45]
    }
}
