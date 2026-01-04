import java.util.Scanner;
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        if( a % 2== 0){
            System.out.println(a + "is EVEN ");
        }else{
            System.out.println(a+ "is ODD");
        }
        sc.close();
    }
}
