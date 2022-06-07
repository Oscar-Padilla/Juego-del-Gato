import java.util.Scanner;
public class JuegoDelGato 
{
    public static void main(String[] args) 
    {
        int x1, y1, columna, fila;                                              //Declaramos las variables para la creacion de la matriz y para navegar dentro de la matriz
        Scanner leer = new Scanner(System.in);
        String matriz[][] = new String[3][3];                                   //Creamos la matriz de 3x3 del gato
        String Signo;
        for (x1 = 0; x1 < 3; x1++) 
        {
            for (y1 = 0; y1 < 3; y1++) 
            {
                matriz[x1][y1] = "*";                                           //Se usa doble for al tratarse de una matriz ya que como sabemos esta tiene dos ejes
                System.out.print(matriz[x1][y1]);
                if(y1<2)
                {
                    System.out.print("|");                                      //Esta sentencia solo se coloca en medio de los asteriscos
                }
            }
            System.out.println("");
            System.out.println("-----");
        }
        for (int i = 0; i < 9; i++)                                             //El ciclo es hasta 9 ya que son los turnos maximos de un gato
        {
            System.out.println("Ingrese la fila: ");
            fila = leer.nextInt();
            System.out.println("Ingrese la columna: ");
            columna = leer.nextInt();
            System.out.println("Ingrese el simbolo: ");
            Signo = leer.next();
            matriz[fila][columna] = Signo;                                      //Toma las coordenadas, las ubica en la matriz y mete el signo del usuario en esa posicion
            for (columna = 0; columna < 3; columna++)
            {
                for (fila = 0; fila < 3; fila++) 
                {
                    System.out.print(matriz[columna][fila]);                    //Se vuelve a imprimir la matriz del gato para dar continuacion al juego sin perder los signos antes ingresados
                    if(fila<2)
                    {
                        System.out.print("|");
                    }
                }
                System.out.println("");
                System.out.println("-----");
            }
        }
    }
}
