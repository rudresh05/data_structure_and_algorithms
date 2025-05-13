package Bit_Manipulation;

public class BitManipulation {
    public static void getBinary(int num){
        String s = "";
        while(num!=0){
            s=(num&1)+s;
            num = num>>1;
        }
        System.out.print(s);
    }
    public static void findingMissingNumber(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int ele: arr){
            sum =sum -ele;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        // System.out.println(5&3);
        // System.out.println(5|3);
        // System.out.println(15 ^ 5);
        // System.out.println(12<<3);
        // System.out.println(23>>1);
        // System.out.println(12>>3);
        // int num= 7;
        // int t=4;
        int[] arr ={0,4,1,2};
        findingMissingNumber(arr);
        //     if((num & 1<<2)>0){
        //         System.out.println("Bit is set");
        //     }
        //     else{
        //         System.out.println("Bit is not set");
        //     }
        // getBinary(num);
    }
}
