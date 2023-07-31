package io.github.ones1kk.programers.level1

import spock.lang.Specification

class Lesson92334Test extends Specification {

    def "신고 결과 받기"() {
        when:
        def solution = Lesson92334.solution(id_list as String[], report as String[], k as int)

        then:
        solution == result

        where:
        id_list                            | report                                                                 | k | result
        ["muzi", "frodo", "apeach", "neo"] | ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"] | 2 | [2, 1, 1, 0]
        ["con", "ryan"]                    | ["ryan con", "ryan con", "ryan con", "ryan con"]                       | 3 | [0, 0]
    }
}
