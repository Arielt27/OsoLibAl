package hn.edu.ujcv.progra;

public class OVecR3
{
    // MIEMBROS O ATRIBUTOS

    private double x;
    private double y;
    private double z;


    // CONSTRUCTORES

    public OVecR3(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // ACCESORAS Y MUTADORAS

      // Get y Set Para X

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

      // Get y Set Para Y

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

      // Get y Set Para Z

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    // METODOS

    public OVecR3 suma(OVecR3 b)
    {
        return new OVecR3(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public OVecR3 resta(OVecR3 b)
    {
        return new OVecR3(this.x - b.x, this.y - b.y, this.z - b.z);
    }

    public String prodCruz(OVecR3 b)
    {
        // i   j   k
        // x   y   z
        // x1  y1  z1
        // PC = +(y*z1 - y1*z)i -(x*z1 - x1*z)j +(x*y1 - x1*y)k

        double det1 = (this.y*b.z - b.y*this.z);
        double det2 = -(this.x*b.z - b.x*this.z);
        double det3 = (this.x*b.y - b.x*this.y);

        String pc = det1 + "i+" + det2 + "j+" + det3;

        return pc;
    }

    public double prodPunto(OVecR3 b)
    {
        // x   y   z
        // x1  y1  z1
        // PP = x*x1 + y*y1 + z*z1

        double Sol = this.x * b.x + this.y * b.y + this.z * b.z;
        return Sol;
    }

    public double magnitud()
    {
        //x   y   z
        // magnitud = sqrt(pow(x) + pow (y) + pow(z))

        double Mag = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        return Mag;
    }

    // METODO TO STRING
    @Override
    public String toString()
    {
        return " i: " + getX() + " j: " + getY() + " k: " + getZ();
    }
}
