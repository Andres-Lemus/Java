package s11_ejercicios;

class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo() {}
	
	public Nodo(int dato, Nodo siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}

class Listado {
	private Nodo primero;
	private int cantidad;
	
	public Listado() {
		primero = null;
		cantidad = 0;
	}
	
	public Nodo buscar(int valor) {
		Nodo actual = primero;
		Nodo buscado = new Nodo();
	    while (actual.getSiguiente()!= null){
	    	if (actual.getDato() == valor) {
				buscado = actual;
				break;
			}
	        actual = actual.getSiguiente();
	    }
	    if (buscado.getSiguiente()==null) {
	    	System.out.println("Nodo no encontrado");
		}
	    return buscado;
	}
	
	public void insertar (int elemento){ 
	    Nodo nuevo = new Nodo(elemento, null);
	    if (primero == null){
	    primero = nuevo;
	    }
	    else {
	        Nodo actual = primero;
	        while (actual.getSiguiente()!= null){
	            actual = actual.getSiguiente();
	        }
	        actual.setSiguiente(nuevo);
	        cantidad++;
	    }
	}
	
	public void borrar (int elem){
	    if (primero == null) 
	        System.out.println("lista vacía");
	    else
	        if (primero.getDato()== elem){
	        primero = primero.getSiguiente();
	        cantidad--;
	        }
	        else {
	            Nodo actual = primero;
	            while (actual.getSiguiente()!=null && actual.getSiguiente().getDato() != elem)
	                actual = actual.getSiguiente();
	                if (actual.getSiguiente()== null )
	                    System.out.println ("elemento "+elem+" no esta en la lista");
	                else{
	                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
	                    cantidad--;
	                }
	        }
	} 
	
	public void listar(){ 
	    Nodo actual = primero;
	    while (actual.getSiguiente()!= null){
	        System.out.println(actual.getDato());
	        actual = actual.getSiguiente();
	    
	    }
	    System.out.println(actual.getDato());
	}
}

public class ListaLigada {
	public static void main(String[] args) {
		Listado listaNodos = new Listado();
		listaNodos.insertar(15);
		listaNodos.insertar(33);
		listaNodos.insertar(2);
		listaNodos.insertar(45);
		listaNodos.listar();
		System.out.println();
		Nodo busqueda = listaNodos.buscar(2);
		listaNodos.insertar(23);
		System.out.println("Nodo valor: " + busqueda.getDato() + " Siguiente: " + busqueda.getSiguiente());
		listaNodos.borrar(15);
		listaNodos.listar();
	}
}
