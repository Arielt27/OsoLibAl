import hn.edu.ujcv.progra.OVecR2;

public class Main
{
    public static void main(String[] args)
    {
        // CREACIÓN DE LOS OBJETOS (VECTORES)
        OVecR2 V1 = new OVecR2(6,2);

        OVecR2 V2 = new OVecR2(4,8);


        // PROGRAMA PRINCIPAL

        System.out.println("***LIBRERIA DE ALGEBRA LINEAL***");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + V1);                  // Mostrando Objeto Vector llamado V1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + V2);                  // Mostrando Objeto Vector llamado V2
        System.out.println(" ");

        System.out.println("Suma de Vectores en R2" + V2.suma(V1));   // Aplicando Metodo Suma de Clase OvecR2
        System.out.println(" ");

        System.out.println("Resta de Vectores en R2" + V1.resta(V2)); // Aplicando Metodo Resta de Clase OvecR2
        System.out.println(" ");


    }
}
