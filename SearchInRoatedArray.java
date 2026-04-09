

public class SearchInRoatedArray {
    // int search(int[] arr, int key) {
    public static void main(String args[]){
        // code here
        int [] arr = {1,2,3,5,6,7,8,10,9,5};
        int key = 3;
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==key){
                // return mid;
                System.out.print(mid);
                break;
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
        // return -1;
        // System.out.print("-1");
        
    }
}
