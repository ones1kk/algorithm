package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson155652Test extends Specification {

    def "둘만의 암호"() {
        when:
        def solution = Lesson155652.solution(s as String, skip as String, index as int)

        then:
        solution == result

        where:
        s       | skip   | index | result
        "aukks" | "wbqd" | 5     | "happy"
    }
}
