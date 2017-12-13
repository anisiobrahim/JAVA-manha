package avaliacao2;

public class Quadrado {
	
	public static boolean compara(double i) {
		Double resultado = Math.sqrt(i);
		if (resultado != null) {
			return (resultado.intValue() == resultado.doubleValue());
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		double i = 100;
		if (compara(i)) {
			System.out.println("Quadrado Perfeito");
		}else{
			System.out.println("Não é quadrado perfeito");
		}
	}

}
