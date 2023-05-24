/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicioaprendizaje10;

import java.util.Scanner;

public class EjercicioAprendizaje10 {
    public static void main(String[] args) {
        int limite, suma, numero;
        
        suma = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número límite: ");
        
        limite = entrada.nextInt();
        
        do{
            System.out.print("Ingresa un número: ");
            numero = entrada.nextInt();
            suma = suma + numero;
            
        }while(suma <= limite);
        System.out.println("La suma de números es de "+suma+ " la cual ya superó el límite ingresado");
    }
    
}
