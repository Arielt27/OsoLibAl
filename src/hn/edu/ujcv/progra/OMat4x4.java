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

      // Get M14

    public double getM14()
    {
        return m14;
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

      // Get M24

    public double getM24()
    {
        return m24;
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

      // Get M34

    public double getM34()
    {
        return m34;
    }

      // Get M41

    public double getM41()
    {
        return m41;
    }

      // Get M42

    public double getM42()
    {
        return m42;
    }

      // Get M43

    public double getM43()
    {
        return m43;
    }

      // Get M44

    public double getM44()
    {
        return m44;
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

      // Set M11

    public void setM14(double m14)
    {
        this.m14 = m14;
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

      // Set M24

    public void setM24(double m24)
    {
        this.m24 = m24;
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

      // Set M34

    public void setM34(double m34)
    {
        this.m34 = m34;
    }

    // Set M41

    public void setM41(double m41)
    {
        this.m41 = m41;
    }

    // Set M42

    public void setM42(double m42)
    {
        this.m42 = m42;
    }

    // Set M43

    public void setM43(double m43)
    {
        this.m43 = m43;
    }

    // Set M44

    public void setM44(double m44)
    {
        this.m44 = m44;
    }


    // METODOS





      // METODO TO STRING
    @Override
    public String toString()
    {
        return " m11: " + getM11() + " m12: " + getM12() + " m13: " + getM13() + " m14: " + getM14() +
               " m21: " + getM21() + " m22: " + getM22() + " m23: " + getM23() + " m24: " + getM24() +
               " m31: " + getM31() + " m32: " + getM32() + " m33: " + getM33() + " m34: " + getM34() +
               " m41: " + getM41() + " m42: " + getM42() + " m43: " + getM43() + " m44: " + getM44();
    }
}
