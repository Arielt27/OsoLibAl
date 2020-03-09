import hn.edu.ujcv.progra.OVecR2;
import hn.edu.ujcv.progra.OVecR3;
import hn.edu.ujcv.progra.OVecR4;

public class Main
{
    public static void main(String[] args)
    {
        // CREACIÓN DE LOS OBJETOS (VECTORES)

          // Vectores en R2

        OVecR2 V1 = new OVecR2(-5,4);

        OVecR2 V2 = new OVecR2(-3,-8);

        OVecR2 V3 = new OVecR2(-11,-2);

          // Vectores en R3

        OVecR3 Ve1 = new OVecR3(2,6,3);

        OVecR3 Ve2 = new OVecR3(1,3,4);

        OVecR3 Ve3 = new OVecR3(-3,-2,5);

        OVecR3 Ve4 = new OVecR3(6,-10,-1);



          // Vectores en R4

        OVecR4 Vec1 = new OVecR4(5,7,6,3);

        OVecR4 Vec2 = new OVecR4(1,2,3,4);

        OVecR4 Vec3 = new OVecR4(9,1,0,6);


        // PROGRAMA PRINCIPAL

          // Vectores en R2

        System.out.println("***LIBRERIA DE ALGEBRA LINEAL***");
        System.out.println(" ");

        System.out.println("VECTORES EN R2");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + V1);                       // Mostrando Objeto Vector llamado V1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + V2);                       // Mostrando Objeto Vector llamado V2
        System.out.println(" ");

        System.out.println("El Vector 3 es: " + V3);                       // Mostrando Objeto Vector llamado V3
        System.out.println(" ");

        System.out.println("Suma de Vectores en R2 " + V2.suma(V1));       // Aplicando Metodo Suma de Clase OvecR2
        System.out.println(" ");

        System.out.println("Resta de Vectores en R2 " + V3.resta(V2));     // Aplicando Metodo Resta de Clase OvecR2
        System.out.println(" ");

        System.out.println("Producto Punto de Vectores en R2 "
                                           + V1.prodPunto(V2));            // Aplicando Metodo prodPunto de Clase OVecR2
        System.out.println(" ");

        System.out.println("Magnitud Del Vector en R2: " + V3.magnitud()); // Aplicando Metodo Magnitud de Clase OVecR2
        System.out.println(" ");

          // Vectores en R3

        System.out.println("VECTORES EN R3");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + Ve1);                      // Mostrando Objeto Vector llamado Ve1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + Ve2);                      // Mostrando Objeto Vector llamado Ve2
        System.out.println(" ");

        System.out.println("El Vector 3 es: " + Ve3);                      // Mostrando Objeto Vector llamado Ve3
        System.out.println(" ");

        System.out.println("Suma de Vectores en R3 " + Ve2.suma(Ve1));     // Aplicando Metodo Suma de Clase OvecR3
        System.out.println(" ");

        System.out.println("Resta de Vectores en R3 " + Ve1.resta(Ve3));   // Aplicando Metodo Resta de Clase OvecR3
        System.out.println(" ");

        System.out.println("Producto Punto de Vectores en R3 "
                                           + Ve1.prodPunto(Ve2));          // Aplicando Metodo prodPunto de Clase OVecR3
        System.out.println(" ");

        System.out.println("ProdCruz de Vectores en R3 "
                                           + Ve3.prodCruz(Ve4));           // Aplicando Metodo prodCruz de Clase OvecR3
        System.out.println(" ");

        System.out.println("Magnitud Del Vector en R3: " + Ve3.magnitud());// Aplicando Metodo Magnitud de Clase OVecR3
        System.out.println(" ");



          // VECTORES EN R4

        System.out.println("VECTORES EN R4");
        System.out.println(" ");

        System.out.println("El Vector 1 es: " + Vec1);                     // Mostrando Objeto Vector llamado Vec1
        System.out.println(" ");

        System.out.println("El Vector 2 es: " + Vec2);                     // Mostrando Objeto Vector llamado Vec2
        System.out.println(" ");

        System.out.println("El Vector 3 es: " + Vec3);                     // Mostrando Objeto Vector llamado Vec3
        System.out.println(" ");

        System.out.println("Suma de Vectores en R4 " + Vec1.suma(Vec2));   // Aplicando Metodo Suma de Clase OvecR4
        System.out.println(" ");

        System.out.println("Resta de Vectores en R4 " + Vec2.resta(Vec3)); // Aplicando Metodo Resta de Clase OvecR4
        System.out.println(" ");

        System.out.println("Producto Punto de Vectores en R4 "
                                           + Vec1.prodPunto(Vec2));        // Aplicando Metodo prodPunto de Clase OVecR4
        System.out.println(" ");

        System.out.println("Magnitud Del Vector en R4: "
                                           + Vec3.magnitud());             // Aplicando Metodo Magnitud de Clase OVecR4
        System.out.println(" ");

    }
}
