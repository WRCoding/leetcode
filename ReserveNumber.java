package letcode;

public class ReserveNumber {
	public int reservenumber(int num){
	long temp=0;
		while(num!=0){
			temp=temp*10+num%10;
			num=num/10;
		}
		if(temp<Integer.MIN_VALUE||temp>Integer.MAX_VALUE){
			return 0;
		}
		return (int)temp;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ReserveNumber r=new ReserveNumber();
		System.out.println(r.reservenumber(1534236469));
				
	}

}
