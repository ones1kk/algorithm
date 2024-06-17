package io.github.ones1kk.study.book.do_it.day04


import spock.lang.Specification

class Class005Test extends Specification {

    def "문제005"() {
        when:
        def solution = Class005.resolve(n as int, m as int, arr as int[])

        then:
        solution == result as long

        where:
        n | m  | arr             || result
        5 | 3 || [1, 2, 3, 1, 2] || 7
    }
}
