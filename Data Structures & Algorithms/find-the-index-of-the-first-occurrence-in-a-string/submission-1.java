class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
        {

            if( (i+needle.length()) <= haystack.length() ) 
            {

                if(haystack.substring(i,i+needle.length()).equals(needle))
                {
                    return i;
                }
            }
            else
            {
                return -1;
            }
        }
    return -1;
}}