package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson136798Test extends Specification {

    def "기사단원의 무기"() {
        when:
        def solution = Lesson136798.solution(number as int, limit as int, power as int)

        then:
        solution == result

        where:
        number | limit | power | result
        5      | 3     | 2     | 10
        10     | 3     | 2     | 21
    }
}
