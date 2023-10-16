public class Persona {
    String nombre;
    int edad;
    char genero;

    Persona() {
        System.out.println("Esto es un constructor");
    }

    Persona(String n, int ed, char g) {
        nombre=n;
        edad=ed;
        genero=g;
    }

    void jugarVideojuegos(Persona p){
        System.out.println(nombre + " esta jugando con " + p.nombre);
    }

    void ImprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    public static void main(String args[]){
        Persona p = new Persona("Andres",22,'M');
        p.ImprimirInformacion();

        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 51;
        p1.genero = 'M';
        p1.ImprimirInformacion();

        p.jugarVideojuegos(p1);
    }
}
