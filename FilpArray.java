package letcode;

public class FilpArray {
	   public void rotate(int[] nums, int k) {
	        while(k>0){
	        	int temp=nums[nums.length-1];
	        	for(int i=nums.length-1;i>0;i--){
	        		nums[i]=nums[i-1];
	        		
	        	}
	        	nums[0]=temp;
	        	k--;
	        }
	        for (int i : nums) {
				System.out.print(" "+i);
			}
	        System.out.println(" ");
	    }
	/* public void rotate(int[] nums, int k){
		 int length=nums.length;
		 k=k%length;//��K�������鳤��ʱ���൱��ת��ԭ�������飬ȡ����Ϊ�˵ó���ת��ԭ����������ַ�ת�Ĵ���
		 if(length==1){
			 return;
		 }
		 if(k==0&&k==length){
			 return;
		 }
		 Filp(nums,0,length-k-1);
		 Filp(nums,length-k,length-1);
		 Filp(nums,0,length-1);
	     for (int i : nums) {
					System.out.print(" "+i);
				}
		        System.out.println(" ");
	 }
	private void Filp(int[] nums, int i, int j) {
		// TODO �Զ����ɵķ������
		int temp;
		while(i<j&&i>=0){
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
*/	
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FilpArray fa=new FilpArray();
		int[] num={1,2,3};
		fa.rotate(num, 4);
	}

}
