package letcode;

import java.util.Arrays;

public class Test88 {
	 public void merge(int[] nums1, int m, int[] nums2, int n){
		 int temp= m+n-1;
		/*nums1=Arrays.copyOf(nums1, temp);
		 --temp;*/
		 --m;
		 --n;
		 while(m>=0&&n>=0){
			nums1[temp--]=nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
		 }
		 while(n>=0){
			 nums1[temp--]=nums2[n--];
		 }
		 for (int i : nums1) {
			System.out.print(i+" ");
		}
	 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test88 t=new Test88();
		int[]nums1={1,2,3,0,0,0};
		int[]nums2={2,5,6};
		t.merge(nums1, 3, nums2, 3);
	}

}
