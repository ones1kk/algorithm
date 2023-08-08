package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson42748Test extends Specification {

    def "K번째수"() {
        when:
        def solution = Lesson42748.solution(array as int[], commands as int[][])

        then:
        solution == result as int[]

        where:
        array                 | commands                          | result
        [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3]
    }
}
