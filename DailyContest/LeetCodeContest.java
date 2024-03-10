//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may //return the result in any order.
import java.util.*;

public class LeetCodeContest {
	public static void main(String args[]) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(perform(nums1,nums2));
	}

	public static int[] perform(int[] nums1,int[] nums2) {
		
		Set<Integer> nums1Set = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();
		for(int num : nums1) {
			nums1Set.add(num);
		}

		for(int num : nums2) {
			if(nums1Set.contains(num)) {
				resultSet.add(num);
			}
		}

		int[] resultArray = new int[resultSet.size()];
        	int index = 0;
        	for (int num : resultSet) {
            		resultArray[index++] = num;
        	}
		return resultArray;
	}
}