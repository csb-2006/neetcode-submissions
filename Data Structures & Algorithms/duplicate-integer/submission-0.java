class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n= nums.length;
    
for(int i=0;i<n;i++)
{
    int j=i+1;
    while(i<j && j<nums.length)
    if(nums[i]==nums[j])
    {
        return true;
    }
    else
    {
        j++;
    }  
}
return false;
    }}