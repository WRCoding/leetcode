package letcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test66 {
	 public int[] plusOne(int[] num){
		/*StringBuffer sb=new StringBuffer();
		for(int i=0;i<num.length;i++){
			sb.append(num[i]);
		}
		String str=sb.toString();
		BigInteger big=new BigInteger(str);
		BigInteger big2=new BigInteger("1");
		str=String.valueOf(big.add(big2));
		num=new int[str.length()];
		for(int i=0;i<str.length();i++){
			num[i]=Integer.parseInt(str.substring(i, i+1));
		}
		return num;*/
		 for(int i=num.length-1;i>=0;i--){
			 if(num[i]==9){
				 num[i]=0;
			 }else{
				 num[i]++;
				 return num;
			 }			 
		 }
		int[]nums=new int[num.length+1];
		 nums[0]=1;
		 return nums;
		 
		
	 }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test66 t=new Test66();
		int []num={9,9};	
		int [] a=t.plusOne(num);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
