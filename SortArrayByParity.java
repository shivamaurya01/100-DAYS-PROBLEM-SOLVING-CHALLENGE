//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

public class SortArrayByParity {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4,6};
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]%2==0 && nums[i]%2 != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp; 
                }
            }
        }
       for(int i=0;i<n;i++){
        System.out.print(nums[i]+" ");
       }
    }
    
}
