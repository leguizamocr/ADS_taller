package Persistencia;

import java.util.ArrayList;

public class CelularDAOImpl {
    private List<Celular> celulares = new ArrayList<>();
    @Override
    public void agregarCelular(Celular celular) {
        celulares.add(celular);
    }

    @Override
    public List<Celular> obtcelulares() {
        return celulares;
    }

    @Override
    public Departamento buscarCelular(String referencia) {
        Celulares x = null;
        boolean existe = false;
        for (Celular d : celulares) {
            if (referencia.equals(d.getNombre())) {
                x = d;
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("No se encontro el de partamento " + referencia);
            return x;
        }
        else{
        return x;
        }
    }

    @Override
    public void actCelular(Celular celulares) {
        int index = celulares.indexOf(buscDepartamento(departamento.getNombre()));
        if(index >= 0){
        }
        celulares.set(index, celulares);
    }

    @Override
    public void eliminarcel(String referencia) {
        celulares.removeIf(celular -> celular.getReferencia().equalsIgnoreCase(referencia));
    }

}
