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

    public OMat3x3(OVecR3 a){}

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


}
