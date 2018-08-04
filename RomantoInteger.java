package letcode;

public class RomantoInteger {
	public int romantoInteger(String str){
		int sum=0;
		int[]num=new int[str.length()];
		for(int i=0;i<num.length;i++){
			switch (str.charAt(i)) {
			case 'I':
				num[i]=1;
				break;
			case 'V':
				num[i]=5;
				break;
			case 'X':
				num[i]=10;
				break;
			case 'L':
				num[i]=50;
				break;
			case 'C':
				num[i]=100;
				break;
			case 'D':
				num[i]=500;
				break;
			case 'M':
				num[i]=1000;
				break;
			}
		}
	
		for(int i=0;i<str.length()-1;i++){
			if(num[i]<num[i+1]){
				sum=sum-num[i];
			}
			else
				sum=sum+num[i];
		}
			sum=sum+num[str.length()-1];
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RomantoInteger r=new RomantoInteger();
		System.out.println(r.romantoInteger("XL"));
	}

}
