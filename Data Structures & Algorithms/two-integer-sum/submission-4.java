class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
    int ned=target-nums[i];

    if(ans.containsKey(ned))
    {
        return new int[]{ans.get(ned),i};
    }
    ans.put(nums[i],i);
}
return new int[]{};
    }
}
