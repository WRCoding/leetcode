package letcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test26 {
	public int Remove(int []num){
		/*HashSet<Integer> list=new HashSet<>();
		for(int i=0;i<num.length;i++){
			list.add(num[i]);
		}
		int len=list.size();
		System.out.println("len: "+len);
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		if(num==null)
			return 0;
		int i=0;
		for(int j=1;j<num.length;j++){
			if(num[j]!=num[i]){
				i++;
				num[i]=num[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Test26 t=new Test26();
		int[]a={1,1,2,2,3,4};
		System.out.println(t.Remove(a));
	}

}
