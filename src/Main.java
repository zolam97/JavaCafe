
import Model.CE.EnvoltoriaProductos;
import Model.CE.NegocioEnvoltorio;
import Model.Clases.Grabadora;
import Model.Clases.Venta;
import Model.ExcepcionesPersonalizadas.ElementNotFoundException;
import Model.ExcepcionesPersonalizadas.ElementNotLoadedException;

public class Main {
    public static void main(String[] args) {

        NegocioEnvoltorio miNegocio = new NegocioEnvoltorio();

        miNegocio.menuAplicacion();



    }
}