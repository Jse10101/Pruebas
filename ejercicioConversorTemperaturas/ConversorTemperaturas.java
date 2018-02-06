package ejercicioConversorTemperaturas;

public class ConversorTemperaturas {

	public static void main(String[] args) {
		double farenheit;
		double reamur;
		System.out.println("Celsius\t\tFarenheit\tReamur");
		for(int celsius = 0; celsius<100; celsius+=5) {
			farenheit = ((double) 9/5)*celsius+32;
			reamur = ((double)4/5*celsius);
			System.out.println(celsius+"\t\t"+farenheit+"\t\t"+reamur);
		}

	}

}
