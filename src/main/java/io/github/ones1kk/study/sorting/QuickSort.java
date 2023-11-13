package io.github.ones1kk.study.sorting;

public class QuickSort {

    public static void leftPivotQuickSort(int[] a) {
        l_pivot_sort(a, 0, a.length - 1);
    }

    public static void rightPivotQuickSort(int[] a) {
        r_pivot_sort(a, 0, a.length - 1);
    }

    public static void midPivotQuickSort(int[] a) {
        m_pivot_sort(a, 0, a.length - 1);
    }

    private static void l_pivot_sort(int[] a, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int pivot = leftPartition(a, lo, hi);

        l_pivot_sort(a, lo, pivot - 1);
        l_pivot_sort(a, pivot + 1, hi);
    }

    private static int leftPartition(int[] a, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = a[left];

        while (lo < hi) {

            while (a[hi] > pivot && lo < hi) {
                hi--;
            }

            while (a[lo] <= pivot && lo < hi) {
                lo++;
            }

            swap(a, lo, hi);
        }

        swap(a, left, lo);

        return lo;
    }

    private static void r_pivot_sort(int[] a, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int pivot = rightPartition(a, lo, hi);

        r_pivot_sort(a, lo, pivot - 1);
        r_pivot_sort(a, pivot + 1, hi);
    }

    private static int rightPartition(int[] a, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = a[right];

        while (lo < hi) {

            while (a[lo] < pivot && lo < hi) {
                lo++;
            }

            while (a[hi] >= pivot && lo < hi) {
                hi--;
            }


            swap(a, lo, hi);
        }

        swap(a, right, hi);

        return hi;
    }

    private static void m_pivot_sort(int[] a, int lo, int hi) {

        if (lo >= hi) {
            return;
        }

        int pivot = midPartition(a, lo, hi);

        m_pivot_sort(a, lo, pivot);
        m_pivot_sort(a, pivot + 1, hi);
    }

    private static int midPartition(int[] a, int left, int right) {


        int lo = left - 1;
        int hi = right + 1;
        int pivot = a[(left + right) / 2];

        while (true) {

            do {
                lo++;
            } while (a[lo] < pivot);

            do {
                hi--;
            } while (a[hi] > pivot && lo <= hi);

            if (lo >= hi) {
                return hi;
            }

            swap(a, lo, hi);
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
