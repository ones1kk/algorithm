package io.github.ones1kk.study.book.do_it.week2.day07


import spock.lang.Specification

class Class017Test extends Specification {

    def "문제017"() {
        when:
        def solution = Class017.resolve(arr as int[], k as int)

        then:
        solution == result as int

        where:
        arr             | k || result
        [4, 1, 2, 3, 5] | 2 || 2
    }
}

