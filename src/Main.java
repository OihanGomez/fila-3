import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Con el scanner coger un numero entero positivo y una cadena.

        //Ver si el string es palindromo.
        System.out.println("Escribe un texto para ver si es palíndromo");
        System.out.print("> ");
        String textPal = sc.next();
        sc.nextLine();
        String textReverse = "";
        for(int i = textPal.length() - 1; i >= 0; i--){
            textReverse += textPal.charAt(i);
        }
        String resultText = textPal.equals(textReverse) ? "Es palíndromo" : "No es palíndromo";
        System.out.println(resultText);

        //ver cuantas mayusculas tiene la cadena.

        //Si no es primo, factorizarlo.
        System.out.println("Escribe un número para saber si es primo. Si no lo es se factoriza");
        System.out.print("> ");
        int numPrimo = sc.nextInt();
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

        //Mostrar el tamaño de la cadena.
    }
}
