import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        float tempFahrenheit = 0;
        float tempCelsius = 0;

        System.out.print("Temperatura em Fahrenheit: ");
        tempFahrenheit = console.nextFloat();

        tempCelsius = 5 * ((tempFahrenheit - 32) / 9);
    
        System.out.printf("Temperatura em Celsius é %.1f", tempCelsius);
        console.close();
    }
}
