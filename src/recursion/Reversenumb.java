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
// // Print numbers 1 to 5
// public class Reversenumb{
//     public static void printnumbers(int n) {
//         if(n >= 6){
//             return;
//         }
//         System.out.println(n);
//         printnumbers(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printnumbers(n);
//     }
// }
// // print sum of n natuaral numbers
// public class Reversenumb{
//     public static void printsum(int i, int n, int sum) {
//        if(i == n){
//         sum +=i;
//         System.out.println(sum);
//         return;
//        }
//         sum +=i; 
//         printsum(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//      printsum(1,5 , 0);   
//     }
// }