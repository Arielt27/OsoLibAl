package hn.edu.ujcv.progra;

public class OMat3x3
{
    // MIEMBROS O ATRIBUTOS

    OVecR3 Col1;
    OVecR3 COl2;
    OVecR3 Col3;

    // CONSTRUCTORES

    public OMat3x3(){} // Constructor por defecto

    public OMat3x3 (OVecR3 a){} // Constructor #1

    public OMat3x3 (double m11, double m12, double m13,
                    double m21, double m22, double m23,
                    double m31, double m32, double m33) // Constructor de conveniencia
    {
        this.Col1 = new OVecR3(m11, m21, m31);
        this.COl2 = new OVecR3(m12, m22, m32);
        this.Col3 = new OVecR3(m31, m23, m33);


    }



}
