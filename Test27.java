package letcode;

public class Test27 {
	public void remove(int nums[],int num){
		int i=0;
		for(int j=0;j<nums.length;j++){
			if(nums[j]!=num){
				nums[i]=nums[j];
				i++;
			}
		}
		for(int w=0;w<i;w++){
			System.out.println(nums[w]);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test27 t=new Test27();
		int nums[]={3,2,2,2,3};
		t.remove(nums, 3);
	}

}
