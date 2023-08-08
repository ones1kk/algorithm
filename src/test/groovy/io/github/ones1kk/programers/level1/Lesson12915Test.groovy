package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson12915Test extends Specification {

    def "문자열 내 마음대로 정렬하기"() {
        when:
        def solution = Lesson12915.solution(strings as String[], n as int)

        then:
        solution == result as String[]

        where:
        strings                 | n | result
        ["sun", "bed", "car"]   | 1 | ["car", "bed", "sun"]
        ["abce", "abcd", "cdx"] | 2 | ["abcd", "abce", "cdx"]
    }
}
