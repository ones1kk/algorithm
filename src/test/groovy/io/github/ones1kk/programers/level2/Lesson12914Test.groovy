package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12914Test extends Specification {

    def "멀리 뛰기"() {
        when:
        def solution = Lesson12914.solution(n as int)

        then:
        solution == result as long

        where:
        n | result
        4 | 5
        3 | 3
    }
}
