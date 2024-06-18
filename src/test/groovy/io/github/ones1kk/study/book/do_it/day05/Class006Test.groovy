package io.github.ones1kk.study.book.do_it.day05


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
