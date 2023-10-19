import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		String resp;
		do {
			datos();
			resp=JOptionPane.showInputDialog("desea continuar??");
		} while (resp.equalsIgnoreCase("si"));

	}
	public static void datos() {
		ArrayList persona=new ArrayList();
		String nombre=JOptionPane.showInputDialog("ingrese nombre del estudiante");
		String documento=JOptionPane.showInputDialog("ingrese documento del estudiante");
		String telefono=JOptionPane.showInputDialog("ingrese telefono del estudiante");
		int codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo de la cuidad que desea ir"));
		persona.add("nombre: "+nombre);
		persona.add("documento: "+documento);
		persona.add("telefono: "+telefono);
		persona.add("codigo ciudad: "+codigo);
		
		String[] ciudad=new String[4];
		ciudad[0]="medellin";
		ciudad[1]="bogota";
		ciudad[2]="cartagena";
		ciudad[3]="barranquilla";
		
		String[] fecha=new String[4];
		fecha[0]="06 octubre-8:00am";
		fecha[1]="10 noviembre-6:00pm";
		fecha[2]="05 abril-2:00pm";
		fecha[3]="04 mayo-4:00am";
		
		if (codigo==1) {
			persona.add("Ciudad: "+ciudad[0]);
			persona.add("fecha: "+fecha[0]);
		}else if (codigo==2) {
			persona.add("Ciudad: "+ciudad[1]);
			persona.add("fecha: "+fecha[1]);
		}else if (codigo==3) {
			persona.add("Ciudad: "+ciudad[2]);
			persona.add("fecha: "+fecha[2]);
		}else if (codigo==4) {
			persona.add("Ciudad: "+ciudad[3]);
			persona.add("fecha: "+fecha[3]);
		}else {
			System.out.println("codigo invalido");
		}
		
		System.out.println(persona);
		
	}

}
