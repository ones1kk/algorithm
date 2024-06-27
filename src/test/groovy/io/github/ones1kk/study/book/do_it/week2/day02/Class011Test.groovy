package io.github.ones1kk.study.book.do_it.week2.day02


import spock.lang.Specification

class Class011Test extends Specification {

    def "문제011"() {
        when:
        def solution = Class011.resolve(arr as int[])

        then:
        solution == result as String[]

        where:
        arr                      || result
        [4, 3, 6, 8, 7, 5, 2, 1] || ["+", "+", "+", "+", "-", "-", "+", "+", "-", "+", "+", "-", "-", "-", "-", "-"]
        [5, 1, 2, 5, 3, 4]       || ["NO"]
    }
}


