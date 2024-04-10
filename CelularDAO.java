import java.util.List;
package Persistencia;
import Modelos.Celular;

public interface CelularDAO {
    void agregarCelular(Celular Celular);
    List<Celular> obtcelulares();
    Celular buscarCelular(String referencia);
    void actCelular(Celular Celular);
    void eliminarcel(String referencia);
    
} 
