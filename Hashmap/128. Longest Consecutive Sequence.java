class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        int currentLongest=1;
        Arrays.sort(nums);
        if (nums.length==0){
                       return 0;
                }
       
         for (int i = 1; i < nums.length; i++) {
              if (nums[i] != nums[i-1]) {
                     if (nums[i]==(nums[i-1]+1)){
                         currentLongest++;

                    }



                     else{
                          
                         if(longest<=currentLongest){

                             longest=currentLongest;

                            
                            }
                         currentLongest=1;

                    }

              }
            if (i==nums.length-1){
                            if(longest<currentLongest){

                               longest=currentLongest;

                            }
                    }

            }
        return longest;
    }
        
}