package letcode;

import java.util.Stack;

public class VaildParentheses {
	public boolean vaildParentheses(String str){
		boolean b=true;
		if(str.length()==0){
			return b;
		}else{
			Stack<Character>strs=new Stack<>();
			for(int i=0;i<str.length();i++){
				switch (str.charAt(i)) {
				case '(':
					strs.push(str.charAt(i));
					break;
				case '{':
					strs.push(str.charAt(i));
					break;
				case '[':
					strs.push(str.charAt(i));
					break;
				case ')':
					if(strs.size()==0)
						b=false;
					else if(!(strs.pop().equals('('))){
						b=false;
					}
					break;
				case '}':
					if(strs.size()==0)
						b=false;
					else if(!(strs.pop().equals('{'))){
						b=false;
					}
					break;
				case ']':
					if(strs.size()==0)
						b=false;
					else if(!(strs.pop().equals('['))){
						b=false;
					}
					break;
				}
			}
			if(strs.size()!=0){
				b=false;
			}
			return b;
		}		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		VaildParentheses v=new VaildParentheses();
		String str="]]]]]]]";
		System.out.println(v.vaildParentheses(str));
	}

}
