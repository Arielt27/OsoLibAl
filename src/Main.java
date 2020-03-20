import hn.edu.ujcv.progra.LectorTeclado;

public class Main
{
    public static void main(String[] args)
    {
         // CREANDO OBJETO LECTOR TECLADO

        LectorTeclado lt = LectorTeclado.getInstance();

         // PROGRAMA PRINCIPAL

        System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
        System.out.println(" ");

        System.out.println("1- Vectores");
        System.out.println("2- Matrices");
        System.out.println("3- Salir");
        int Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
        System.out.println(" ");

         // INICIO DE CICLO WHILE

        while (Opc != 3)
        {
             //INICIO DE SWITCH

            switch (Opc)
            {
                case 1: // VECTORES

                    System.out.println("1- Vectores R2");
                    System.out.println("2- Vectores R3");
                    System.out.println("3- Vectores R4");
                    int Opc2 = lt.obtenerEnteroValidado("Seleccione una Opción Correcta Por Favor");

                    System.out.println(Opc2);

                    break;

                case 2: // MATRICES
                    System.out.println("1- Matrices 2x2");
                    System.out.println("2- Matrices 3x3");
                    System.out.println("3- Matrices 4x4");
                    int Opc3 = lt.obtenerEnteroValidado("Seleccione una Opción Correcta Por Favor");

                    System.out.println(Opc3);

                    break;

                default:

                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                    System.out.println(" ");

                    System.out.println("1- Vectores");
                    System.out.println("2- Matrices");
                    System.out.println("3- Salir");
                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Correcta Por Favor");

                    break;
            }
        }
    }
}
