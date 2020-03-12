package hn.edu.ujcv.progra;

public class OMat2x2 {
    // MIEMBROS O ATRIBUTOS

    private double m11;
    private double m12;
    private double m21;
    private double m22;


    // CONSTRUCTORES

    //public OMat2x2(){} // Constructor Por Defecto

    //public OMat2x2(OVecR2 a){} // Constructor con argumentos

    public OMat2x2(double m11, double m12, double m21, double m22) // Constructor de Conveniencia
    {
        this.m11 = m11;
        this.m12 = m12;
        this.m21 = m21;
        this.m22 = m22;
    }

    //public OMat2x2(OVecR2 a, OVecR2 b, boolean esColumna){}


    // ACCESORAS Y MUTADORAS

      // getM11

    public double getM11() {
        return m11;
    }

      // getM12

    public double getM12() {
        return m12;
    }

      // getM21

    public double getM21() {
        return m21;
    }

      // getM22

    public double getM22() {
        return m22;
    }

      // Set M11

    public void setM11(double m11) {
        this.m11 = m11;
    }

      // Set M12

    public void setM12(double m12) {
        this.m12 = m12;
    }

      // Set M21

    public void setM21(double m21) {
        this.m21 = m21;
    }

      // Set M22

    public void setM22(double m22) {
        this.m22 = m22;
    }


    // METODOS

    public OMat2x2 transpuesta()
    {
        // m11    m12
        // m21    m22

        // transpuesta

        // m11   m21
        // m12   m22

        return new OMat2x2(m11,m21,m12,m22);
    }

    public OMat2x2 inversa()
    {
        // m11   m12
        // m21   m22

        // det = m11 * m22 - m21 * m12;
        // inversa = (1/det)

        //  m22   -m12
        // -m21    m11

        return new OMat2x2( (1) / ((m11 * m22) - (m21 * m12)) * m22, (1) / ((m11 * m22) - (m21 * m12)) * -m12,
                            (1) / ((m11 * m22) - (m21 * m12)) * -m21, (1) / ((m11 * m22) - (m21 * m12)) * m11);
    }

    public OMat2x2 suma(OMat2x2 b)
    {
        return new OMat2x2(this.m11 + b.m11, this.m12 + b.m12, this.m21 + b.m21, this.m22 + b.m22);
    }

    public OMat2x2 resta(OMat2x2 b)
    {
        return new OMat2x2(this.m11 - b.m11, this.m12 - b.m12, this.m21 - b.m21, this.m22 - b.m22);
    }

    public OMat2x2 mult(OMat2x2 b)
    {
        return new OMat2x2((this.m11 * b.m11) + (this.m12 * b.m21), (this.m11 * b.m12) + (this.m12 * b.m22),
                           (this.m21 * b.m11) + (this.m22 * b.m21), (this.m21 * b.m12) + (this.m22 * b.m22));
    }

    public double determinante()
    {
        // m11   m12
        // m21   m22

        // det = m11 * m22 - m21 * m12;

        double Det = (m11 * m22) - (m21 * m12);

        return Det;
    }

    public static OMat2x2 rot(double alpha)
    {
        // cos a  -sin a
        // sin a   cos a

        double  m11,m12,
                m21,m22;

        m11 = Math.cos(alpha);
        m12 = -Math.sin(alpha);
        m21 = Math.sin(alpha);
        m22 = Math.cos(alpha);

        return new OMat2x2(m11,m12,m21,m22);
    }

    /*public static OMat2x2 identidad()
    {
        //TODO: implementar
        return new OMat2x2();
    }*/


    // METODO TO STRING
    @Override
    public String toString()
    {
        return " m11: " + getM11() + " m12: " + getM12() + " m21: " + getM21() + " m22 " + getM22();
    }
}
