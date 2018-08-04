package letcode;

public class Test28 {
	public void strStr(String h,String n){
		if(n==null){
			System.out.println(0);
		}
		int num=h.indexOf(n);
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test28 t=new Test28();
		String h="aaaaaa";
		String n="bba";
		t.strStr(h, n);
	}

}
