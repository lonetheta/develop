Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks.Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.
However, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.
You need to return the least number of intervals the CPU will take to finish all the given tasks.

Example 1:

Input: tasks = ['A','A','A','B','B','B'], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.

Note:

    The number of tasks is in the range [1, 10000].
    The integer n is in the range [0, 100].

//时间空隙的数量是一定的 ，按照一定策略可以最大程度减少时间空隙。即最大到最小开始填充
//即使装不下，也可以通过向上替换装下，直到填满所有空隙
//A B C
//A B C
//A B
//A


public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] nums = new int[26];
        for (char n:tasks)
        {
            nums[n-'A']++;
        }
        Arrays.sort(nums);
        int space = n*(nums[0]-1);
        for(int i=1; i<nums.length; i++)
        {
            space -= Math.min(nums[i], n);
        }
        return space>0 ? tasks.length+space : tasks.length;
    }
}