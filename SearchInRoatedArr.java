// leetcode problem no 33. Search in Rotated Sorted Array
public class SearchInRoatedArr {
     public static void main(String[] args) {
        int [] arr = {4,5,6,9,0,1,2};
        int key = 10;
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==key){
               System.out.print(mid);
               return ;
            }
            //left part lo to mid is sorted
            else if(arr[mid]>=arr[lo]){
                if((arr[lo] <= key) && (key < arr[mid])){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            //right part is sorted mid to hi 
            else{
                if((arr[mid] < key) && (key <= arr[hi])){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        System.out.println(-1);
    }
}
