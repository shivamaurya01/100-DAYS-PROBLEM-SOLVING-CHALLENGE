public class MaximumOnes {
 public static void main(String[] args) {
        int nums[] = {1,2,1,1,1,1}; 
        int count =0;
        int max=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                max = Math.max(max, count);
                count=0;
            }
        }
        //return max if 1 comes at the end
        System.out.println(Math.max(max,count));
    }
}
