package letcode;

public class BusinessStock {
	 int a,b;
	 int sum=0;
	 public int maxProfit(int[] prices) {		
		/* int sum=0;
		 for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1])
				sum=sum+prices[i]-prices[i-1];
		 }
		return sum;*/		
		 boolean flag=false;
		 for(int i=1;i<prices.length-1;i++){
			 if(prices[i]<prices[i-1]&&prices[i]<prices[i+1]&&!flag){
				 a=prices[i];
				 flag=true;
				 continue;
			 }
			 if(prices[i]>prices[i+1]&&flag){
				 b=prices[i];
				 sum=sum+b-a;
				 flag=false;
				 continue;
			 }
			 if(prices[i]<prices[i+1]&&i!=prices.length-1&&flag){
				 continue;
			 }
			 if(prices[i]<prices[i+1]&&i==prices.length-1&&flag){
				 b=prices[i+1];
				 sum=sum+b-a;
			 }else if(prices[i]>prices[i-1]){
				 sum=0;
				 a=prices[0];
				 if(prices[i+1]>prices[i]){
					 b=prices[prices.length-1];
					 sum=sum+b-a;
				 }
			 }else{
				 continue;
			 }
		 }
		 return sum;
	    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BusinessStock b=new BusinessStock();
		int prices[]={6,1,3,2,4,7};
		int a=b.maxProfit(prices);
		System.out.println(a);
	}

}
