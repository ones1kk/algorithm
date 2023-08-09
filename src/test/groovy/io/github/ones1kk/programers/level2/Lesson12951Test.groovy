package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson12951Test extends Specification {

    def "JadenCase 문자열 만들기"() {
        when:
        def solution = Lesson12951.solution(s as String)

        then:
        solution == result

        where:
        s                       | result
        "3people unFollowed me" | "3people Unfollowed Me"
        "for the last week"     | "For The Last Week"
        "1HELLO 1WORLD"         | "1hello 1world"
        "aaaaa aaa aaaaaaa"     | "Aaaaa Aaa Aaaaaaa"
        "Hi my name is   Wish"  | "Hi My Name Is   Wish"
    }
}
