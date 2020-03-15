package hn.edu.ujcv.progra;

public class OMat4x4
{
    // MIEMBROS O ATRIBUTOS

    private double m11;
    private double m12;
    private double m13;
    private double m14;
    private double m21;
    private double m22;
    private double m23;
    private double m24;
    private double m31;
    private double m32;
    private double m33;
    private double m34;
    private double m41;
    private double m42;
    private double m43;
    private double m44;


    // CONSTRUCTORES

    public OMat4x4(double m11, double m12, double m13, double m14,
                   double m21, double m22, double m23, double m24,
                   double m31, double m32, double m33, double m34,
                   double m41, double m42, double m43, double m44)
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;
    }


    // ACCESORAS Y MUTADORAS



    // METODOS





      // METODO TO STRING
    @Override
    public String toString()
    {
        return " m11: " + getM11() + " m12: " + getM12() + " m13: " + getM13() +
                " m21: " + getM21() + " m22: " + getM22() + " m23: " + getM23() +
                " m31: " + getM31() + " m32: " + getM32() + " m33: " + getM33();
    }
}
