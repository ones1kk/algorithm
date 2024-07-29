package io.github.ones1kk.study.book.do_it.week03.day01


import io.github.ones1kk.study.book.do_it.week3.day01.Class018
import spock.lang.Specification

class Class018Test extends Specification {

    def "문제018"() {
        when:
        def solution = Class018.resolve(n as int, k as int, arr as int[][])

        then:
        solution == result as int

        where:
        n | k | arr                                                              || result
        6 | 5 | [[1, 2], [2, 5], [5, 1], [3, 4], [4, 6]]                         || 2
        6 | 8 | [[1, 2], [2, 5], [5, 1], [3, 4], [4, 6], [5, 4], [2, 4], [2, 3]] || 1
    }
}

