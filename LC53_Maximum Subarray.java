class LC53_Maximum {
    public int maxSubarray(int[] arr){
        int cursum = arr[0];
        int maxsum = arr[0];
        for(int i =1;i<arr.length;i++){
            cursum = Math.max(arr[i],cursum+arr[i]);
            maxsum = Math.max(maxsum,cursum);
        }
        return maxsum;
    }

}
/*
arr[0] coz if the array has nly negative nums the maxsum will be the max negative num in the array
cursum = Math.max(arr[i],cursum+arr[i]) -> we are checking if the current num is greater than the sum of the current num and the previous sum
maxsum = Math.max(maxsum,cursum) -> we are checking if the current sum is greater than the previous maxsum 
 */