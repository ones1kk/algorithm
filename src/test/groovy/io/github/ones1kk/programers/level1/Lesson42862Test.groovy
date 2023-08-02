package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson42862Test extends Specification {

    def "체육복"() {
        when:
        def solution = Lesson42862.solution(n as int, lost as int[], reserve as int[])

        then:
        solution == result

        where:
        n  | lost                             | reserve                | result
        5  | [2, 4]                           | [1, 3, 5]              | 5
        5  | [2, 4]                           | [3]                    | 4
        3  | [3]                              | [1]                    | 2
        5  | [4, 2]                           | [3, 5]                 | 5
        5  | [5, 3]                           | [4, 2]                 | 5
        5  | [3, 5]                           | [2, 4]                 | 5
        24 | [12, 13, 16, 17, 19, 20, 21, 22] | [1, 22, 16, 18, 9, 10] | 19
        7  | [2, 4, 7]                        | [1, 3, 5]              | 6
        4  | [2, 3]                           | [2]                    | 3
        5  | [4, 2]                           | [3, 5]                 | 5
        5  | [1]                              | [5]                    | 4
        5  | [2, 5]                           | [1, 3]                 | 4
        5  | [2, 5]                           | [1, 3]                 | 4
        5  | [2, 3, 5]                        | [2, 3, 4]              | 5
        5  | [4, 5]                           | [3, 4]                 | 4
    }
}
