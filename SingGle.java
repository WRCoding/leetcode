package letcode;

import java.util.HashMap;

public class SingGle {
	 public int singleNumber(int[] nums){
		/*HashMap<Integer,Integer>map=new HashMap<>();
		int count=1;
		for(int i=0;i<nums.length;i++){
			count=1;
			for(int j=0;j<nums.length;j++){
				if(i==j)
					continue;
				if(nums[i]==nums[j]){
					count++;
				}				
			}
			map.put(count,nums[i]);
		}	
		return map.get(1);*/
		 int result=0;
		 for(int i=0;i<nums.length;i++){
			 result^=nums[i];
		 }
		 return result;
	 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SingGle s=new SingGle();
		int[] nums={1,2,2};
		//System.out.println(s.singleNumber(nums));
		int result=0;
		for(int i=0;i<nums.length;i++){
			result^=nums[i];
			System.out.println(result);
		}
	}

}
