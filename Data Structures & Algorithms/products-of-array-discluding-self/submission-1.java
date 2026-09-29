class Solution {
public int[] productExceptSelf(int[] nums) {
   int zeroC=0;
    int zero=-1;
        int mul = 1;
        int[] res = new int[nums.length];
        int [] ans=new int[nums.length];
        int k = 0;

//see any zero are there or not 
for(int o=0;o<nums.length;o++)
{
    if(nums[o]==0)
    {
      zeroC++;  
    }
}
// for one zero condition
if(zeroC==1)
{
for(int u=0;u<nums.length;u++)
{
    if(nums[u]==0)
    {
     zero=u;
    }
    else
    {
        mul*=nums[u];
    }
}
if(zero!=-1)
{
    ans[zero]=mul;
}
return ans;
}

//if 2 or more then all are zero so just return ans...
else if(zeroC>=2)
{
    return ans;
}

// now this for zeroC=0 meaning no zero is present in testcase
else
{
     for(int i=0;i<nums.length;i++)
     {
        mul=mul*nums[i];
     }
     for(int m=0;m<nums.length;m++)
     {
        res[m]=mul;
     }
    for(int j=0;j<nums.length;j++)
    {
        ans[j]=res[j]/nums[j];
    }
     return ans;
}
}
}
      