package io.github.ones1kk.study.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "3,7,5,2,1"
            , "102,1,4,4214,123,3,6"
    })
    @DisplayName("기수 정렬")
    void testInsertionSort(String value) {
        // given
        int[] arr = Arrays.stream(value.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        // when
        int[] result = RadixSort.radixSort(arr);

        // then
        assertThat(result).isSorted();
    }

}