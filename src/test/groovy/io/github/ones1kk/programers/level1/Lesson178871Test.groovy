package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson178871Test extends Specification {

    def "달리기 경주"() {
        when:
        def solution = Lesson178871.solution(players as String[], callings as String[])

        then:
        solution == result as String[];

        where:
        players                               | callings                       | result
        ["mumu", "soe", "poe", "kai", "mine"] | ["kai", "kai", "mine", "mine"] | ["mumu", "kai", "mine", "soe", "poe"]
    }
}
