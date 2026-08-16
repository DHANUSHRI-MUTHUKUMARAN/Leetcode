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
we are tracking the position of the next non-zero element
*/