//  Difference Between Element Sum and Digit Sum of an Array

public class ElementDigitSum {
	public static void main(String args[]) {
		int[] nums = {1,15,6,3};
		System.out.println(perform(nums));	
	}
	
	public static int perform(int[] nums) {
		
		int sumOfElements = 0,digitSum = 0,sum;
		for(int num : nums) {
			sumOfElements += num;
			digitSum += calculateDigitSum(num);
		}

		return sumOfElements - digitSum;
	}

	public static int calculateDigitSum(int num) {
		if (num < 9) {
			 return num;
		}
		return num % 10 + calculateDigitSum(num / 10);
	}
}