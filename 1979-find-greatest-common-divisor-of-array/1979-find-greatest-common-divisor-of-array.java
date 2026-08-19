class Solution {
    public int findGCD(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<b){
                b=nums[i];
            }
            if(nums[i]>a){
                a=nums[i];
            }
        }
        return gcd(a,b);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}