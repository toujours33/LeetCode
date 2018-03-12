package median;

public class Main {

	public static double findMedianOptimized(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m > n) {
			return findMedianOptimized(nums2, nums1);
		}
		int iMin = 0, iMax = m, halflen = (m + n + 1) / 2;
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halflen - i;
			if (i < iMax && nums1[i] < nums2[j - 1]) {
				i++;
			} else if (i > iMin && nums1[i - 1] > nums2[j]) {
				i--;
			} else {
				int maxLeft = Math.max((i == 0 ? Integer.MIN_VALUE : nums1[i - 1]),
						(j == 0 ? Integer.MIN_VALUE : nums2[j - 1]));
				int minRight = Math.min((i == m ? Integer.MAX_VALUE : nums1[i]),
						(j == n ? Integer.MAX_VALUE : nums2[j]));
				if ((m + n) % 2 == 0)
					return (maxLeft + minRight) / 2.0;
				else
					return maxLeft;
			}
		}
		return 0.0;
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		int maxLeft = 0, minRight = 0;
		for (int i = 0; i <= nums1.length; i++) {
			int j = (m + n - 2 * i) / 2;
			if (j > nums2.length) {
				continue;
			}
			maxLeft = Math.max((i == 0 ? 0 : nums1[i - 1]), (j == 0 ? 0 : nums2[j - 1]));
			minRight = Math.min((i == m ? Integer.MAX_VALUE : nums1[i]), (j == n ? Integer.MAX_VALUE : nums2[j]));
			if (maxLeft <= minRight) {
				if ((m + n) % 2 == 0)
					return (maxLeft + minRight) / 2.0;
				else
					return minRight;
			}
		}
		return 0.0;
	}

	public static void main(String[] args) {
		int[] nums1 = {};
		int[] nums2 = { 1, 3 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
		System.out.println(findMedianOptimized(nums1, nums2));
	}

}
