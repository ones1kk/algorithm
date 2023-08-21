package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson64065Test extends Specification {

    def "튜플"() {
        when:
        def solution = Lesson64065.solution(s as String)

        then:
        solution == result as int[]

        where:
        s                               | result
        "{{2},{2,1},{2,1,3},{2,1,3,4}}" | [2, 1, 3, 4]
        "{{1,2,3},{2,1},{1,2,4,3},{2}}" | [2, 1, 3, 4]
        "{{20,111},{111}}"              | [111, 20]
        "{{123}}"                       | [123]
        "{{4,2,3},{3},{2,3,4,1},{2,3}}" | [3, 2, 4, 1]
    }
}
