public class firstandlastPosition {
   public static void main(String[] args) {
        int [] nums = {5,7,8,8,9,10};
        int target = 6;
        int n  = nums.length;
        int lo=0,hi=n-1,ind1=-1,ind2=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target){
                hi = mid-1;
            }else if(nums[mid]<target){
                lo = mid+1;
            }else{//mid==target
                ind1 = mid;
                hi = mid-1;
            }
        }
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target){
                hi = mid-1;
            }else if(nums[mid]<target){
                lo = mid+1;
            }else{//mid==target
                ind2 = mid;
                lo = mid+1;
            }
        }
       System.out.print(ind1 +" "+ ind2);

    }
}
