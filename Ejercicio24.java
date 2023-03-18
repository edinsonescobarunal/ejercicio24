// Capítulo 4: Estructura decisión lógica - Ejercicio 24.

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoEsferaA, pesoEsferaB, pesoEsferaC;

        System.out.println("Ingrese el peso de la esfera A:");
        pesoEsferaA = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoEsferaB = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoEsferaC = entrada.nextDouble();

        if(pesoEsferaA > pesoEsferaB && pesoEsferaA > pesoEsferaC){
            System.out.println("La esfera de mayor peso es: A");
        }
        else if (pesoEsferaB > pesoEsferaA && pesoEsferaB > pesoEsferaC) {
            System.out.println("La esfera de mayor peso es: B");
        }
        else{
            System.out.println("La esfera de mayor peso es: C");
        }
    }
}
