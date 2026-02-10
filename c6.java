import java.util.Scanner;
//bitwise(bit a bit )-tipo long

public class c6 {

    public static void main(String[] args){
    var value1 = 6;
    var binary = Integer.toBinaryString(value1);    
    System.out.printf("Primeiro numero da operaçao %s (representacao binaria %S)\n", value1, binary1);
    var value2 = 12;
    var binary2 = Integer.toBinaryString(value2);  
    System.out.printf("Primeiro numero da operaçao %s (representacao binaria %S)\n", value2, binary2);
    var result =  value1 | value2;
    var binaryResult = Integer.toBinaryString(result);
    System.out.printf("%s| %s = %s\n", value1, value2, value1 | value2, binaryResult);
    System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

    }
    
    /*
    
    
    
    */
}
