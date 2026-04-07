

public class SearchInDescOrd {
    public static void main(String args[]){
        int [] arr = {100,91,88,76,62,52,43,35,29,13,5};
        int tar = 100;
        int lo =0,hi=arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==tar){
                System.out.print(mid);
                return;
            }else if(arr[mid]>tar){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
    }
}
