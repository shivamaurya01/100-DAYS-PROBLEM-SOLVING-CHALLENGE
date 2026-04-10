// 283. Move Zeroes
// Hint
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

public class moveszerotoend {
    public static void main(String[] args) {
        int [] nums = {1,2,0,4,0,5,0};
        int n = nums.length;
        int k=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<n){
            nums[k]=0;
            k++;

        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
       
    }
}

