package io.github.ones1kk.study.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

    @Nested
    @DisplayName("퀵 정렬")
    class Test01 {
        @ParameterizedTest
        @ValueSource(strings = {
                "3,7,5,2,1"
                , "102,1,4,4214,123,3,6"
        })
        @DisplayName("왼쪽 피벗")
        void testLeftPivotQuickSort(String value) {
            // given
            int[] arr = Arrays.stream(value.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // when
            QuickSort.leftPivotQuickSort(arr);

            // then
            assertThat(arr).isSorted();
        }

        @ParameterizedTest
        @ValueSource(strings = {
                "3,7,5,2,1"
                , "102,1,4,4214,123,3,6"
        })
        @DisplayName("오른쪽 피벗")
        void testRightPivotQuickSort(String value) {
            // given
            int[] arr = Arrays.stream(value.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // when
            QuickSort.rightPivotQuickSort(arr);

            // then
            assertThat(arr).isSorted();
        }

        @ParameterizedTest
        @ValueSource(strings = {
                "3,7,5,2,1"
                , "102,1,4,4214,123,3,6"
        })
        @DisplayName("가운데 피벗")
        void testMidPivotQuickSort(String value) {
            // given
            int[] arr = Arrays.stream(value.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // when
            QuickSort.midPivotQuickSort(arr);

            // then
            assertThat(arr).isSorted();
        }
    }

}