// LIBRERIA DE ALGEBRA LINEA
// AUTOR: ARIEL TORRES
import hn.edu.ujcv.progra.*;

public class Main
{
    public static void main(String[] args)
    {

        LectorTeclado lt = LectorTeclado.getInstance();

        Menu menu = new Menu();

        System.out.println(menu.menuPrincipal()); // MENU PRINCIPAL DEL PROGRAMA
        int Opc = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

        while (Opc != 3)
        {
            switch (Opc)
            {
                case 1: // VECTORES

                    System.out.println(menu.Vectores());
                    int Opc1 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                    switch(Opc1) // MENU DE VECTORES
                    {
                        case 1: // VECTORES R2

                            System.out.println(menu.VectoresR2());
                            int Opc3 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                            switch(Opc3) // OPERACIONES CON VECTORES EN R2
                            {
                                case 1: // SUMA DE VECTORES R2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 2: // RESTA DE VECTORES R2

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

                                    // MOSTRANDO RESULTADO DE RESTA DE VECTORES

                                    System.out.println("La resta de los Vectores A - B es: " + Ve1.resta(Ve2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 3: // PRODUCTO PUNTO DE VECTORES R2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // MAGNITUD DE VECTORES R2

                                    System.out.println("MAGNITUD DE UN VECTOR R2");

                                    // OBTENIENDO DATOS DEL VECTOR

                                    System.out.println("Ingrese el valor de x: ");
                                    x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OVecR2 V = new OVecR2(x, y);

                                    // MOSTRANDO RESULTADO DE MAGNITUD DE VECTOR EN R2

                                    System.out.println("La Magnitud del Vector A es: " + V.magnitud());
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU DE VECTORES EN R2

                                    System.out.println(" ");
                                    System.out.println("Por Escoja una Opción Válida");
                                    System.out.println(menu.VectoresR2());
                                    Opc3 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                                    break;
                            }

                            break;

                        case 2: // VECTORES R3

                            System.out.println(menu.VectoresR3());
                            int Opc4 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch(Opc4) // OPERACIONES CON VECTORES EN R3
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // MAGNITUD DE UN VECTOR R3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU DE VECTORES EN R3

                                    System.out.println(" ");
                                    System.out.println("Por Escoja una Opción Válida");
                                    System.out.println(menu.VectoresR3());
                                    Opc4 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                                    break;

                            }

                            break;

                        case 3: // VECTORES R4

                            System.out.println(menu.VectoresR4());
                            int Opc5 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch(Opc5) // OPERACIONES CON VECTORES EN R4
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // MAGNITUD DE VECTORES R4

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // SUMA QUATERNION VECTORES R4

                                    System.out.println("SUMA QUATERNION DE VECTOR R4");

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

                                    OVecR4 Vect0 = new OVecR4(x,y,z,t);
                                    OVecR4 Vect2 = new OVecR4(x1,y1,z1,t1);

                                    // MOSTRANDO RESULTADO DE SUMA DE QUATERNION DE VECTOR

                                    System.out.println("La Suma del Quaternion del Vector A es: " + Vect0.quatSuma(Vect2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU DE VECTORES EN R4

                                    System.out.println(" ");
                                    System.out.println("Por Escoja una Opción Válida");
                                    System.out.println(menu.VectoresR4());
                                    Opc5 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                                    break;

                            }

                            break;

                        default: // MENU PRINCIPAL VECTORES

                            System.out.println(" ");
                            System.out.println("Por Escoja una Opción Válida");
                            System.out.println(menu.Vectores());
                            Opc1 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                            break;
                    }

                    break;

                case 2: // MATRICES

                    System.out.println(menu.Matrices());
                    int Opc2 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                    switch(Opc2) // MENU MATRICES
                    {
                        case 1: // MATRICES 2x2

                            System.out.println(menu.Matrices2x2());
                            int Opc6 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch(Opc6) // OPERACIONES CON MATRICES 2x2
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 3: // MUTIPLICACION DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // DETERMINANTE DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // TRANSPUESTA DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 6: // INVERSA DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 7: // IDENTIDAD DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 8: // ROTACION DE MATRICES 2x2

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 9: // MATRIZ POR VECTOR

                                    System.out.println("ROTACION DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double y11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double y12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double y21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double y22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    // OBTENIENDO DATOS VECTOR A

                                    System.out.println("Vector A");
                                    System.out.println("Ingrese el valor de x: ");
                                    double x = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de y: ");
                                    double y = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat2x2 Matriz3 = new OMat2x2(y11,y12,y21,y22);
                                    OVecR2 Vec1 = new OVecR2(x,y);

                                    // MOSTRANDO RESULTADO DE MATRIZ POR VECTOR

                                    System.out.println("La Matriz por el Vector es: " + Matriz3.MporV(Vec1));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU MATRICES 2x2

                                    System.out.println(menu.Matrices2x2());
                                    Opc6 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                                    break;
                            }

                            break;

                        case 2: // MATRICES 3x3

                            System.out.println(menu.Matrices3x3());
                            int Opc7 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch(Opc7) // OPERACIONES CON MATRICES 3x3
                            {
                                case 1: // SUMA DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 2: // RESTA DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 3: // MULTIPLICACION DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // DETERMINANTE DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // TRANSPUESTA DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 6: // INVERSA DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 7: // IDENTIDAD DE MATRICES 3x3

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 8: // ROTACION X DE MATRICES 3x3

                                    System.out.println("ROTACION EN X DE LA MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double v11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double v12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double v13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double v21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double v22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double v23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double v31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double v32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double v33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en X");
                                    double ang = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matriz4 = new OMat3x3(v11,v12,v13,v21,v22,v23,v31,v32,v33);

                                    // MOSTRANDO RESULTADO DE ROTACION X DE MATRIZ

                                    System.out.println("La Rotación en X de la Matriz A es: " + Matriz4.rotacionX(ang));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 9: // ROTACION Y DE MATRIZ 3x3

                                    System.out.println("ROTACION EN Y DE LA MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double k11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double k12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double k13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double k21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double k22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double k23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double k31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double k32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double k33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en Y");
                                    double ang4 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matriz5 = new OMat3x3(k11,k12,k13,k21,k22,k23,k31,k32,k33);

                                    // MOSTRANDO RESULTADO DE ROTACION Z DE MATRIZ

                                    System.out.println("La Rotación en Y de la Matriz A es: " + Matriz5.rotacionY(ang4));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 10: // ROTACION Z DE MATRICES 3x3

                                    System.out.println("ROTACION EN Z DE LA MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double h11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double h12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double h13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double h21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double h22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double h23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double h31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double h32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double h33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en Z");
                                    double ang2 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat3x3 Matriz6 = new OMat3x3(h11,h12,h13,h21,h22,h23,h31,h32,h33);

                                    // MOSTRANDO RESULTADO DE ROTACION Z DE MATRIZ

                                    System.out.println("La Rotación en Z de la Matriz A es: " + Matriz6.rotacionZ(ang2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU MATRICES 3x3

                                    System.out.println(menu.Matrices2x2());
                                    Opc6 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                                    break;
                            }

                            break;

                        case 3 : // MATRICES 4x4

                            System.out.println(menu.Matrices4x4());
                            int Opc8 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                            switch(Opc8) // OPERACIONES CON MATRICES 4x4
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

                                    System.out.println(menu.menuPrincipal());
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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 3: // MULTIPLICACION DE MATRICES 4x4

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 4: // DETERMINANTE DE MATRIZ 4x4

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 5: // TRANSPUESTA DE MATRIZ 4x4

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

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 6: // INVERSA DE MATRIZ 4x4

                                    System.out.println("INVERSA DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double b11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double b12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double b13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double b14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double b21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double b22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double b23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double b24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double b31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double b32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double b33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double b34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double b41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double b42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double b43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double b44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr5 = new OMat4x4(b11,b12,b13,b14,b21,b22,b23,b24,b31,b32,b33,b34,b41,b42,b43,b44);

                                    // MOSTRANDO RESULTADO DE INVERSA DE MATRIZ

                                    System.out.println("La Inversa de la Matriz A es: " + Matr5.inversa());
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 7: // IDENTIDAD DE MATRIZ 4x4

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

                                    OMat4x4 Matr7 = new OMat4x4(g11,g12,g13,g14,g21,g22,g23,g24,g31,g32,g33,g34,g41,g42,g43,g44);

                                    // MOSTRANDO RESULTADO DE IDENTIDAD DE MATRICES

                                    System.out.println("La Identidad de la Matriz A es: " + Matr7.identidad());
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 8: // ROTACION EN X DE MATRIZ 4x4

                                    System.out.println("ROTACION EN X DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double m11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double m12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double m13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double m14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double m21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double m22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double m23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double m24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double m31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double m32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double m33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double m34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double m41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double m42 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M43: ");
                                    double m43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double m44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en X");
                                    double ang = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr8 = new OMat4x4(m11,m12,m13,m14,m21,m22,m23,m24,m31,m32,m33,m34,m41,m42,m43,m44);

                                    // MOSTRANDO RESULTADO DE ROTACION EN X DE MATRIZ

                                    System.out.println("La Rotacion en X de la Matriz A es: " + Matr8.rotacionX(ang));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 9: // ROTACION EN Y DE MATRIZ 4x4

                                    System.out.println("ROTACION EN Y DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double n11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double n12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double n13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double n14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double n21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double n22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double n23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double n24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double n31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double n32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double n33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double n34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double n41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double n42 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M43: ");
                                    double n43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double n44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en Y");
                                    double ang1 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matr9 = new OMat4x4(n11,n12,n13,n14,n21,n22,n23,n24,n31,n32,n33,n34,n41,n42,n43,n44);

                                    // MOSTRANDO RESULTADO DE ROTACION EN Y DE MATRIZ

                                    System.out.println("La Rotacion en Y de la Matriz A es: " + Matr9.rotacionY(ang1));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 10: // ROTACION EN Z DE MATRIZ 4x4

                                    System.out.println("ROTACION EN Z DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double z11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double z12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double z13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double z14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double z21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double z22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double z23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double z24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double z31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double z32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double z33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double z34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double z41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double z42 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M43: ");
                                    double z43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double z44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en Y");
                                    double ang2 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matrz1 = new OMat4x4(z11,z12,z13,z14,z21,z22,z23,z24,z31,z32,z33,z34,z41,z42,z43,z44);

                                    // MOSTRANDO RESULTADO DE ROTACION EN Z DE MATRIZ

                                    System.out.println("La Rotacion en Z de la Matriz A es: " + Matrz1.rotacionZ(ang2));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                case 11: // ROTACION EN T DE MATRIZ 4x4

                                    System.out.println("ROTACION EN T DE MATRIZ");

                                    // OBTENIENDO DATOS MATRIZ A

                                    System.out.println("MATRIZ A");
                                    System.out.println("Ingrese el valor de M11: ");
                                    double x11 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M12: ");
                                    double x12 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M13: ");
                                    double x13 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M14: ");
                                    double x14 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M21: ");
                                    double x21 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M22: ");
                                    double x22 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M23: ");
                                    double x23 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M24: ");
                                    double x24 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M31: ");
                                    double x31 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M32: ");
                                    double x32 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M33: ");
                                    double x33 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M34: ");
                                    double x34 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M41: ");
                                    double x41 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M42: ");
                                    double x42 = lt.obtenerDoubleValidado("Ingrese un valor");
                                    System.out.println("Ingrese el valor de M43: ");
                                    double x43 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor de M44: ");
                                    double x44 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    System.out.println("Ingrese el valor del ángulo de rotación en T");
                                    double ang3 = lt.obtenerDoubleValidado("Ingrese un valor");

                                    OMat4x4 Matrz2 = new OMat4x4(x11,x12,x13,x14,x21,x22,x23,x24,x31,x32,x33,x34,x41,x42,x43,x44);

                                    // MOSTRANDO RESULTADO DE ROTACION EN T DE MATRIZ

                                    System.out.println("La Rotacion en T de la Matriz A es: " + Matrz2.rotacionT(ang3));
                                    System.out.println(" ");

                                    // RETORNANDO A MENU PRINCIPAL

                                    System.out.println(menu.menuPrincipal());
                                    Opc = lt.obtenerEnteroValidado("Seleccione una Opción Válida");
                                    System.out.println(" ");

                                    break;

                                default: // MENU PRINCIPAL DE MATRICES 4x4

                                    System.out.println(menu.Matrices4x4());
                                    Opc8 = lt.obtenerEnteroValidado("Seleccione Una Opción Correcta");

                                    break;

                            }

                            break;

                        default: // MENU PRINCIPAL MATRICES

                            System.out.println(" ");
                            System.out.println("Por Escoja una Opción Válida");
                            System.out.println(menu.Matrices());
                            Opc2 = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                            break;
                    }

                    break;

                default: // MENU INICIAL

                    System.out.println(" ");
                    System.out.println("Por Escoja una Opción Válida");
                    System.out.println(menu.menuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");

                    break;
            }
        }
    }
}


