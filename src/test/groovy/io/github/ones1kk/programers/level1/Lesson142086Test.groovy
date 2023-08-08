package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson142086Test extends Specification {

    def "가장 가까운 같은 글자"() {
        when:
        def solution = Lesson142086.solution(s as String)

        then:
        solution == result as int[]

        where:
        s        | result
        "banana" | [-1, -1, -1, 2, 2, 2]
        "foobar" | [-1, -1, 1, -1, -1, -1]
    }
}
