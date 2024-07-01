package io.github.ones1kk.study.book.do_it.week2.day04


import spock.lang.Specification

class Class013Test extends Specification {

    def "문제013"() {
        when:
        def solution = Class013.resolve(arr as int[])

        then:
        solution == result as int[]

        where:
        arr                                                        || result
        [1, -1, 0, 0, 0, 1, 1, -1, -1, 2, -2, 0, 0, 0, 0, 0, 0, 0] || [-1, 1, 0, -1, -1, 1, 1, -2, 2, 0]
    }
}

