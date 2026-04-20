public class findEvenNumber {
    public static void main(String[] args) {
        int nums[] = {223,12,24,2245,1,3};
        int evencount = 0;
        for(int num : nums){
            if( (num >= 10 && num <= 99) || 
                (num >= 1000 && num <= 9999) || 
                (num == 100000) ){
                evencount++;
            }
        }
        System.out.println(evencount);
    
    }
}

