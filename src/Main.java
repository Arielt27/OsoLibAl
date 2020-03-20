// LIBRERIA DE ALGEBRA LINEA
import hn.edu.ujcv.progra.*;

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
                case 1: // MENU DE VECTORES

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

                            switch (Opc4) // OPERACIONES VECTORES R3
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
                            break;

                        case 3: // MENU VECTORES R4
                            System.out.println("*****VECTORES EN R4*****");
                            System.out.println("1- Suma ");
                            System.out.println("2- Resta");
                            System.out.println("3- Producto Punto");
                            System.out.println("4- Magnitud");
                            int Opc5 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc5) // OPERACIONES VECTORES R4
                            {
                                case 1: // SUMA DE VECTORES R4
                                    System.out.println("SUMA DE VECTORES R4");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    double x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    double y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    double z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t: ");
                                    double t = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    double x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    double y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    double z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t1: ");
                                    double t1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR4 Ve1 = new OVecR4(x,y,z,t);
                                    OVecR4 Ve2 = new OVecR4(x1,y1,z1,t1);

                                    // MOSTRANDO RESULTADO DE SUMA DE VECTORES

                                    System.out.println("La suma de los Vectores A + B es: " + Ve1.suma(Ve2));
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

                                case 2: // RESTA DE VECTORES R4
                                    System.out.println("RESTA DE VECTORES R4");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t: ");
                                    t = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t1: ");
                                    t1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR4 V1 = new OVecR4(x,y,z,t);
                                    OVecR4 V2 = new OVecR4(x1,y1,z1,t1);

                                    // MOSTRANDO RESULTADO DE RESTA DE VECTORES

                                    System.out.println("La resta de los Vectores A - B es: " + V1.resta(V2));
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

                                case 3: // PRODUCTO PUNTO DE VECTORES R4
                                    System.out.println("PRODUCTO PUNTO DE VECTORES R4");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t: ");
                                    t = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR B

                                    System.out.println("Vector B");
                                    System.out.println("Ingrese el valor de x1: ");
                                    x1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y1: ");
                                    y1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z1: ");
                                    z1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t1: ");
                                    t1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR4 Vec1 = new OVecR4(x,y,z,t);
                                    OVecR4 Vec2 = new OVecR4(x1,y1,z1,t1);

                                    // MOSTRANDO RESULTADO DE PRODUCTO PUNTO DE VECTORES

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

                                case 4: // MAGNITUD
                                    System.out.println("MAGNITUD DE VECTOR R4");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de z: ");
                                    z = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de t: ");
                                    t = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR4 Vect1 = new OVecR4(x,y,z,t);

                                    // MOSTRANDO RESULTADO DE MAGNITUD DE VECTOR

                                    System.out.println("La Magnitud del Vector A es: " + Vect1.magnitud());
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
                    }
                    break;

                case 2: // MENU DE MATRICES

                    System.out.println("1- MATRICES 2x2");
                    System.out.println("2- MATRICES 3x3");
                    System.out.println("3- MATRICES 4x4");
                    Opc2 = lt.obtenerEnteroValidado("Seleccione una Opción Correcta Por Favor");

                    switch (Opc2) // SWITCH PARA MATRICES
                    {
                        case 1: // MENU MATRICES 2x2
                            System.out.println("*****MATRICES 2X2*****");
                            System.out.println("1- Suma");
                            System.out.println("2- Resta");
                            System.out.println("3- Multiplicación");
                            System.out.println("4- Determinante");
                            System.out.println("5- Transpuesta");
                            System.out.println("6- Inversa");
                            System.out.println("7- Rotación");
                            System.out.println("8- Identidad");
                            int Opc3 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc3) // OPERACIONES CON MATRICES 2x2
                            {
                                case 1: // SUMA DE MATRICES 2x2
                                    System.out.println("SUMA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double m11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double m12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double m21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double m22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double n11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double n12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double n21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double n22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Ma1 = new OMat2x2(m11,m12,m21,m22);
                                    OMat2x2 Ma2 = new OMat2x2(n11,n12,n21,n22);

                                    // MOSTRANDO RESULTADO DE SUMA DE MATRICES

                                    System.out.println("La Suma de las Matrices A + B es: " + Ma1.suma(Ma2));
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

                                case 2: // RESTA DE MATRICES 2x2
                                    System.out.println("RESTA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double M11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double M12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double M21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double M22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double N11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double N12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double N21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double N22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 M1 = new OMat2x2(M11,M12,M21,M22);
                                    OMat2x2 M2 = new OMat2x2(N11,N12,N21,N22);

                                    // MOSTRANDO RESULTADO DE SUMA DE MATRICES

                                    System.out.println("La Resta de las Matrices A - B es: " + M1.resta(M2));
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

                                case 3: // MULTIPLICACION DE MATRICES 2x2
                                    System.out.println("MULTIPLICACIÓN DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double l11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double l12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double l21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double l22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double j11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double j12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double j21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double j22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Mat1 = new OMat2x2(l11,l12,l21,l22);
                                    OMat2x2 Mat2 = new OMat2x2(j11,j12,j21,j22);

                                    // MOSTRANDO RESULTADO DE MULTIPLICACION DE MATRICES

                                    System.out.println("La Multiplicación de las Matrices A * B es: " + Mat1.mult(Mat2));
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

                                case 4: // DETERMINANTE DE MATRIZ 2x2
                                    System.out.println("DETERMINANTE DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double a11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double a12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double a21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double a22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Mat = new OMat2x2(a11,a12,a21,a22);

                                    // MOSTRANDO RESULTADO DE DETERMINANTE DE MATRIZ

                                    System.out.println("El Determinante de la Matriz A es: " + Mat.determinante());
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

                                case 5: // TRANSPUESTA DE MATRIZ 2x2
                                    System.out.println("TRANSPUESTA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double w11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double w12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double w21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double w22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Matriz = new OMat2x2(w11,w12,w21,w22);

                                    // MOSTRANDO RESULTADO DE TRANSPUESTA DE MATRIZ

                                    System.out.println("La Transpuesta de la Matriz A es: " + Matriz.transpuesta());
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

                                case 6: // INVERSA DE MATRIZ 2x2
                                    System.out.println("INVERSA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double r11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double r12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double r21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double r22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Matr = new OMat2x2(r11,r12,r21,r22);

                                    // MOSTRANDO RESULTADO DE INVERSA DE MATRIZ

                                    System.out.println("La Inversa de la Matriz A es: " + Matr.inversa());
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

                                case 7: // ROTACION DE MATRIZ 2x2
                                    System.out.println("ROTACION DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double q11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double q12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double q21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double q22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación");
                                    double ang = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Matriz2 = new OMat2x2(q11,q12,q21,q22);

                                    // MOSTRANDO RESULTADO DE ROTACION DE MATRIZ

                                    System.out.println("La Rotacion de la Matriz A es: " + Matriz2.rot(ang));
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

                                case 8: // OBTENER MATRIZ IDENTIDAD
                                    System.out.println("IDENTIDAD DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double s11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double s12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double s21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double s22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Matriz1 = new OMat2x2(s11,s12,s21,s22);

                                    // MOSTRANDO RESULTADO DE IDENTIDA DE MATRIZ

                                    System.out.println("La Identidad de la Matriz A es: " + Matriz1.identidad());
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

                        case 2: // MENU MATRICES 3x3
                            System.out.println("*****MATRICES 3X3*****");
                            System.out.println("1- Suma");
                            System.out.println("2- Resta");
                            System.out.println("3- Multiplicación");
                            System.out.println("4- Transpuesta");
                            System.out.println("5- Determinante");
                            System.out.println("6- Inversa");
                            System.out.println("7- Identidad");
                            Opc3 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc3) // OPERACIONES CON MATRICES 3x3
                            {
                                case 1: // SUMA DE MATRICES 3X3
                                    System.out.println("SUMA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double m11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double m12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double m13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double m21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double m22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double m23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double m31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double m32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double m33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double n11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double n12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double n13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double n21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double n22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double n23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double n31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double n32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double n33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Ma1 = new OMat3x3(m11,m12,m13,m21,m22,m23,m31,m32,m33);
                                    OMat3x3 Ma2 = new OMat3x3(n11,n12,n13,n21,n22,n23,n31,n32,n33);

                                    // MOSTRANDO RESULTADO DE SUMA DE MATRICES

                                    System.out.println("La Suma de las Matrices A + B es: " + Ma1.Suma(Ma2));
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

                                case 2: // RESTA DE MATRICES 3X3
                                    System.out.println("RESTA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double a11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double a12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double a13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double a21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double a22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double a23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double a31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double a32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double a33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double l11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double l12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double l13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double l21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double l22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double l23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double l31 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double l32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double l33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 M1 = new OMat3x3(a11,a12,a13,a21,a22,a23,a31,a32,a33);
                                    OMat3x3 M2 = new OMat3x3(l11,l12,l13,l21,l22,l23,l31,l32,l33);

                                    // MOSTRANDO RESULTADO DE RESTA DE MATRICES

                                    System.out.println("La Resta de las Matrices A - B es: " + M1.Resta(M2));
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

                                case 3: // MULTIPLICACION DE MATRICES 3X3
                                    System.out.println("MULTIPLICACIÓN DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double s11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double s12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double s13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double s21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double s22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double s23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double s31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double s32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double s33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double q11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double q12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double q13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double q21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double q22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double q23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double q31 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double q32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double q33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Mat1 = new OMat3x3(s11,s12,s13,s21,s22,s23,s31,s32,s33);
                                    OMat3x3 Mat2 = new OMat3x3(q11,q12,q13,q21,q22,q23,q31,q32,q33);

                                    // MOSTRANDO RESULTADO DE MULTIPLICACION DE MATRICES

                                    System.out.println("La Multiplicación de las Matrices A * B es: " + Mat1.Multi(Mat2));
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

                                case 4: // TRANSPUESTA DE MATRIZ 3X3
                                    System.out.println("TRANSPUESTA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double t11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double t12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double t13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double t21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double t22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double t23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double t31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double t32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double t33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matr1 = new OMat3x3(t11,t12,t13,t21,t22,t23,t31,t32,t33);

                                    // MOSTRANDO RESULTADO DE TRANSPUESTA DE MATRIZ

                                    System.out.println("La Transpuesta de la Matriz A es: " + Matr1.transpuesta());
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

                                case 5: // DETERMINANTE DE MATRICES 3X3
                                    System.out.println("DETERMINANTE DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double w11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double w12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double w13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double w21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double w22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double w23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double w31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double w32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double w33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matr2 = new OMat3x3(w11,w12,w13,w21,w22,w23,w31,w32,w33);

                                    // MOSTRANDO RESULTADO DE DETERMINANTE DE MATRIZ

                                    System.out.println("El Determinante de la Matriz A es: " + Matr2.determinante());
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

                                case 6: // INVERSA DE MATRICES 3X3
                                    System.out.println("INVERSA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double d11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double d12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double d13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double d21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double d22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double d23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double d31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double d32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double d33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matr3 = new OMat3x3(d11,d12,d13,d21,d22,d23,d31,d32,d33);

                                    // MOSTRANDO RESULTADO DE INVERSA DE MATRIZ

                                    System.out.println("La Inversa de la Matriz A es: " + Matr3.inversa());
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

                                case 7: // MATRIZ IDENTIDAD
                                    System.out.println("IDENTIDAD DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double f11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double f12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double f13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double f21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double f22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double f23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double f31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double f32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double f33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matr4 = new OMat3x3(f11,f12,f13,f21,f22,f23,f31,f32,f33);

                                    // MOSTRANDO RESULTADO DE IDENTIDAD DE MATRIZ

                                    System.out.println("La Identidad de la Matriz A es: " + Matr4.identidad());
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

                        case 3: // MENU MATRICES 4x4
                            System.out.println("*****MATRICES 4X4*****");
                            System.out.println("1- Suma");
                            System.out.println("2- Resta");
                            System.out.println("3- Multiplicación");
                            System.out.println("4- Determinante");
                            System.out.println("5- Transpuesta");
                            System.out.println("6- Inversa");
                            Opc3 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch (Opc3) // OPERACIONES CON MATRICES 4x4
                            {
                                case 1: // SUMA DE MATRICES 4x4
                                    System.out.println("SUMA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double s11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double s12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double s13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double s14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double s21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double s22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double s23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double s24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double s31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double s32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double s33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double s34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double s41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double s42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double s43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double s44 = lt.obtenerDoubleValidado("Ingrese un valor");


                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double q11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double q12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double q13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double q14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double q21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double q22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double q23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double q24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double q31 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double q32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double q33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double q34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double q41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double q42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double q43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double q44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Mat1 = new OMat4x4(s11,s12,s13,s14,s21,s22,s23,s24,s31,s32,s33,s34,s41,s42,s43,s44);
                                    OMat4x4 Mat2 = new OMat4x4(q11,q12,q13,q14,q21,q22,q23,q24,q31,q32,q33,q34,q41,q42,q43,q44);

                                    // MOSTRANDO RESULTADO DE SUMA DE MATRICES

                                    System.out.println("La Suma de las Matrices A + B es: " + Mat1.suma(Mat2));
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

                                case 2: // RESTA DE MATRICES 4x4
                                    System.out.println("RESTA DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double a11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double a12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double a13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double a14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double a21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double a22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double a23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double a24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double a31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double a32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double a33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double a34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double a41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double a42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double a43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double a44 = lt.obtenerDoubleValidado("Ingrese un valor");


                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double l11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double l12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double l13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double l14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double l21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double l22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double l23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double l24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double l31 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double l32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double l33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double l34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double l41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double l42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double l43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double l44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Ma1 = new OMat4x4(a11,a12,a13,a14,a21,a22,a23,a24,a31,a32,a33,a34,a41,a42,a43,a44);
                                    OMat4x4 Ma2 = new OMat4x4(l11,l12,l13,l14,l21,l22,l23,l24,l31,l32,l33,l34,l41,l42,l43,l44);

                                    // MOSTRANDO RESULTADO DE RESTA DE MATRICES

                                    System.out.println("La Resta de las Matrices A - B es: " + Ma1.resta(Ma2));
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

                                case 3: // MULTIPLICACIÓN DE MATRICES 4x4
                                    System.out.println("MULTIPLICACIÓN DE MATRICES");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double d11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double d12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double d13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double d14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double d21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double d22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double d23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double d24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double d31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double d32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double d33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double d34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double d41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double d42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double d43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double d44 = lt.obtenerDoubleValidado("Ingrese un valor");


                                    // OBTENIENDO DATOS MATRIZ B

                                    System.out.println("MATRIZ B");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double f11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double f12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double f13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double f14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double f21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double f22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double f23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double f24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double f31 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M32: ");
                                    double f32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double f33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double f34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double f41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double f42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double f43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double f44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr1 = new OMat4x4(d11,d12,d13,d14,d21,d22,d23,d24,d31,d32,d33,d34,d41,d42,d43,d44);
                                    OMat4x4 Matr2 = new OMat4x4(f11,f12,f13,f14,f21,f22,f23,f24,f31,f32,f33,f34,f41,f42,f43,f44);

                                    // MOSTRANDO RESULTADO DE MULTIPLICACIÓN DE MATRICES

                                    System.out.println("La Multiplicación de las Matrices A * B es: " + Matr1.multi(Matr2));
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

                                case 4: // DETERMINANTE DE MATRICES 4x4
                                    System.out.println("DETERMINANTE DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double w11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double w12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double w13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double w14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double w21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double w22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double w23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double w24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double w31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double w32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double w33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double w34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double w41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double w42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double w43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double w44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr3 = new OMat4x4(w11,w12,w13,w14,w21,w22,w23,w24,w31,w32,w33,w34,w41,w42,w43,w44);

                                    // MOSTRANDO RESULTADO DE DETERMINANTE DE MATRICES

                                    System.out.println("El Determinante de la Matriz A es: " + Matr3.determinante());
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

                                case 5: // TRANSPUESTA DE MATRICES 4x4
                                    System.out.println("TRANSPUESTA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double r11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double r12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double r13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double r14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double r21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double r22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double r23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double r24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double r31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double r32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double r33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double r34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double r41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double r42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double r43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double r44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr4 = new OMat4x4(r11,r12,r13,r14,r21,r22,r23,r24,r31,r32,r33,r34,r41,r42,r43,r44);

                                    // MOSTRANDO RESULTADO DE TRANSPUESTA DE MATRICES

                                    System.out.println("La Transpuesta de la Matriz A es: " + Matr4.transpuesta());
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

                                case 6: // IDENTIDAD DE MATRICES 4x4
                                    System.out.println("IDENTIDAD DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double g11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double g12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double g13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double g14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double g21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double g22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double g23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double g24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double g31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double g32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double g33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double g34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double g41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double g42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double g43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double g44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr5 = new OMat4x4(g11,g12,g13,g14,g21,g22,g23,g24,g31,g32,g33,g34,g41,g42,g43,g44);

                                    // MOSTRANDO RESULTADO DE IDENTIDAD DE MATRICES

                                    System.out.println("La Identidad de la Matriz A es: " + Matr5.identidad());
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
                    }
                    break;
            }
        }
    }
}


