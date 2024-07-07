package io.github.ones1kk.study.book.do_it.week2.day05


import spock.lang.Specification

class Class014Test extends Specification {

    def "문제014"() {
        when:
        def solution = Class014.resolve(arr as int[])

        then:
        solution == result as int[]

        where:
        arr              || result
        [5, 2, 3, 4, 1,] || [1, 2, 3, 4, 5]
    }
}

