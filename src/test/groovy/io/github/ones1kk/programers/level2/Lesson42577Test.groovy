package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson42577Test extends Specification {

    def "전화번호 목록"() {
        when:
        def solution = Lesson42577.solution(phone_book as String[])

        then:
        solution == result as boolean

        where:
        phone_book                         | result
        ["119", "97674223", "1195524421"]  | false
        ["123", "456", "789"]              | true
        ["12", "123", "1235", "567", "88"] | false
    }
}
