import java.util.*;
class TemperaturConversionCelsius  {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int celsius=sc.nextInt();
		double fahrenheitResult=((celsius*9)/5)+32;
		System.out.println("The "+celsius+" celsius is "+fahrenheitResult+"fahrenheit");
	}
}