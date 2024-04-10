package Persistencia;
import Modelos.Departamento;
import java.util.List;
public interface DepartamentoDAO {
    void agregarDepartamento(Departamento departamento);
    List<Departamento> obteneDepartamentos();
    Departamento buscDepartamento(String nombre);
    void actualizarDepartamento(Departamento departamento);
    void eliminarDepartamento(String nombre);
} 
