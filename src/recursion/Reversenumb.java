// // Print numbers 5 to 1
// public class Reversenumb{
//     public static void printnumbers(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printnumbers(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printnumbers(n);
//     }
// }
public class Reversenumb{
    public static void printnumbers(int n) {
        if(n >= 6){
            return;
        }
        System.out.println(n);
        printnumbers(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printnumbers(n);
    }
}