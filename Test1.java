package letcode;

public class Test1 {
	private static int[] twoSum(int[] nums, int a){
		int b[]=new int[2];
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==a){
					b[0]=i;
					b[1]=j;
				}
			}
		}
		
		return b;
		
	}
	public static void main(String[] args) {
		
		// TODO 自动生成的方法存根
		int a[]=new int[]{3,2,4};
		int c=6;
		Test1 t1=new Test1();
		int b[]=t1.twoSum(a, c);
		for (int i : b) {
			System.out.println(i);
		}
	}

}
