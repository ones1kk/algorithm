package io.github.ones1kk.study.book.do_it.day03


import spock.lang.Specification

class Class004Test extends Specification {

    def "문제004"() {
        when:
        def solution = Class004.resolve(scores as int[][], x1 as int, y1 as int, x2 as int, y2 as int)

        then:
        solution == result as int

        where:
        scores                                                                 | x1 | y1 | x2 | y2 || result
        [[1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5, 6], [4, 5, 6, 7]] | 2  | 2  | 3  | 4  || 12
        [[1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5, 6], [4, 5, 6, 7]] | 3  | 4  | 3  | 4  || 9
        [[1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5, 6], [4, 5, 6, 7]] | 1  | 1  | 4  | 4  || 1
    }
}
