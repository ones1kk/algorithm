package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42885Test extends Specification {

    def "구명보트"() {
        when:
        def solution = Lesson42885.solution(people as int[], limit as int)

        then:
        solution == result as int

        where:
        people           | limit | result
        [70, 50, 80, 50] | 100   | 3
        [70, 80, 50]     | 100   | 3
        [30, 40, 50, 60] | 100   | 2
    }
}
