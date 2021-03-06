package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOf2SortedArraysTest {

    @Test
    public void getMedian() {

        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        assertEquals(2.5, MedianOf2SortedArrays.getMedian(nums1, nums2), 1);
    }
}