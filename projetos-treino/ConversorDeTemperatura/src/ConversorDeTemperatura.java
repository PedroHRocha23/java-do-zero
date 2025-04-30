import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void celsiusToFarenheit(float tcelsius){
        float tfarenheit = (((9.0f/5.0f)*(tcelsius))+32.0f);
        System.out.println("Celsius: " + tcelsius + "°C -> Farenheit: " + tfarenheit + " °F");
    }

    public static void farenheitToCelsius(float tfarenheit){
        float tcelsius = ((5.0f/9.0f) * (tfarenheit - 32.0f));
        System.out.println("Farenheit: " + tfarenheit + "°F -> Celsius: " + tcelsius + " °C");
    }

    public static void menu(){
        System.out.println(
                """
                    Converter:
                    1 - Celsius to Farenheit
                    2 - Farenheit to Celsius
                    
                    Choose an option:          
                """
        );
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        menu();
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter the value: ");
                float celsius = input.nextFloat();
                celsiusToFarenheit(celsius);
                break;

            case 2:
                System.out.println("Enter the value: ");
                float farenheit = input.nextFloat();
                farenheitToCelsius(farenheit);
                break;

            default:
                System.out.println("Invalid option!");
        }
    }
}
