package io.github.ones1kk.study.book.do_it.week1.day05

import io.github.ones1kk.study.book.do_it.week1.day05.Class007
import spock.lang.Specification

class Class007Test extends Specification {

    def "문제007"() {
        when:
        def solution = Class007.resolve(m as int, arr as int[])

        then:
        solution == result as int

        where:
        m | arr                || result
        9 | [2, 7, 4, 1, 5, 3] || 2

    }
}
