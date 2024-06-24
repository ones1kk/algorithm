package io.github.ones1kk.study.book.do_it.week1.day01

import io.github.ones1kk.study.book.do_it.week1.day01.Class001
import spock.lang.Specification

class Class001Test extends Specification {

    def "문제001"() {
        when:
        def solution = Class001.resolve(count as int, num as long)

        then:
        solution == result as int

        where:
        count | num         || result
        1     | 1           || 1
        5     | 54321       || 15
        6     | 700000      || 7
        11    | 10987654321 || 46
    }
}
