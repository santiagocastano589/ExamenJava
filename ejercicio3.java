import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ejercicio3 {
	static double hora=2000;
	static int cantidadAnios;
	static double salario;
	static int horasTrabajadas=0;
	static double descuentoAntiguedad;

	public static void main(String[] args) {
		String resp;
		do {
			trabajador();
			resp=JOptionPane.showInputDialog("desea continuar??");
		} while (resp.equalsIgnoreCase("si"));

	}

	private static void trabajador() {
		salario=hora*horasTrabajadas;
		descuentoAntiguedad=0;
		ArrayList persona=new ArrayList();
		String nombre=JOptionPane.showInputDialog("ingrese nombre del trabajador");
		String documento=JOptionPane.showInputDialog("ingrese documento");
		horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("ingrese horas trabajadas"));
		cantidadAnios=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de años que lleva trabajando"));
		persona.add("nombre del trabajador: "+nombre);
		persona.add("documento: "+documento);
		persona.add("horas trabajadas: "+horasTrabajadas);
		persona.add("cantidad de años trabajados: "+cantidadAnios);
		salario=hora*horasTrabajadas;
		
		if (cantidadAnios>=4) {
			descuentoAntiguedad=salario-(salario*0.10);
			persona.add("descuento : "+descuentoAntiguedad);
		}else {
			persona.add("salario del trabajador: "+salario);
		}
		
		
		
		System.out.println(persona);
		
	}



}
