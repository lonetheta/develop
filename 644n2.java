//��ʼ��
public class Solution {
	 public double findMaxAverage(int[] nums, int k) {
			double max1 = -Double.MAX_VALUE;
				for (int i=k; i<nums.length+1; i++)                 //��ͬ���䳤����Ѱ
				{
				          double max2 = 0;
				          double window = 0;
				          for(int h=0; h<i; h++)                              //��ĳһ����εľ�ֵ
					      {
					        	window += nums[h];
					      }
				          max2 = window/i;
						  max1 = Math.max(max1,max2);
				          for (int j=i; j<nums.length; j++)                    // ��Ѱ�̶����䳤�ȵ�����ֵ
				          {
				        	    window = window+nums[j]-nums[j-i];
					            max2 = Math.max(window/i, max2);
				          }
				                max1 = Math.max(max1, max2);
				 }
			                 return max1;
	    }

}


//�Ľ���
public class Solution {
	 public double findMaxAverage(int[] nums, int k) {
			    double max1 = -Double.MAX_VALUE;                       //max1��¼�������䳤�ȵ�����ֵ
                double window1 = 0;                                 
			    for(int h=0; h<k-1; h++)                              
				{
					window1 += nums[h];
				}
				for (int i=k; i<nums.length+1; i++)                 //��ͬ���䳤����Ѱ
				{
				          double max2 = 0;                             //max2 ��¼�̶����䳤�ȵ�����ֵ
                          double window2 = 0;                       //window2 ���ڱ�������
				          window1 += nums[i-1];                          //window1 ��ʼ��������
				          max2 = window1/i;                            
						  max1 = Math.max(max1,max2);
                          window2 = window1;
				          for (int j=i; j<nums.length; j++)             // ����������Ѱ�̶����䳤�ȵ�����ֵ
				          {
				        	    window2 = window2+nums[j]-nums[j-i];
					            max2 = Math.max(window2/i, max2);
				          }
				                max1 = Math.max(max1, max2);
				 }
			                 return max1;
	    }

}