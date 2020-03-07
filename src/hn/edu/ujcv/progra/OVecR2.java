package hn.edu.ujcv.progra;

public class OVecR2
{
    // MIEMBROS O ATRIBUTOS

    private double x;
    private double y;


    // CONSTRUCTORES

    public OVecR2(){} // Constructor Por Defecto

    public OVecR2(double x, double y) // Constructor Explicito
    {
        this.x = x;
        this.y = y;
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

      //Get y Set Para Y
    public double getY()
    {
        return y;
    }

    public void setY()
    {
        this.y = y;
    }


    // METODOS

    public OVecR2 suma(OVecR2 b)
    {
        return new OVecR2();
    }

    public OVecR2 resta(OVecR2 b)
    {
        //TODO: implementar
        return new OVecR2();
    }

    public double prodPunto(OVecR2 b)
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
        return "i: " + getX() + "j: " + getY();
    }
}
