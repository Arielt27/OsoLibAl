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

    /*public OVecR3 prodCruz(OVecR3 b)
    {
        //
        //  x  y  z
        //  x1 y1 z1       i = y * z1 - z * y1;
        //                 j = - ();
        //                 k = ;
        //
        return new OVecR3();
    }*/

    public double prodPunto(OVecR3 b)
    {
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud()
    {
        //TODO: implementar
        return 0.0f;
    }

    // METODO TO STRING
    @Override
    public String toString()
    {
        return " i: " + getX() + " j: " + getY() + " k: " + getZ();
    }
}
