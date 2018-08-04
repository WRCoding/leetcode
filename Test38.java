package letcode;

public class Test38 {
	public String CountAndSay(int n){
		String str="1";
		String result="";
		int sum=1;
		if(n==1){
			return str;
		}
		if(n==2){
			str="11";
			return str;
		}
		str="11";
		for(int i=2;i<n;i++){
			for(int j=0;j<str.length();j++){
				if(j!=str.length()-1&&str.charAt(j)==str.charAt(j+1)){
					sum++;
					continue;
				}else if(j==str.length()-1&&str.charAt(j)==str.charAt(j-1)){
					result=result+String.valueOf(sum)+str.charAt(j);
					sum=1;
				}else{
					result=result+String.valueOf(sum)+str.charAt(j);
					sum=1;
				}
			}
			str=result;
			result="";
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test38 t=new Test38();
		System.out.println(t.CountAndSay(5));
	}

}
