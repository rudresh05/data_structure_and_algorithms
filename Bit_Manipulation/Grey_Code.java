package Bit_Manipulation;
import java.util.*;

public class Grey_Code {
    public static List<Integer> greyCode(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<Math.pow(2,n); i++){
            list.add(i^(i>>1));
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(greyCode(n));
        sc.close();
    }
}
