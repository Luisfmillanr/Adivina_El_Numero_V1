import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias para generar números aleatorios y leer desde la consola
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generar un número aleatorio entre 0 y 100 y establecer el número máximo de intentos
        int numeroSecreto = random.nextInt(101);
        int numeroIntentos = 5;

        // Instrucciones iniciales del juego
        System.out.println("Bienvenido al juego adivina el numero!, tienes que adivinar el numero del 1 al 100 que he pensado");

        // Bucle for para controlar el número de intentos del jugador
        for (int intento = 1; intento <= numeroIntentos; intento++) {
            System.out.println("Intento " + intento + ": Introduce tu numero: ");
            int numeroJugador = scanner.nextInt(); // Leer el número ingresado por el usuario

            // Comparar el número ingresado por el usuario con el número secreto
            if (numeroJugador == numeroSecreto) {
                System.out.println("Correcto ese es el numero lo adivinaste en: " + intento + " intentos");
                break; // Salir del bucle si el usuario adivina el número
            } else if (numeroJugador < numeroSecreto) {
                System.out.println("El número es mayor que " + numeroJugador + ".");
            } else {
                System.out.println("El número es menor que " + numeroJugador + ".");
            }

            // Si el jugador alcanza el último intento sin adivinar, mostrar mensaje final
            if (intento == numeroIntentos) {
                System.out.println("Lo Siento, parece que los números no son lo tuyo. El número era: " + numeroSecreto);
            }
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
