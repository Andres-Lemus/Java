public class EjemploFor {
    public static void main(String args[]){
        outer: for (int j = 0; j <= 10; j++) {
            System.out.println("Imprimiendo tabla del " + j + "\n");
            inner: for (int i = 0; i <= 10; i++) {
                if(i % 2 == 0){
                    break outer;
                }
                System.out.println(j + "x" + i + "=" + (j * i));
            }
        }
        
    }
}
