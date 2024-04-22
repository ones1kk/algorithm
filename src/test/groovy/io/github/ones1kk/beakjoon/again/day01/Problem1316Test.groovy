package io.github.ones1kk.beakjoon.again.day01


import spock.lang.Specification

class Problem1316Test extends Specification {

    def "그룹 단어 체커"() {
        when:
        def solve = Problem1316.solve(words)

        then:
        solve === result as Integer

        where:
        words                                      || result
        (String[]) ["happy", "new", "year"]        || 3
        (String[]) ["aba", "abab", "abcabc", "a"]  || 1
        (String[]) ["ab", "aa", "aca", "ba", "bb"] || 4
        (String[]) ["yzyzy", "zyzyz"]              || 0
    }
}
