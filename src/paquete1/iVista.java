package paquete1;

import java.util.ArrayList;

public interface iVista {
	
	String Separador = "#";
	
	int mostrarMenu(ArrayList<String> menu);
	
	void mostrarLibreta(ArrayList<String> libreta);
	
	int eliminarContacto(ArrayList<String> cont);
	
	String agregarContacto();
	

}
