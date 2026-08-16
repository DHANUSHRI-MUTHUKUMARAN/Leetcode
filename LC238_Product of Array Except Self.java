class LC238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int [n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            res[i] *=right;
            right *= nums[i];
        }
        return res;
    }
}
/*
how this works
1st pass: it contains all the prds of the left elements
2nd pass: it contains all the prds of the right elements
egs: [1,2,3,4] -> [24,12,8,6]
1st pass: [1,1,2,6]
-> step 1= res[0] =1
-> step 2= res[1] = res[0]*nums[0] = 1*1=1
-> step 3= res[2] = res[1]*nums[1] = 1*2=2
-> step 4= res[3] = res[2]*nums[2] = 2*3=6
[1,1,2,6]
2nd pass: [24,12,8,6]
->step 1= right =1, res[3] = res[3]*right = 6*1=6, right = right*nums[3] = 1*4=4
->step 2= right =4, res[2] = res[2]*right = 2*4=8, right = right*nums[2] = 4*3=12
->step 3= right =12, res[1] = res[1]*right = 1*12=12, right = right*nums[1] = 12*2=24
->step 4= right =24, res[0] = res[0]*right = 1*24=24, right = right*nums[0] = 24*1=24
                    from here [24,12,8,6]
*/