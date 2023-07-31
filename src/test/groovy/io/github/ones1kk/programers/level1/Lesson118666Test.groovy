package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson118666Test extends Specification {

    def "성격 유형 검사하기"() {
        when:
        def expected = Lesson118666.solution(survey as String[], choices as int[])

        then:
        expected == result

        where:
        survey                         | choices         | result
        ["AN", "CF", "MJ", "RT", "NA"] | [5, 3, 2, 7, 5] | "TCMA"
        ["TR", "RT", "TR"]             | [7, 1, 3]       | "RCJA"
    }
}

