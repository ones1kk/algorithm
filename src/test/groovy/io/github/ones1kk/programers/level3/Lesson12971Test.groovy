package io.github.ones1kk.programers.level3

import spock.lang.Specification

class Lesson12971Test extends Specification {

    def "스티커 모으기"() {
        when:
        def solution = Lesson12971.solution(sticker as int[])

        then:
        solution == result as int

        where:
        sticker                     | result
        [14, 6, 5, 11, 3, 9, 2, 10] | 36
        [1, 3, 2, 5, 4]             | 8
    }
}
