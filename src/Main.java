import hn.edu.ujcv.progra.LectorTeclado;
import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;

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

         // INICIO DE CICLO WHILE MENU PRINCIPAL

        while (Opc != 3)
        {
            switch (Opc) //INICIO DE SWITCH EN MENU PRINCIPAL
            {
                case 1: // VECTORES

                    System.out.println("1- Vectores R2");
                    System.out.println("2- Vectores R3");
                    System.out.println("3- Vectores R4");
                    int Opc2 = lt.obtenerEnteroValidado("Seleccione una Opción Correcta Por Favor");

                    switch (Opc2) // SWITCH PARA VECTORES
                    {
                        case 1: // MENU VECTORES R2
                            System.out.println("*****VECTORES EN R2*****");
                            System.out.println("1- Suma ");
                            System.out.println("2- Resta");
                            System.out.println("3- Producto Punto");
                            System.out.println("4- Magnitud");
                            int Opc3 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc3) // OPERACIONES CON VECTORES R2
                            {
                                case 1: // SUMA DE VECTORES EN R2
                                    System.out.println("SUMA DE VECTORES R2");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    double x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    double y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    double x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    double y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR2 V1 = new OVecR2(x, y);
                                    OVecR2 V2 = new OVecR2(x1, y1);

                                    // MOSTRANDO RESULTADO DE SUMA DE VECTORES

                                    System.out.println("La suma de los Vectores A + B es: " + V1.suma(V2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");
                                    break;

                                case 2: // RESTA DE VECTORES EN R2
                                    System.out.println("RESTA DE VECTORES R2");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR2 Ve1 = new OVecR2(x, y);
                                    OVecR2 Ve2 = new OVecR2(x1, y1);

                                    // MOSTRANDO RESULTADO DE SUMA DE VECTORES

                                    System.out.println("La resta de los Vectores A - B es: " + Ve1.resta(Ve2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");
                                    break;

                                case 3: // PRODUCTO PUNTO VECTORES R2
                                    System.out.println("PRODUCTO PUNTO DE VECTORES R2");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR2 Vec1 = new OVecR2(x, y);
                                    OVecR2 Vec2 = new OVecR2(x1, y1);

                                    // MOSTRANDO RESULTADO DE PRODUCTO PUNTO DE VECTORES R2

                                    System.out.println("El Producto Punto de los Vectores A * B es: " + Vec1.prodPunto(Vec2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // MAGNITUD DE UN VECTOR R2
                                    System.out.println("MAGNITUD DE UN VECTOR R2");

                                    // OBTENIENDO DATOS DEL VECTOR

                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR2 V = new OVecR2(x, y);

                                    // MOSTRANDO RESULTADO DE MAGNITUD DE VECTOR EN R2

                                    System.out.println("El Producto Punto del Vector A es: " + V.magnitud());
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");
                                    break;
                            }
                            break;

                        case 2: // MENU VECTORES R3
                            System.out.println("*****VECTORES EN R3*****");
                            System.out.println("1- Suma ");
                            System.out.println("2- Resta");
                            System.out.println("3- Producto Cruz");
                            System.out.println("4- Producto Punto");
                            System.out.println("5- Magnitud");
                            int Opc4 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc4) // SWITCH VECTORES R3
                            {
                                case 1: // SUMA DE VECTORES R3
                                    System.out.println("SUMA DE VECTORES R3");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    double x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    double y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    double z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    double x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    double y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    double z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR3 Vect1 = new OVecR3(x,y,z);
                                    OVecR3 Vect2 = new OVecR3(x1,y1,z1);

                                    // MOSTRANDO RESULTADO DE SUMA DE VECTORES

                                    System.out.println("La suma de los Vectores A + B es: " + Vect1.suma(Vect2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 2: // RESTA DE VECTORES R3
                                    System.out.println("RESTA DE VECTORES R3");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR3 Vec1 = new OVecR3(x,y,z);
                                    OVecR3 Vec2 = new OVecR3(x1,y1,z1);

                                    // MOSTRANDO RESULTADO DE RESTA DE VECTORES

                                    System.out.println("La resta de los Vectores A - B es: " + Vec1.resta(Vec2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 3: // PRODUCTO CRUZ DE VECTORES R3
                                    System.out.println("PRODUCTO CRUZ DE VECTORES R3");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR3 Ve1 = new OVecR3(x,y,z);
                                    OVecR3 Ve2 = new OVecR3(z1,y1,z1);

                                    // MOSTRANDO RESULTADO DE PRODUCTO CRUZ DE VECTORES R3

                                    System.out.println("El Producto Cruz de los Vectores A * B es: " + Ve1.prodCruz(Ve2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // PRODUCTO PUNTO DE VECTORES R3
                                    System.out.println("PRODUCTO PUNTO DE VECTORES R3");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR3 V1 = new OVecR3(x,y,z);
                                    OVecR3 V2 = new OVecR3(x1,y1,z1);

                                    // MOSTRANDO RESULTADO DE PRODUCTO PUNTO DE VECTORES R3

                                    System.out.println("El Producto Punto de los Vectores A * B es: " + V1.prodPunto(V2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // MAGNITUD DE VECTOR R3
                                    System.out.println("MAGNITUD DE VECTOR R3");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR3 Vector = new OVecR3(x,y,z);

                                    // MOSTRANDO RESULTADO DE MAGNITUD DE VECTOR R3

                                    System.out.println("La Magnitud del Vector A es: " + Vector.magnitud());
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println("*******LIBRERIA DE ALGEBRA LINEAL*******");
                                    System.out.println(" ");

                                    System.out.println("1- Vectores");
                                    System.out.println("2- Matrices");
                                    System.out.println("3- Salir");
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;
                            }
                    }
                    break;

                case 2:

                    break;
            }
        }
    }
}


