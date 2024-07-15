package io.github.ones1kk.study.book.do_it.week2.day06


import spock.lang.Specification

class Class016Test extends Specification {

    def "문제016"() {
        when:
        def solution = Class016.resolve(arr as int[])

        then:
        solution == result as int

        where:
        arr             || result
        [3, 1, 4, 3, 2] || 32
    }
}

