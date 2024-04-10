package Persistencia;
import Modelos.Departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAOImpl implements DepartamentoDAO {
    private List<Departamento> departamentos = new ArrayList<>();

    @Override
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    @Override
    public List<Departamento> obteneDepartamentos() {
        return departamentos;
    }

    @Override
    public Departamento buscDepartamento(String nombre) {
        Departamento x = null;
        boolean existe = false;
        for (Departamento d : departamentos) {
            if (nombre.equals(d.getNombre())) {
                x = d;
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("No se encontro el de partamento " + nombre);
            return x;
        }
        else{
        return x;
        }
    }

    @Override
    public void actualizarDepartamento(Departamento departamento) {
        int index = departamentos.indexOf(buscDepartamento(departamento.getNombre()));
        if(index >= 0){
            departamentos.set(index, departamento);
        }
    }

    @Override
    public void eliminarDepartamento(String nombre) {
        departamentos.removeIf(departamento -> departamento.getNombre().equalsIgnoreCase(nombre));
    }


  
}
