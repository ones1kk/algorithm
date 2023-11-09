package io.github.ones1kk.study.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "3,7,5,2,1"
            , "102,1,4,4214,123,3,6"
    })
    @DisplayName("선택 정렬")
    void testSelectionSort(String value) {
        // given
        int[] arr = Arrays.stream(value.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        // when
        SelectionSort.selectionSort(arr, arr.length);

        // then
        assertThat(arr).isSorted();
    }

}