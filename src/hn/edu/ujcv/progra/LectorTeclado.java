package hn.edu.ujcv.progra;
import java.util.Scanner;

public class LectorTeclado
{
    // Patron de diseño Singleton.

    // solo puede haber uno es un objeto Highlander.
    private static LectorTeclado instance;
    private Scanner m_SC;

    public static LectorTeclado getInstance()
    {
        // inicializacion perezosa.
        if (instance == null)
        {
            instance = new LectorTeclado();
        }
        return instance;
    }

    private LectorTeclado()
    {
        m_SC = new Scanner(System.in);
    }

    public int obtenerEntero(int valorPorDefecto, String mensaje)
    {
        int retval = valorPorDefecto;
        return retval;
    }
}
