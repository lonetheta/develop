public class Solution {
		  public double findMaxAverage(int[] nums, int k) {
			double max1 = -Double.MAX_VALUE;
				for (int i=k; i<nums.length+1; i++)  //不同区间长度搜寻
				{
				double max2 = -Double.MAX_VALUE;
				for (int j=0; j<=nums.length-i; j++)    // 搜寻固定区间长度的最大均值
				{
					double add = 0;
					for(int h=0; h<i; h++)              //求某一区间段的均值
					{
						add += nums[j+h];
					}
					add = add/i;
					if (add > max2)
					{
						max2 = add;
					}
				}
				if(max2 > max1)
				{
					max1 = max2;
				}
				}
			return max1;
	    }
}