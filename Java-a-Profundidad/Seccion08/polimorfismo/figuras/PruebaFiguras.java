package polimorfismo.figuras;

public class PruebaFiguras {
	
	void imprimirFigura(Figura figura) {
		System.out.println("El color de la figura es " + figura.getColor() + " y tiene un area de " + figura.calcularArea());
	}
	
	public static void main(String[] args) {
		//Figura f = new Figura("");
		PruebaFiguras p = new PruebaFiguras();
		p.imprimirFigura(new Circulo("Rojo", 10.0f));
		p.imprimirFigura(new Cuadro("Verde", 125.2f));
		p.imprimirFigura(new Rectangulo("Azul", 20, 10));
	}
}
