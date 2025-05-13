package Bit_Manipulation;

public class Hamming_Distance {
    public static void hammingDistance(String[] binary) {
        int count = 0;
        
        for (int i = 0; i < binary.length - 1; i++) {
            for (int j = 0; j < 4; j++) {
                if (binary[i].charAt(j) != binary[i + 1].charAt(j)) {
                    count++;
                }

            }
            if (i == binary.length - 2) {
                for (int j = 0; j < 4; j++) {
                    if (binary[0].charAt(j) != binary[i + 1].charAt(j)) {
                        count++;
                    }

                }
            }
            
        }
        System.out.print("The total Hamming Distance is : "+count);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 8 };
        String[] binary = new String[arr.length];
        // for (int i=0; i<arr.length; i++){
        // binary[i] = Integer.toBinaryString(arr[i]);

        // }
        for (int i = 0; i < arr.length; i++) {
            // Convert decimal to binary and pad to 4 bits
            binary[i] = String.format("%4s", Integer.toBinaryString(arr[i])).replace(' ', '0'); // Pad with zeros on the left if necessary
        }
        // for (String ele : binary) {
        //     System.out.print(ele + " ");
        // }
        hammingDistance(binary);
    }
}
