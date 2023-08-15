package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42626Test extends Specification {

    def "더 맵게"() {
        when:
        def solution = Lesson42626.solution(scoville as int[], K as int)

        then:
        solution == result as int

        where:
        scoville             | K | result
        [1, 2, 3, 9, 10, 12] | 7 | 2
        [2, 3]               | 7 | 1
    }
}
