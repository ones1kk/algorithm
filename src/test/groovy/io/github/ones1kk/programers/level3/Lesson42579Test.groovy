package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson42579Test extends Specification {

    def "베스트앨범"() {
        when:
        def solution = Lesson42579.solution(genres as String[], plays as int[])

        then:
        solution == result as int[]

        where:
        genres                                                  | plays                            | result
        ["classic", "pop", "classic", "classic", "pop"]         | [500, 600, 150, 800, 2500]       | [4, 1, 3, 0]
        ["classic", "classic", "classic", "classic", "pop"]     | [50, 60, 100, 30, 8000]          | [4, 2, 1]
        ["classic", "pop", "classic", "classic"]                | [800, 600, 150, 800]             | [0, 3, 1]
        ["pop", "pop", "pop", "rap", "rap"]                     | [45, 50, 40, 60, 70]             | [1, 0, 4, 3]
        ["classic", "pop", "classic", "classic", "pop"]         | [500, 600, 150, 800, 2500]       | [4, 1, 3, 0]
        ["classic", "pop", "classic", "classic", "pop", "test"] | [500, 600, 150, 800, 2500, 100]  | [4, 1, 3, 0, 5]
        ["classic"]                                             | [300]                            | [0]
    }
}
