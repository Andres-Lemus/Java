package s14_ejercicios.fumadores;

public class SalaFumadores {
	public static int mesa = 0;
	public static boolean alguienFumando = false;
	 
	public synchronized void entrafumar(int ingrediente){
		while(mesa != ingrediente || alguienFumando){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		mesa = 0; 
		alguienFumando = true;
	}
	
	 public synchronized void terminafumar(){
		 alguienFumando = false;
		 notifyAll();
	 }
	 
	 public synchronized void colocar(int noesta){
		 while(mesa != 0 || alguienFumando){
			 try {
				 wait();
			 } catch (InterruptedException e) {e.printStackTrace();} 
		 }
		 mesa = noesta;
		 System.out.println("En la mesa no hay ingrediente "+ mesa);
		 notifyAll();
	 }
}
