package io.github.ones1kk.programers.series.backtracking.day01

import spock.lang.Specification

class Lesson172927Test extends Specification {

    def "광물 캐기"() {
        when:
        def solution = Lesson172927.solution(picks as int[], minerals as String[])

        then:
        solution == result as int

        where:
        picks     | minerals                                                                                                                                               || result
        [0, 0, 1] | ["stone", "stone", "stone", "stone", "stone", "diamond"]                                                                                               || 5
        [2, 1, 0] | ["diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond", "diamond", "diamond", "diamond", "diamond"] || 15
        [1, 3, 2] | ["diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"]                                                                          || 12
        [0, 1, 1] | ["diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"]                                             || 50
    }
}
