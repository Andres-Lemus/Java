public class Figuras {
    public static void main(String args[]){
        int filas = 4, columnas = 10;
        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        int filas1 = 5, columnas1 = 1;
        for (int j = 0; j < filas1; j++) {
            for (int i = 0; i < columnas1; i++) {
                System.out.print("*");
            }
            ++columnas1;
            System.out.print("\n");
        }

        System.out.print("\n");

        int filas2 = 5, columnas2 = 5, inicio = 4;
        for (int j = 0; j < filas2; j++) {
            for (int i = 0; i < columnas2; i++) {
                if (i >= inicio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  
                }  
            }
            --inicio;
            System.out.print("\n");
        }

        System.out.print("\n");

        // Desafío personal - Creación de rombo
        int filas3 = 5, columnas3 = 5, centro = 4;
        for (int j = 0; j < filas3; j++) {
            for (int i = 0; i < columnas3; i++) {
                if (i >= centro) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  
                }  
            }
            
            for (int i = columnas3; i > 0; i--) {
                if (i > centro) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  
                }  
            }
            --centro;
            System.out.print("\n");
        }
        centro = columnas3 - 1;
        for (int j = 0; j < filas3; j++) {
            for (int i = columnas3; i > 0; i--) {
                if (i > centro) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");  
                }  
            }

            for (int i = 0; i < columnas3; i++) {
                if (i >= centro) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");  
                }  
            }
            --centro;
            System.out.print("\n");
        }
    
    }
}
