package letcode;

public class Test70 {
	 public int climbStairs(int n){
		 if(n==1)
			 return 1;
		 if(n==2)
			 return 2;
		 int nums[]=new int[n+1];
		 nums[1]=1;
		 nums[2]=2;
		 climb(nums,n);
		return nums[n];
		 
	 }
	private void climb(int[]nums, int n) {
		// TODO �Զ����ɵķ������
		int a=n-1;
		int b=n-2;
		if(a>2&&nums[a]==0)
			climb(nums,a);
		if(b>2&&nums[b]==0)
			climb(nums,b);
		nums[n]=nums[a]+nums[b];
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test70 t=new Test70();
		System.out.println(t.climbStairs(6));
	}

}
