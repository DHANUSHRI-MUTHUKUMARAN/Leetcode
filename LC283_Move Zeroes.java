class LC283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pos =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
        
    }
}
/*
LC 283 - i have added the pos tracker of the zeros ... while
 traversing if the pointer faces any non zero element the pos element where the zero is present would be swapped ..
. prev i did it using two pointer whose time complexity is O(n2) now it is O(n)
*/