//初始版
public class Solution {
	 public double findMaxAverage(int[] nums, int k) {
			double max1 = -Double.MAX_VALUE;
				for (int i=k; i<nums.length+1; i++)                 //不同区间长度搜寻
				{
				          double max2 = 0;
				          double window = 0;
				          for(int h=0; h<i; h++)                              //求某一区间段的均值
					      {
					        	window += nums[h];
					      }
				          max2 = window/i;
						  max1 = Math.max(max1,max2);
				          for (int j=i; j<nums.length; j++)                    // 搜寻固定区间长度的最大均值
				          {
				        	    window = window+nums[j]-nums[j-i];
					            max2 = Math.max(window/i, max2);
				          }
				                max1 = Math.max(max1, max2);
				 }
			                 return max1;
	    }

}


//改进版
public class Solution {
	 public double findMaxAverage(int[] nums, int k) {
			    double max1 = -Double.MAX_VALUE;                       //max1记录所有区间长度的最大均值
                double window1 = 0;                                 
			    for(int h=0; h<k-1; h++)                              
				{
					window1 += nums[h];
				}
				for (int i=k; i<nums.length+1; i++)                 //不同区间长度搜寻
				{
				          double max2 = 0;                             //max2 记录固定区间长度的最大均值
                          double window2 = 0;                       //window2 用于遍历滑动
				          window1 += nums[i-1];                          //window1 初始滑动窗口
				          max2 = window1/i;                            
						  max1 = Math.max(max1,max2);
                          window2 = window1;
				          for (int j=i; j<nums.length; j++)             // 滑动窗口搜寻固定区间长度的最大均值
				          {
				        	    window2 = window2+nums[j]-nums[j-i];
					            max2 = Math.max(window2/i, max2);
				          }
				                max1 = Math.max(max1, max2);
				 }
			                 return max1;
	    }

}