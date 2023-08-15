package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson17680Test extends Specification {

    def "[1차] 캐시"() {
        when:
        def solution = Lesson17680.solution(cacheSize as int, cities as String[])

        then:
        solution == result as int

        where:
        cacheSize | cities                                                                                                            | result
        3         | ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]                          | 50
        3         | ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]                                 | 21
        2         | ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"] | 60
        5         | ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"] | 52
        2         | ["Jeju", "Pangyo", "NewYork", "newyork"]                                                                          | 16
        0         | ["Jeju", "Pangyo", "Seoul", "NewYork", "LA"]                                                                      | 25
    }
}
