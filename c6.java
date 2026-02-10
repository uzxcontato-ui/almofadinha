import java.util.Scanner;
// bitwise (bit a bit) - tipo long

public class c6 {

    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);    
        System.out.printf("Primeiro numero da operação %s (representação binária %s)\n", value1, binary1);

        var value2 = 12;
        var binary2 = Integer.toBinaryString(value2);  
        System.out.printf("Segundo numero da operação %s (representação binária %s)\n", value2, binary2);

        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (binário: %s)\n", value1, value2, result, binaryResult);

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
    
    /*
    
    */
}
