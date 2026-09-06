class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        int[] val = new int[nums.length];
        int[] freq = new int[nums.length];
        int[] res = new int[k];

        int i = 0;
        int count = 1;
        int inc = 0;

       while(i<nums.length)
        {
            int j=i+1;
            while (j < nums.length && nums[i] == nums[j])
            {
                count++;
                j++;
            }

            val[inc] = nums[i];
            freq[inc] = count;
            inc++;

            i = j;
            count = 1;
        }

        int ind = 0;
        int l = 0;             
        while (l < k)
        {
            int max = freq[0];
           int r=0;
            for (i = 1; i < val.length; i++)
            {
                if (freq[i] > max)
                {
                    max = freq[i];
                    r = i;
                }
            }

            res[ind] = val[r];
            freq[r] = 0;

            ind++;
            l++;
        }

        return res;
    }
}