package io.github.ones1kk.study.book.do_it.day02

import spock.lang.Specification

class Class003Test extends Specification {

    def "문제003"() {
        when:
        def solution = Class003.resolve(scores as long[], start as int, end as int)

        then:
        solution == result as int

        where:
        scores          | start | end || result
        [5, 4, 3, 2, 1] | 1     | 3   || 12
        [5, 4, 3, 2, 1] | 2     | 4   || 9
        [5, 4, 3, 2, 1] | 5     | 5   || 1
    }
}
