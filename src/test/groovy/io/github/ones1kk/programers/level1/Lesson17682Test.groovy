package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson17682Test extends Specification {

    def "[1차] 다트 게임"() {
        when:
        def solution = Lesson17682.solution(dartResult as String)

        then:
        solution == answer

        where:
        dartResult | answer
        "1S2D*3T"  | 37
        "1D2S#10S" | 9
        "1D2S0T"   | 3
        "1S*2T*3S" | 23
        "1D#2S*3S" | 5
        "1T2D3D#"  | -4
        "1D2S3T*"  | 59
    }
}
