public class Sqrt {
    public static void main(String[] args) {
        int n = 25;
        if(n==0) {
            System.out.print(0);
        }
        int lo =1,hi=n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(mid==n/mid) {
                System.out.print(mid);
                return;
            }
            else if(mid>n/mid) hi=mid-1;
            else lo=mid+1;
        }
        System.out.print(hi);
        
        
    }
}
