import javax.swing.JOptionPane;

public class ejercicio4 {
	static double base=0;
	static double altura=0;
	public static void main(String[] args) {
		String resp;
		do {
			triangulo();
			resp=JOptionPane.showInputDialog("desea continuar??");
		} while (resp.equalsIgnoreCase("si"));

	}

	private static void triangulo() {
		base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del tringulo"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del tringulo"));
		
		if (base<=0) {
			System.out.println("no se puede ingresar numeros negativos");
	
		}else if (altura<=0) {
			System.out.println("no se puede ingresar numeros negativos");
	
		}else {
			double area=(base*altura)/2;
			System.out.println("el area del triangulo es: "+area);
		}

	}
	


}
