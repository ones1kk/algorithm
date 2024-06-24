package io.github.ones1kk.study.book.do_it.week1.day05

import io.github.ones1kk.study.book.do_it.week1.day05.Class006
import spock.lang.Specification

class Class006Test extends Specification {

    def "문제006"() {
        when:
        def solution = Class006.resolve(n as int)

        then:
        solution == result as int

        where:
        n  || result
        15 || 4
    }
}
