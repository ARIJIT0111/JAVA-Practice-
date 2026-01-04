import java.util.Scanner; 

public class pat6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.print("".repeat(n-1));
            System.out.println("*". repeat(2*i-1));
        }
        sc.close();
    }
}
