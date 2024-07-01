package io.github.ones1kk.study.book.do_it.week2.day03


import spock.lang.Specification

class Class012Test extends Specification {

    def "문제012"() {
        when:
        def solution = Class012.resolve(arr as int[])

        then:
        solution == result as int[]

        where:
        arr          || result
        [3, 5, 2, 7] || [5, 7, 7, -1]
        [9, 5, 4, 8] || [-1, 8, 8, -1]
    }
}


