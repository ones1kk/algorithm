package io.github.ones1kk.study.book.do_it.week1.day07

import io.github.ones1kk.study.book.do_it.week1.day07.Class009
import spock.lang.Specification

class Class009Test extends Specification {

    def "문제009"() {
        when:
        def solution = Class009.resolve(arr as char[], count as int, table as int[])

        then:
        solution == result as int

        where:
        arr                                           | count | table        || result
        ['C', 'C', 'T', 'G', 'G', 'A', 'T', 'T', 'G'] | 8     | [2, 0, 1, 1] || 0
        ['G', 'A', 'T', 'A']                          | 2     | [1, 0, 0, 1] || 2
    }
}
