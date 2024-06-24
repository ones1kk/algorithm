package io.github.ones1kk.study.book.do_it.week1.day01

import io.github.ones1kk.study.book.do_it.week1.day01.Class002
import spock.lang.Specification

class Class002Test extends Specification {

    def "문제002"() {
        when:
        def solution = Class002.resolve(scores as int[])

        then:
        solution == result as double

        where:
        scores             || result
        [40, 80, 60]       || 75.0
        [3, 10]            || 65.0
        [1, 100, 100, 100] || 75.25
        [1, 2, 4, 8, 16]   || 38.75
    }
}
