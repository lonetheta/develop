public class Solution {
	   boolean check(int[] nums, int k, double mid){
		   double sum = 0;
		   double pre = 0;
		   double min = Integer.MAX_VALUE;
		   for (int i=0; i<k; i++)
		   {
			   sum += nums[i]-mid;
		   }
		   if (sum>0)
		   {
			   return true;
		   }
		   for (int i=k; i<nums.length; i++)
		   {
			   sum += nums[i]-mid;
               if (sum>0)
		   {
			   return true;
		   }
			   pre += nums[i-k]-mid;
			   min = Math.min(min, pre);
			   if ((sum-min)>0)
			   {
				   return true;
			   }
		   }
		   return false;
	   }
	   public double findMaxAverage(int[] nums, int k) {
		   double max = Integer.MAX_VALUE;
		   double min = Integer.MIN_VALUE;
		   double mid = 0;
		   while ((max-min)>0.000001)
		   {
			   mid = (max+min)/2;
			   if (check(nums, k, mid))
			   {
				   min = mid;
			   }
			   else 
			   {
				   max = mid;
			   }
		   }
		   return  mid;
	   }
}