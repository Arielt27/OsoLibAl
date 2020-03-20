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

    public OMat4x4 suma(OMat4x4 b)
    {
        return new OMat4x4(this.m11 + b.m11, this.m12 + b.m12, this.m13 + b.m13, this.m14 + b.m14,
                           this.m21 + b.m21, this.m22 + b.m22, this.m23 + b.m23, this.m24 + b.m24,
                           this.m31 + b.m31, this.m32 + b.m32, this.m33 + b.m33, this.m34 + b.m34,
                           this.m41 + b.m41, this.m42 + b.m42, this.m43 + b.m43, this.m44 + b.m44);
    }

    public OMat4x4 resta(OMat4x4 b)
    {
        return new OMat4x4(this.m11 - b.m11, this.m12 - b.m12, this.m13 - b.m13, this.m14 - b.m14,
                           this.m21 - b.m21, this.m22 - b.m22, this.m23 - b.m23, this.m24 - b.m24,
                           this.m31 - b.m31, this.m32 - b.m32, this.m33 - b.m33, this.m34 - b.m34,
                           this.m41 - b.m41, this.m42 - b.m42, this.m43 - b.m43, this.m44 - b.m44);
    }

    public OMat4x4 multi(OMat4x4 b)
    {
        // m11   m12   m13  m14 *  b11   b12   b13   b14
        // m21   m22   m23  m24 *  b21   b22   b23   b24
        // m31   m32   m33  m34 *  b31   b32   b33   b34
        // m41   m42   m43  m44 *  b41   b42   b43   b44

        // multi

        // c11 = this.m11 * b.m11 + this.m12 * b.m21 + this.m13 * b.m31 + this.m14 * b.m41
        // c12 = this.m11 * b.m12 + this.m12 * b.m22 + this.m13 * b.m32 + this.m14 * b.m42
        // c13 = this.m11 * b.m13 + this.m12 * b.m23 + this.m13 * b.m33 + this.m14 * b.m43
        // c14 = this.m11 * b.m14 + this.m12 * b.m24 + this.m13 * b.m34 + this.m14 * b.m44

        // c21 = this.m21 * b.m11 + this.m22 * b.m21 + this.m23 * b.m31 + this.m24 * b.m41
        // c22 = this.m21 * b.m12 + this.m22 * b.m22 + this.m23 * b.m32 + this.m24 * b.m42
        // c23 = this.m21 * b.m13 + this.m22 * b.m23 + this.m23 * b.m33 + this.m24 * b.m43
        // c24 = this.m21 * b.m14 + this.m22 * b.m24 + this.m23 * b.m34 + this.m24 * b.m44

        // c31 = this.m31 * b.m11 + this.m32 * b.m21 + this.m33 * b.m31 + this.m34 * b.m41
        // c32 = this.m31 * b.m12 + this.m32 * b.m22 + this.m33 * b.m32 + this.m34 * b.m42
        // c33 = this.m31 * b.m13 + this.m32 * b.m23 + this.m33 * b.m33 + this.m34 * b.m43
        // c34 = this.m31 * b.m14 + this.m32 * b.m24 + this.m33 * b.m34 + this.m34 * b.m44

        // c41 = this.m41 * b.m11 + this.m42 * b.m21 + this.m43 * b.m31 + this.m44 * b.m41
        // c42 = this.m41 * b.m12 + this.m42 * b.m22 + this.m43 * b.m32 + this.m44 * b.m42
        // c43 = this.m41 * b.m13 + this.m42 * b.m23 + this.m43 * b.m33 + this.m44 * b.m43
        // c44 = this.m41 * b.m14 + this.m42 * b.m24 + this.m43 * b.m34 + this.m44 * b.m44

        return new OMat4x4(this.m11 * b.m11 + this.m12 * b.m21 + this.m13 * b.m31 + this.m14 * b.m41, this.m11 * b.m12 + this.m12 * b.m22 + this.m13 * b.m32 + this.m14 * b.m42, this.m11 * b.m13 + this.m12 * b.m23 + this.m13 * b.m33 + this.m14 * b.m43, this.m11 * b.m14 + this.m12 * b.m24 + this.m13 * b.m34 + this.m14 * b.m44,
                           this.m21 * b.m11 + this.m22 * b.m21 + this.m23 * b.m31 + this.m24 * b.m41, this.m21 * b.m12 + this.m22 * b.m22 + this.m23 * b.m32 + this.m24 * b.m42, this.m21 * b.m13 + this.m22 * b.m23 + this.m23 * b.m33 + this.m24 * b.m43, this.m21 * b.m14 + this.m22 * b.m24 + this.m23 * b.m34 + this.m24 * b.m44,
                           this.m31 * b.m11 + this.m32 * b.m21 + this.m33 * b.m31 + this.m34 * b.m41, this.m31 * b.m12 + this.m32 * b.m22 + this.m33 * b.m32 + this.m34 * b.m42, this.m31 * b.m13 + this.m32 * b.m23 + this.m33 * b.m33 + this.m34 * b.m43, this.m31 * b.m14 + this.m32 * b.m24 + this.m33 * b.m34 + this.m34 * b.m44,
                           this.m41 * b.m11 + this.m42 * b.m21 + this.m43 * b.m31 + this.m44 * b.m41, this.m41 * b.m12 + this.m42 * b.m22 + this.m43 * b.m32 + this.m44 * b.m42, this.m41 * b.m13 + this.m42 * b.m23 + this.m43 * b.m33 + this.m44 * b.m43, this.m41 * b.m14 + this.m42 * b.m24 + this.m43 * b.m34 + this.m44 * b.m44);
    }

    public OMat4x4 transpuesta()
    {
        // m11   m12   m13   m14
        // m21   m22   m23   m24
        // m31   m32   m33   m34
        // m41   m42   m43   m44

        // transpuesta

        // m11   m21   m31   m41
        // m12   m22   m32   m42
        // m13   m23   m33   m43
        // m14   m24   m34   m44

        return new OMat4x4(m11, m21, m31, m41,
                           m12, m22, m32, m42,
                           m13, m23, m33, m43,
                           m14, m24, m34, m44);
    }

    public double determinante()
    {
        double respuesta;

        OMat3x3 cofA = new OMat3x3(this.m22,this.m23,this.m24,this.m32,this.m33,this.m34,this.m42,this.m43,this.m44);
        OMat3x3 cofB = new OMat3x3(this.m21,this.m23,this.m24,this.m31,this.m33,this.m34,this.m41,this.m43,this.m44);
        OMat3x3 cofC = new OMat3x3(this.m21,this.m22,this.m24,this.m31,this.m32,this.m34,this.m41,this.m42,this.m44);
        OMat3x3 cofD = new OMat3x3(this.m21,this.m22,this.m23,this.m31,this.m32,this.m33,this.m41,this.m42,this.m43);

        respuesta = (this.m11 * cofA.determinante()) - (this.m12 * cofB.determinante()) + (this.m13 * cofC.determinante()) - (this.m14 * cofD.determinante());

        return respuesta;
    }

    public OMat4x4 identidad()
    {
        // m11   m12   m13   m14
        // m21   m22   m23   m24
        // m31   m32   m33   m34
        // m41   m42   m43   m44

        return new OMat4x4(1,0,0,0,
                           0,1,0,0,
                           0,0,1,0,
                           0,0,0,1);
    }


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
