public class SecondLargest{
    public static void getElements(int[]arr,int n){
        if(n>2){
            System.out.println(-1+" "+-1);
            return;
        }
        // Variable Intialization
        
        int largest= Integer.MIN_VALUE; int sec_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; int sec_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,9,2};
        int n = arr.length;
    }
}