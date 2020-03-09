package hn.edu.ujcv.progra;
import java.math.*;

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

      // Get y Set Para Y
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
        return new OVecR2(this.x + b.x, this.y + b.y);
    }

    public OVecR2 resta(OVecR2 b)
    {
        return new OVecR2(this.x - b.x, this.y - b.y);
    }

    public double prodPunto(OVecR2 b)
    {
        // x   y
        // x1  y1
        // PP = x*x1 + y*y1

        double Sol;
        Sol = this.x * b.x + this.y * b.y;
        return Sol;
    }

    public double magnitud()
    {
        //x   y
        // magnitud = sqrt(pow(x) + pow (y))

        double Mag = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return Mag;
    }


    // METODO TO STRING
    @Override
    public String toString()
    {
        return " i: " + getX() + " j: " + getY();
    }
}
