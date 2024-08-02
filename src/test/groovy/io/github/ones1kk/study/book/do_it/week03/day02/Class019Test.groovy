package io.github.ones1kk.study.book.do_it.week03.day02

import io.github.ones1kk.study.book.do_it.week3.day02.Class019
import spock.lang.Specification

class Class019Test extends Specification {

    def "문제019"() {
        when:
        def solution = Class019.resolve(n as int, k as int, arr as int[][])

        then:
        solution == result as int

        where:
        n | k | arr                                                              || result
        5 | 5 | [[0, 1], [1, 2], [2, 3], [3, 0][1, 4]]                           || 1
        8 | 8 | [[1, 7], [3, 7], [4, 7], [3, 4], [4, 6], [3, 5], [0, 4], [2, 7]] || 1
    }

}

