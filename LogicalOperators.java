    
    public class LogicalOperators {
    public static void main(String[] args) {
        // Operador AND (&&)
        System.out.printf("true && true   = %s%n", true && true);
        System.out.printf("true && false  = %s%n", true && false);
        System.out.printf("false && true  = %s%n", false && true);
        System.out.printf("false && false = %s%n", false && false);

        System.out.println("----------------------------");

        // Operador OR (||)
        System.out.printf("true || true   = %s%n", true || true);
        System.out.printf("true || false  = %s%n", true || false);
        System.out.printf("false || true  = %s%n", false || true);
        System.out.printf("false || false = %s%n", false || false);

        System.out.println("----------------------------");

        // Operador NOT (!)
        System.out.printf("!true  = %s%n", !true);
        System.out.printf("!false = %s%n", !false);
    }
}


