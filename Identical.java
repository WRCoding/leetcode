package letcode;

import java.util.HashSet;

public class Identical {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length==1)
			return false;
		/*for(int i=0;i<nums.length;i++){			
			for(j=nums.length-1;j>0;j--){
				if(i==j)
					continue;
				if(nums[i]==nums[j]){
					flag=true;
					break;
				}
			}

		}*/
		HashSet<Integer>set=new HashSet<>();
		int len=nums.length;
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		if(set.size()==len)
			return false;
		else
			return true;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Identical i=new Identical();
		int nums[]={1,2,3,4,5,6};
		boolean b=i.containsDuplicate(nums);
		System.out.println(b);
	}

}
