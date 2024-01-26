package io.github.ones1kk.programers.series.backtracking.day01

import spock.lang.Specification

class Lesson43164Test extends Specification {

    def "여행경로"() {
        when:
        def solution = Lesson43164.solution(tickets as String[][])

        then:
        solution == result as String[]

        where:
        tickets                                                        || result
        [["ICN", "A"], ["A", "B"], ["A", "C"], ["C", "A"], ["B", "D"]] || ["ICN", "A", "C", "A", "B", "D"]
        [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]                                 || ["ICN", "JFK", "HND", "IAD"]
        [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL", "SFO"]] || ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
    }
}
