package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson42840Test extends Specification {

    def "모의고사"() {
        when:
        def solution = Lesson42840.solution(answers as int[])

        then:
        solution == result as int[]

        where:
        answers         | result
        [1, 2, 3, 4, 5] | [1]
        [1, 3, 2, 4, 2] | [1, 2, 3]
    }
}
