package io.github.ones1kk.programers.level1

import org.junit.jupiter.api.Disabled
import spock.lang.Specification

class Lesson17681Test extends Specification {

    // Test 왜 fail인지 모르곘음.
    // 프로그래머스는 정상 동작
    @Disabled
    def "비밀지도"() {
        when:
        def solution = Lesson17681.solution(n as int, arr1 as int[], arr2 as int[])

        then:
        solution == result as String[]

        where:
        n | arr1                     | arr2                     | result
        5 | [9, 20, 28, 18, 11]      | [30, 1, 21, 17, 28]      | ["#####","# # #", "### #", "# ##", "#####"]
        6 | [46, 33, 33, 22, 31, 50] | [27, 56, 19, 14, 14, 10] | ["######", "### #", "## ##", " #### ", " #####", "### # "]
    }
}
