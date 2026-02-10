import java.util.Scanner;

public class coperadores {
    public class void main(String[] args){
    var scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro numero: ");
    var value1 = scanner.nextInt();
    System.out.printf("a raiz quadradda de %s e %s\n",value1 ,Math.pow(value1,2));
    //System.out.println("Informe o primeiro numero: ");
    //var value2 = scanner.nextInt();
    System.out.printf(value1 +"+"+value2 + "="+ value1 + value2);
    // System.out.printf("%s + %s = %s \n", value1, value2, value1 + value2);
    // System.out.printf("%s / %s = %s \n", value1, value2, value1 / value2);aqui temos que trabalhr com float em alguns casos 
    // System.out.printf("%s %% %s = %s \n", value1, value2, value1 % value2);
    // System.out.printf("%s * %s = %s \n", value1, value2, value1 * value2);
    }

    /*public class void main(String[] args){
        //var value = 5 + 9 * 18 - 5/2;
        var value = 5;
        value += 12;
        //value *= /= -=
        System.out.println(value);
    */
}
