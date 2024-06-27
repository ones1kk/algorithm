package io.github.ones1kk.study.book.do_it.week2.day01


import spock.lang.Specification

class Class010Test extends Specification {

    def "문제010"() {
        when:
        def solution = Class010.resolve(arr as long[], count as int)

        then:
        solution == result as long[]

        where:
        arr                                  | count || result
        [1, 5, 2, 3, 6, 2, 3, 7, 3, 5, 2, 6] | 3     || [1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 2, 2]
    }
}
