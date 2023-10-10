package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson67258Test extends Specification {

    def "[카카오 인턴] 보석 쇼핑"() {
        when:
        def solution = Lesson67258.solution(gems as String[])

        then:
        solution == result as int[]

        where:
        gems                                                                | result
        ["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"] | [3, 7]
        ["AA", "AB", "AC", "AA", "AC"]                                      | [1, 3]
        ["XYZ", "XYZ", "XYZ"]                                               | [1, 1]
        ["ZZZ", "YYY", "NNNN", "YYY", "BBB"]                                | [1, 5]

    }
}
