import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;

public class Main
{
    public static void main(String[] args)
    {
        // CREACIÓN DE LOS OBJETOS (VECTORES)

          // Vectores en R2

        OVecR2 V1 = new OVecR2(6,4);

        OVecR2 V2 = new OVecR2(4,3);

          // Vectores en R3

        OVecR3 Ve1 = new OVecR3(2,6,3);

        OVecR3 Ve2 = new OVecR3(1,3,4);

        OVecR3 Ve3 = new OVecR3(5,4,7);

        // PROGRAMA PRINCIPAL

          // Vectores en R2

        System.out.println("***LIBRERIA DE ALGEBRA LINEAL***");
        System.out.println(" ");

        System.out.println("VECTORES EN R2 ");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + V1);                    // Mostrando Objeto Vector llamado V1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + V2);                    // Mostrando Objeto Vector llamado V2
        System.out.println(" ");

        System.out.println("Suma de Vectores en R2 " + V2.suma(V1));     // Aplicando Metodo Suma de Clase OvecR2
        System.out.println(" ");

        System.out.println("Resta de Vectores en R2 " + V1.resta(V2));   // Aplicando Metodo Resta de Clase OvecR2
        System.out.println(" ");

          // Vectores en R3

        System.out.println("VECTORES EN R3 ");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + Ve1);                   // Mostrando Objeto Vector llamado Ve1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + Ve2);                   // Mostrando Objeto Vector llamado Ve2
        System.out.println(" ");

        System.out.println("El Vector 3 es: " + Ve3);                   // Mostrando Objeto Vector llamado Ve3
        System.out.println(" ");

        System.out.println("Suma de Vectores en R3 " + Ve2.suma(Ve1));   // Aplicando Metodo Suma de Clase OvecR3
        System.out.println(" ");

        System.out.println("Resta de Vectores en R3 " + Ve1.resta(Ve3)); // Aplicando Metodo Resta de Clase OvecR3
        System.out.println(" ");
    }
}
