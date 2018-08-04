package letcode;

public class LongestCommonPrefix {
	public void longestCommonPrefix(String[] str){
		if(str.length==0&&str!=null){
			System.out.println("");	
		}else{
			String p=str[0];
			for(int i=1;i<str.length;i++){
				while(str[i].indexOf(p)!=0){		
					p=p.substring(0, p.length()-1);
					
				}
				if(str[i].indexOf(p)==-1){
					p="";
				}
			}
			System.out.println(p);
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法
		LongestCommonPrefix lg=new LongestCommonPrefix();
		String[] str=new String[]{"c","acc","ccc"};
		lg.longestCommonPrefix(str);
	}

}
