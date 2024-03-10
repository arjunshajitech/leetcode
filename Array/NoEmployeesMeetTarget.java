// Number of Employees Who Met the Target


public class NoEmployeesMeetTarget {
	public static void main(String args[]) {
		int[] hours = {0,1,2,3,4};
		int target = 2;
		System.out.println(perform(hours,target));		
	}

	public static int perform(int[] hours,int target) {
		int t = 0;
		for (int hour : hours) {
			if(hour >= target) {
				t++;
			}
		}
		return t;
	}
}