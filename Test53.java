package letcode;

public class Test53 {
	public int maxSubArray(int num[]){
		int max[]=new int[num.length];
		int maxx=num[0];
		max[0]=maxx;
		for(int i=1;i<num.length;i++){
			max[i]=max[i-1]>0?max[i-1]+num[i]:num[i];
			maxx=Math.max(max[i],maxx);
		}
		return maxx;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test53 t=new Test53();
		int num[]={-1,-1,-1,-1,1,1};
		System.out.println(t.maxSubArray(num));
	}

}
