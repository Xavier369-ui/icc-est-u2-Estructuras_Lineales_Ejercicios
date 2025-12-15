import java.util.Stack;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estudiante: Xavier Fajardo");
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }
    public static void runSignValidator(){
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
        System.out.println();

    }
    private static void runStackSorter() {
        // ejecución del Ejercicio 02
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        StackSorter sorter = new StackSorter(); 

        System.out.println("Stack original: " + stack);
        sorter.sort(stack);                     
        System.out.println("Stack ordenado: " + stack);
        System.out.println();

    }

    private static void runQueuePalindrome() {
        // ejecución del Ejercicio 03
        QueueUtils queueUtils = new QueueUtils();

        String[] pruebas = {"ana", "radar", "java"};

        for (String s : pruebas) {
            System.out.println(
                "Texto: " + s + " es palindromo? " + queueUtils.isPalindrome(s)
            );
        }
    }
}
