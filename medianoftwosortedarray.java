class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxXLeft = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minXRight = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxYLeft = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minYRight = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxXLeft <= minYRight && maxYLeft <= minXRight) {
                if ((m + n) % 2 == 0) {
                    return ((double)Math.max(maxXLeft, maxYLeft) + Math.min(minXRight, minYRight)) / 2;
                } else {
                    return (double)Math.max(maxXLeft, maxYLeft);
                }
            } else if (maxXLeft > minYRight) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }
}
