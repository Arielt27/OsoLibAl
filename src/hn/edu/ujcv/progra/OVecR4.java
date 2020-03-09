package hn.edu.ujcv.progra;

public class OVecR4
{
    // MIEMBROS O ATRIBUTOS

    private double x;
    private double y;
    private double z;
    private double t;


    // CONSTRUCTORES

    public OVecR4(double x, double y, double z, double t)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }


    // ACCESORAS Y MUTADORAS

      // Get y Set Para x

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

      // Get y Set Para y

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

      // Get y Set Para z

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

      // Get y Set Para t

    public double getT()
    {
        return t;
    }

    public void setT(double t)
    {
        this.t = t;
    }


    // METODOS

    public OVecR4 suma(OVecR4 b)
    {
        return new OVecR4(this.x + b.x, this.y + b.y, this.z + b.z, this.t + b.t);
    }

    public OVecR4 resta(OVecR4 b)
    {
        return new OVecR4(this.x - b.x, this.y - b.y, this.z - b.z, this.t + b.t);
    }

    public double prodPunto(OVecR4 b)
    {
        // x   y   z   t
        // x1  y1  z1  t1
        // PP = x*x1 + y*y1 + z*z1 + t*t1

        double Sol = this.x * b.x + this.y * b.y + this.z * b.z + this.t * b.t;
        return Sol;
    }

    public double magnitud()
    {
        // x   y   z   t
        // magnitud = sqrt(pow(x) + pow(y) + pow(z) + pow(t))

        double mag = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) + Math.pow(t,2));
        return mag;
    }


    // METODO TO STRING
    @Override
    public String toString()
    {
        return " i: " + getX() + " j: " + getY() + " k: " + getZ() + " t: " + getT();
    }
}
