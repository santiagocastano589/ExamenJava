import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		int cantMeses=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses"));
		if (cantMeses<=0) {
			System.out.println("la cantidad de meses no puede ser cero o menor");
			return;
		}
		
		String[] meses=new String[cantMeses];
		double[] ventas=new double[cantMeses];
		
		for (int i = 0; i < cantMeses; i++) {
			String mes=JOptionPane.showInputDialog("ingrese mes #"+(i+1));
			meses[i]=mes;
			double venta=Double.parseDouble(JOptionPane.showInputDialog("ingrese las ventas en el mes "));
			ventas[i]=venta;
		}
		double sumaVentas = 0;
		for (int i = 0; i < cantMeses; i++) {
			sumaVentas+=ventas[i];
		}
		double promedioMes=sumaVentas/cantMeses;
		
		   int mesVentasAltas = 0;
	       int mesVentasBajas = 0;

	        for (int i = 1; i < cantMeses; i++) {
	            if (ventas[i] > ventas[mesVentasAltas]) {
	                mesVentasAltas = i;
	            }
	            if (ventas[i] < ventas[mesVentasBajas]) {
	                mesVentasBajas = i;
	            }

	        }
	        
	        System.out.println("promedio ventas mes: "+promedioMes);
	        System.out.println("el mes con las ventas mas altas fue el mes de: "+meses[mesVentasAltas]+" con un total de: "+ventas[mesVentasAltas]);
	        System.out.println("el mes con las ventas mas bajas fue el mes de: "+meses[mesVentasBajas]+" con un total de: "+ventas[mesVentasBajas]);
	}
	

	

}
