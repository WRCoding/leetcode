package letcode;

public class Tset58 {
	public int lengthOfLastWord(String str){
		char[]ch=null;
		String[]strr=str.split(" ");
		if(str==" "||str==""||strr.length==0){
			return 0;
		}else{			
			ch=strr[strr.length-1].toCharArray();
		}		
		return ch.length;		
	}
	public static void main(String[] args) {
		Tset58 t=new Tset58();
		String str="";
		System.out.println(t.lengthOfLastWord(str));
	}
}
