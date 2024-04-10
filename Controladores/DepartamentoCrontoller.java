package Controladores;
import Persistencia.DepartamentoDAO;
import Persistencia.DepartamentoDAOImpl;
import java.util.List;
import Modelos.Departamento;

public class DepartamentoCrontoller {
    protected DepartamentoDAO dao = new DepartamentoDAOImpl();

    public void agregarDepartamento(Departamento departamento){
        dao.agregarDepartamento(departamento);
    }
    public List<Departamento> obteneDepartamentos(){
        return dao.obteneDepartamentos();
    }
    public Departamento buscDepartamento(String nombre){
        return dao.buscDepartamento(nombre);
    }
    public void actualizarDepartamento(Departamento departamento){
        dao.actualizarDepartamento(departamento);
    }
    public void eliminarDepartamento(String nombre){
        dao.eliminarDepartamento(nombre);
    }
}

