// GroupWork.java
import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("COLLAB CALCULATION\n");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method
        System.out.println("Multiply: " + Calculator.mul(num1, num2));  // Group 3's method
        System.out.println(" (GROUP 10 Candilada, Villoso, Maravilla," + 
                        " Saren, Bolando, Agustin, Eugenio, Oracion, Bobis, Geguiera, Dionisio) ) Are they equal? " + Calculator.isEqual(num1, num2));  // Group 10's method
                        // Group 5: Modulus Method (Members: Cangmaong, Mendez, Palalay, Pablete, Ruel, Desoy, Montenegro)
         System.out.println("(GROUP 5 - Cangmaong, Mendez, Palalay, Pablete, Ruel, Desoy, Montenegro) Remainder: " + Calculator.modulus(num1, num2));  // Group 5's method

        System.out.println(" (Group 3 De Belen, Magusib, M. Conde, Apolonio, Fabian, Servandil," +
        " Alava, Valdez, Briones, Destajo, Bargaso)) Multiply: " + Calculator.mul(num1, num2));  // Group 3's method
        System.out.println(" (GROUP 10 Candilada, Villoso, Maravilla," + 
                        " Saren, Bolando, Agustin, Eugenio, Oracion, Bobis, Geguiera, Dionisio) ) Are they equal? " + Calculator.isEqual(num1, num2));  // Group 10's method
        System.out.println("Divide: " + Calculator.div(num1, num2));
        System.out.println("Group4 Occiano, Sibulo, Del rosario, Armiger, Taer, Permejo, Mapula");

    }
}
