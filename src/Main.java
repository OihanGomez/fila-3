import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Introduce una cadena de texto: ");
        String cadena = scanner.next();

        // ver cuantas mayusculas tiene la cadena.
        int cantidadMayusculas= 0;
        for (int i = 0; i < cadena.length(); ++i){
        if (Character.isUpperCase(cadena.charAt(i))){
            cantidadMayusculas++;
        }
        System.out.println("La cadena de texto "+cadena+" tiene un total de "+cantidadMayusculas+" mayusculas.");

        // Ver si el string es palindromo.
        System.out.println("Escribe un texto para ver si es palíndromo");
        System.out.print("> ");
        String textPal = scanner.next();
        sc.nextLine();
        String textReverse = "";
        for(int i = textPal.length() - 1; i >= 0; i--){
            textReverse += textPal.charAt(i);
        }
        String resultText = textPal.equals(textReverse) ? "Es palíndromo" : "No es palíndromo";
        System.out.println(resultText);

        // Si no es primo, factorizarlo.
        System.out.println("Escribe un número para saber si es primo. Si no lo es se factoriza");
        System.out.print("> ");
        int numPrimo = scanner.nextInt();
        boolean isPrimo = true;
        for(int i = 2; i <= Math.round(numPrimo / 2); i++){
            if(numPrimo % i == 0) isPrimo = false;
        }
        if(isPrimo){
            System.out.println("El número es primo");
        } else{
            System.out.println("El número no es primo");
            String textFactoriales = "Factoriales de " + numPrimo + ": ";
            for(int i = 1; i <= Math.round(numPrimo / 2); i++){
                if(numPrimo % i == 0) textFactoriales += i + ", ";
            }
            textFactoriales += numPrimo;
            System.out.println(textFactoriales);
        }

        // Mostrar el tamaño de la cadena.
    }
}
