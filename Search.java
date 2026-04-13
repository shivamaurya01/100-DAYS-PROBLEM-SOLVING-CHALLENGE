public class Search{
    public static void main(String[] args){
        int [] nums = {1,2,5,6,7,8,5};
        int target = 8;
        int n = nums.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]== target){
                System.out.print(mid);
                break;
            } 
            else if(nums[mid] < target){
                lo = mid+1;
            } 
            else {
                hi=mid-1;
            }

        }
        // System.out.println("Not Found");
    }
}