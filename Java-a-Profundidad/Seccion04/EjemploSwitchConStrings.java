public class EjemploSwitchConStrings {
    public static void main(String args[]){
        String opcion = "uno";
        switch(opcion){
            case "cero":
                System.out.println("Caso cero");
            break;
            case "uno": 
                System.out.println("Caso uno");
            break;
            case "dos": 
                System.out.println("Caso dos");
            break;
            default: 
                System.out.println("Caso default");
            break;
            
        }
    }
}
