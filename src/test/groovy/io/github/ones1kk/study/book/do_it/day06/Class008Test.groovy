package io.github.ones1kk.study.book.do_it.day06


import spock.lang.Specification

class Class008Test extends Specification {

    def "문제008"() {
        when:
        def solution = Class008.resolve(arr as int[])

        then:
        solution == result as int

        where:
        arr                             || result
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] || 8
    }
}
