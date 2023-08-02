package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson42576Test extends Specification {

    def "완주하지 못한 선수"() {
        when:
        def solution = Lesson42576.solution(participant as String[], completion as String[])

        then:
        solution == result

        where:
        participant                                       | completion                               | result
        ["leo", "kiki", "eden"]                           | ["eden", "kiki"]                         | "leo"
        ["marina", "josipa", "nikola", "vinko", "filipa"] | ["josipa", "filipa", "marina", "nikola"] | "vinko"
        ["mislav", "stanko", "mislav", "ana"]             | ["stanko", "ana", "mislav"]              | "mislav"
    }
}
