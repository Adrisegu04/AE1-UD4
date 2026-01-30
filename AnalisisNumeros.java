package Actividad;

public class AnalisisNumeros {

    public static void main(String[] args) {

        // Array de números
        int[] numeros = {4, 7, 2, 9, 2, 5};

        // Variable para guardar el número mayor
        int mayor = numeros[0];

        // Variable para contar cuántas veces aparece el mayor
        int contador = 0;

        // Bucle para encontrar el número más mayor del array
        for (int dato = 1; dato < numeros.length; dato++) {
            if (numeros[dato] > mayor) {
                mayor = numeros[dato];
            }
        }
        
        /*Lo primero que hay que hacer es hacer el array de numeros
         * Lo segundo es dividirlo en dos variables, una de valor y otra de repeticiones
         * Hacemos bucles para que nos salga el número más alto y las repeticiones
         * Y despues ponemos lo que queremos que se muestre por pantalla
         */
        

        // Bucle para contar cuántas veces aparece el número mayor
        for (int dato = 0; dato < numeros.length; dato++) {
            if (numeros[dato] == mayor) {
                contador++;
            }
        }

        // Esto muestra el resultado por pantalla
        System.out.println("Mayor: " + mayor + ", Repeticiones: " + contador);
    }
}
