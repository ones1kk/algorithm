package io.github.ones1kk.programers.level2

import spock.lang.Specification

class Lesson17683Test extends Specification {

    def "[3차] 방금그곡"() {
        when:
        def solution = Lesson17683.solution(m as String, musicinfos as String[])

        then:
        solution == result as String

        where:
        m                  | musicinfos                                                 | result
        "ABCDEFG"          | ["12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"]  | "HELLO"
        "CC#BCC#BCC#BCC#B" | ["03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"]   | "FOO"
        "ABC"              | ["12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"] | "WORLD"
        "ABC"              | ["12:00,12:06,HELLO,ABC#ABC#ABC"]                          | "(None)"
        "ABC"              | ["12:00,12:10,HELLO,ABC#ABC#ABC"]                          | "HELLO"
        "ABC"              | ["12:04,13:00,HELLO,ABC#ABC#ABC"]                          | "HELLO"
        "C#C"              | ["12:00,12:06,HELLO,C#C#CC#"]                              | "HELLO"
        "ABCDEFG"          | ["11:50,12:04,HELLO,CDEFGAB", "12:57,13:11,BYE,CDEFGAB"]   | "HELLO"
        "CC#BCC#BCC#"      | ["03:00,03:08,FOO,CC#B"]                                   | "FOO"
    }
}
