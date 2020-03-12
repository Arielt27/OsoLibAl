package hn.edu.ujcv.progra;

public class OMat3x3
{
    // MIEMBROS O ATRIBUTOS

    private double m11;
    private double m12;
    private double m13;
    private double m21;
    private double m22;
    private double m23;
    private double m31;
    private double m32;
    private double m33;


    // CONSTRUCTORES

    //public OMat3x3(){}

    //public OMat3x3(OVecR3 a){}

    public OMat3x3(double m11, double m12, double m13,
                   double m21, double m22, double m23,
                   double m31, double m32, double m33)
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
    }

    // ACCESORAS Y MUTADORAS

       // Get M11

    public double getM11()
    {
        return m11;
    }

       // Get M12

    public double getM12()
    {
        return m12;
    }

       // Get M13

    public double getM13()
    {
        return m13;
    }

       // Get M21

    public double getM21()
    {
        return m21;
    }

       // Get M22

    public double getM22()
    {
        return m22;
    }

       // Get M23

    public double getM23()
    {
        return m23;
    }

       // Get M31

    public double getM31()
    {
        return m31;
    }

       // Get M32

    public double getM32()
    {
        return m32;
    }

       // Get M33

    public double getM33()
    {
        return m33;
    }

       // Set M11

    public void setM11(double m11)
    {
        this.m11 = m11;
    }

       // Set M12

    public void setM12(double m12)
    {
        this.m12 = m12;
    }

       // Set M13

    public void setM13(double m13)
    {
        this.m13 = m13;
    }

       // Set M21

    public void setM21(double m21)
    {
        this.m21 = m21;
    }

       // Set M22

    public void setM22(double m22)
    {
        this.m22 = m22;
    }

       // Set M23

    public void setM23(double m23)
    {
        this.m23 = m23;
    }

       // Set M31

    public void setM31(double m31)
    {
        this.m31 = m31;
    }

       // Set M32

    public void setM32(double m32)
    {
        this.m32 = m32;
    }

       // Set M33

    public void setM33(double m33)
    {
        this.m33 = m33;
    }


    // METODOS

    public OMat3x3 Suma(OMat3x3 b)
    {
        return new OMat3x3(this.m11 + b.m11, this.m12 + b.m12, this.m13 + b.m13,
                           this.m21 + b.m21, this.m22 + b.m22, this.m23 + b.m23,
                           this.m31 + b.m31, this.m32 + b.m32, this.m33 + b.m33);
    }

    public OMat3x3 Resta(OMat3x3 b)
    {
        return new OMat3x3(this.m11 - b.m11, this.m12 - b.m12, this.m13 - b.m13,
                           this.m21 - b.m21, this.m22 - b.m22, this.m23 - b.m23,
                           this.m31 - b.m31, this.m32 - b.m32, this.m33 - b.m33);
    }

    public OMat3x3 multi(OMat3x3 b)
    {
        // m11   m12   m13  *  b11   b12   b13
        // m21   m22   m23  *  b21   b22   b23
        // m31   m32   m33  *  b31   b32   b33

        // c11 = this.m11 * b.m11 + this.m12 * b.m21 + this.m13 * b.m31
        // c12 = this.m11 * b.m12 + this.m12 * b.m22 + this.m13 * b.m32
        // c13 = this.m11 * b.m13 + this.m12 * b.m23 + this.m13 * b.m33
        // c21 = this.m21 * b.m11 + this.m22 * b.m21 + this.m23 * b.m23
        // c22 = this.m21 * b.m12 + this.m22 * b.m22 + this.m23 * b.m32
        // c23 = this.m21 * b.m13 + this.m22 * b.m23 + this.m23 * b.m33
        // c31 = this.m31 * b.m11 + this.m32 * b.m21 + this.m33 * b.m31
        // c32 = this.m31 * b.m12 + this.m32 * b.m22 + this.m33 * b.m32
        // c33 = this.m31 * b.m13 + this.m32 * b.m23 + this.m33 * b.m33

        return new OMat3x3(this.m11 * b.m11 + this.m12 * b.m21 + this.m13 * b.m31, this.m11 * b.m12 + this.m12 * b.m22 + this.m13 * b.m32, this.m11 * b.m13 + this.m12 * b.m23 + this.m13 * b.m33,
                           this.m21 * b.m11 + this.m22 * b.m21 + this.m23 * b.m31, this.m21 * b.m12 + this.m22 * b.m22 + this.m23 * b.m32, this.m21 * b.m13 + this.m22 * b.m23 + this.m23 * b.m33,
                           this.m31 * b.m11 + this.m32 * b.m21 + this.m33 * b.m31, this.m31 * b.m12 + this.m32 * b.m22 + this.m33 * b.m32, this.m31 * b.m13 + this.m32 * b.m23 + this.m33 * b.m33);
    }


    public OMat3x3 transpuesta()
    {
        // m11   m12   m13
        // m21   m22   m23
        // m31   m32   m33

        // transpuesta

        // m11  m21  m31
        // m12  m22  m32
        // m13  m23  m33

        return new OMat3x3(m11, m21, m31, m12, m22, m32, m13, m23, m33);
    }

    // METODO TO STRING
    @Override
    public String toString()
    {
        return " m11: " + getM11() + " m12: " + getM12() + " m13: " + getM13() +
               " m21: " + getM21() + " m22: " + getM22() + " m23: " + getM23() +
               " m31: " + getM31() + " m32: " + getM32() + " m33: " + getM33();
    }


}
