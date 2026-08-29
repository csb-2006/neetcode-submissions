class Solution {
    private static void mergesort(int [] nums)
    {
        int numslen=nums.length;
        if(numslen<2)
        {
            return;
        }

        int mid=numslen/2;

        int []leftHalf=new int [mid];
        int []rightHalf=new int [numslen-mid];

        for(int i=0;i<mid;i++)
        {
            leftHalf[i]=nums[i];
        }

         for(int i=mid;i<numslen;i++)
        {
            rightHalf[i-mid]=nums[i];
        }
mergesort(leftHalf);
mergesort(rightHalf);

//call the sorted merge 

merge(nums,leftHalf,rightHalf);

    }

private static void merge( int nums[],int leftHalf[],int rightHalf [])
{
int leftSize=leftHalf.length;
int rightSize=rightHalf.length;

int i=0,j=0,k=0;

while(i<leftSize && j<rightSize)
{
    if(leftHalf[i]<=rightHalf[j])
    {
        nums[k]=leftHalf[i];
        i++;
    }
    else
    {
        nums[k]=rightHalf[j];
        j++;
    }
    k++;
}
while(i<leftSize)
{
    nums[k]=leftHalf[i];
    i++;
    k++;
}
while(j<rightSize)
{
    nums[k]=rightHalf[j];
    j++;
    k++;
}
}

    public int[] sortArray(int[] nums) {  

        mergesort(nums);

        return nums;
    }
}
