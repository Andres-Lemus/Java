public class Tablas2 {
    public static void main(String args[]){
        for (int j = 1; j <= 20; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.println(j + "x" + i + "=" + (j * i));
            }
            System.out.println("\n");
        }
    }
}
