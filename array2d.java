import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr ={
            {1,2,3},
            {4,5,6}
        }; 
        System.out.println("2D array elements");
        for(int i= 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
