package io.github.ones1kk.study.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class InsertionSortTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "3,7,5,2,1"
            , "102,1,4,4214,123,3,6"
    })
    @DisplayName("버블 정렬")
    void testInsertionSort(String value) {
        // given
        int[] arr = Arrays.stream(value.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        // when
        InsertionSort.insertionSort(arr, arr.length);

        // then
        assertThat(arr).isSorted();
    }

}