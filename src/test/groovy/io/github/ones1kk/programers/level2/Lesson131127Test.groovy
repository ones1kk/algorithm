package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson131127Test extends Specification {

    def "할인 행사"() {
        when:
        def solution = Lesson131127.solution(want as String[], number as int[], discount as String[])

        then:
        solution == result as int

        where:
        want                                       | number          | discount                                                                                                                       | result
        ["banana", "apple", "rice", "pork", "pot"] | [3, 2, 2, 2, 1] | ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"] | 3
        ["apple"]                                  | [10]            | ["banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"]                           | 0
    }
}
