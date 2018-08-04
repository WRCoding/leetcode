package letcode;

public class PalindromeNumb {

	public boolean palindromeNumb(int num){
		int temp=0;
		if(num<0||num%10==0&&num!=0){
			return false;
		}
		while(num>temp){
			temp=temp*10+num%10;
			num=num/10;
		}
		return num==temp||num==temp/10;
		
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	PalindromeNumb p=new PalindromeNumb();
	System.out.println(p.palindromeNumb(121));
	}

}
