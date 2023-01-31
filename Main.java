import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Üçgenin Yükseliği kaç basamak olsun: ");
        int n = imp.nextInt();

        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (int k =0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}