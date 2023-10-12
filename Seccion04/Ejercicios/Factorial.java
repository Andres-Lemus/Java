public class Factorial {
    public static void main(String args[]){
        int numero = 7, factorial = 1;
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);
    }
}
