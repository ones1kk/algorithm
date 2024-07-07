package io.github.ones1kk.study.book.do_it.week2.day05


import spock.lang.Specification

class Class015Test extends Specification {

    def "문제014"() {
        when:
        def solution = Class015.resolve(str as String)

        then:
        solution == result as String

        where:
        str    || result
        "2143" || "4321"
    }
}

