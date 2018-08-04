package letcode;

public class Test35 {
	public int find(int[] nums,int num){
		/*int temp=0;
		if(nums.length==1){
			for(int i=0;i<nums.length ;i++){
				if(nums[i]<num){
					temp=i+1;
				}else{
					temp=i;
				}
			}
		}else{
			for(int i=0;i<nums.length-1;i++){
				if(nums[i]==num){
					temp=i;
					break;
				}			
				else if(nums[i]<num&&num<=nums[i+1]){
					temp=i+1;
					break;
				}else if(num>nums[nums.length-1]){
					temp=nums.length;
				}else if(num<nums[i]){
					temp=0;
				}
			}
		}
		return temp;*/
		int L=0;
		int R=nums.length-1;
		while(L<=R){
			int mid=L+(R-L)/2;
			if(nums[mid]==num)
				return mid;
			else if(nums[mid]>num){
				R=mid-1;
			}else{
				L=mid+1;
			}
		}
		return L;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test35 t=new Test35();
		int[]nums={1};
		System.out.println(t.find(nums, 7));
		
	}

}
