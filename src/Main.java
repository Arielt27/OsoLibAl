import hn.edu.ujcv.progra.OVecR2;

public class Main
{


    public static void main(String[] args)
    {
        System.out.println("***LIBRERIA DE ALGEBRA LINEAL***");

        OVecR2 V1 = new OVecR2(6,2);

        OVecR2 V2 = new OVecR2(4,8);

        System.out.println(V1);
        System.out.println(V2.suma(V1));
    }
}
