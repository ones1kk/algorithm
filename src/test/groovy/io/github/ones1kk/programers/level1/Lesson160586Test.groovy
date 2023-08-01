package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson160586Test extends Specification {

    def "대충 만든 자판"() {
        when:
        def solution = Lesson160586.solution(keymap as String[], targets as String[])

        then:
        solution == result as int[]

        where:
        keymap             | targets          | result
        ["ABACD", "BCEFD"] | ["ABCD", "AABB"] | [9, 4]
        ["AA"]             | ["B"]            | [-1]
        ["AGZ", "BSSS"]    | ["ASA", "BGZ"]   | [4, 6]
        ["BC", "CDB"]      | ["BB"]           | [2]
        ["ABCE"]           | ["ABDE"]         | [-1]
    }
}
