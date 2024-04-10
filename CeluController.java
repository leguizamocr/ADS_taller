package Controladores;

import Persistencia.CelularDAO;

public class CeluController {
    protected CelularDAO dao = new CelularDAOImpl();

    public void agregarCelular(Celular celular){
        dao.agregarCelular(celular);
    }
    public List<Celular> obtcelulares(){
        return dao.obtcelulares();
    }
    public Celular buscarCelular(String referencia){
        return dao.buscarCelular(referencia);
    }
    public void actCelular(Celular celular){
        dao.actCelular(celular);
    }
    public void eliminarcel(String referencia){
        dao.eliminarcel(referencia);
    }
}
