package hn.edu.ujcv.progra;

public class OMat2x2
{
    // MIEMBROS O ATRIBUTOS

    private double col1;
    private double col2;


    // CONSTRUCTORES

    public OMat2x2(){} // Constructor Por Defecto

    public OMat2x2(OVecR2 a){} // Constructor con argumentos

    public OMat2x2(double m11, double m12,
                   double m21, double m22) // Constructor de Conveniencia
    {
       this.col1 = col1;
       this.col2 = col2;
    }

    public OMat2x2(OVecR2 a, OVecR2 b, boolean esColumna){}


    // ACCESORAS Y MUTADORAS

    //getColX

    public double getCol1()
    {
        return col1;
    }

    //getColY

    public double getCol2()
    {
        return col2;
    }


    // METODOS

    public OMat2x2 transpuesta()
    {

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
        //    m11  m12
        //    m21  m22
        //
        //
        // m11   =  a.m11 * b.m11 + a.m12 * b.m21;
        // m12   =  a.m11 * b.m12 + a.m12 * b.m22;
        //
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

        double  m11,m12,
                m21,m22;

        m11 = Math.cos(alpha);
        m12 = -Math.sin(alpha);
        m21 = Math.sin(alpha);
        m22 = Math.cos(alpha);
        return new OMat2x2(m11,m12,m21,m22);
    }

    public static OMat2x2 identidad()
    {
        //TODO: implementar
        return new OMat2x2();
    }
}
