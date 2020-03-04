package hn.edu.ujcv.progra;

public class OMat2x2
{
    // MIEMBROS O ATRIBUTOS

    OVecR2 col1;
    OVecR2 col2;


    // CONSTRUCTORES

    public OMat2x2(){} // Constructor por defecto

    public OMat2x2(OVecR2 a){} // Constructor con argumento

    public OMat2x2(double m11, double m12,
                   double m21, double m22) // Constructor de conveniencia
    {
        this.col1 = new OVecR2(m11, m21);
        this.col2 = new OVecR2(m12, m22);
    }

    public OMat2x2(OVecR2 a, OVecR2 b, boolean esColumna){}


    // ACCESORAS Y MUTADORAS

    //getFilaX

    //getColY


    // METODOS DE LA CLASE

    public OMat2x2 transpuesta()
    {
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 inversa()
    {
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 suma(OVecR2 b)
    {
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 resta(OVecR2 b)
    {
        //TODO: implementar
        return new OMat2x2();
    }

    public OMat2x2 mult(OVecR2 b)
    {
        //TODO: implementar
        return new OMat2x2();
    }

    public double determinante()
    {
        //TODO: implementar
        return 0.0f;
    }


    // METODOS DE LA CLASE
    public static OMat2x2 rot(double alpha)
    {
        // cos a   -sin a
        // sin a   cos a

        double m11, m12, m21, m22;

        m11 = Math.cos(alpha);
        m12 = -Math.sin(alpha);
        m21 = Math.sin(alpha);
        m22 = Math.cos(alpha);

        return new OMat2x2(m11, m12, m21, m22);
    }

    public static void identidad()
    {
        //TODO: implementar
    }
}
