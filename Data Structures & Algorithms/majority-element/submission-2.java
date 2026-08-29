class Solution {
    public int majorityElement(int[] nums) {
int count=0;
Arrays.sort(nums);
int n=nums[0];
for(int i=0;i<nums.length;i++)
{
    for(int j=i+1;j<nums.length;j++)
    {
        if(nums[i]==nums[j])
        {
        
            count+=1;
        }
        else
        {
            if(count+1>(nums.length/2))
            {
                return nums[i];
            }
         i=j;
         count=0;
         n=nums[j];
        }
    }
}
    if(count+1>(nums.length/2))
    {
return n;
    }
return n;
    }}