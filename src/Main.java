import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//Con el scanner coger un numero entero positivo y una cadena.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Introduce una cadena de texto: ");
        String cadena = scanner.next();
//Ver si el string es palindromo.

//ver cuantas mayusculas tiene la cadena.
        int cantidadMayusculas= 0;
        for (int i = 0;i<cadena.length();++i){
    if (Character.isUpperCase(cadena.charAt(i))){
        cantidadMayusculas++;
    }
}

        System.out.println("La cadena de texto "+cadena+" tiene un total de "+cantidadMayusculas+" mayusculas.");
//Si no es primo, factorizarlo.

//Mostrar el tamaño de la cadena.
    }
}
