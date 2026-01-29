import java.util.Scanner;
package OOPS_590011772.patterns;

public class HollowRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows = ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=n; j++){
                if(i>0 && j>0 && i<n+1 && j<n){
                    System.out.print("  ");
                }
                else{
                    System.out.print()
                }
            }
        }
    }
}
