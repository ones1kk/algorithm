package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson17677Test extends Specification {

    def "[1차] 뉴스 클러스터링"() {
        when:
        def solution = Lesson17677.solution(str1 as String, str2 as String)

        then:
        solution == result as int

        where:
        str1        | str2          | result
        "FRANCE"    | "french"      | 16384
        "handshake" | "shake hands" | 65536
        "aa1+aa2"   | "AAAA12"      | 43690
        "E=M*C^2"   | "e=m*c^2"     | 65536
    }
}
