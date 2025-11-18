import java.util.ArrayList;
import java.util.List;

public class Listado extends Exception{
    private List<Avengers> listado;

    public Listado(){
        listado = new ArrayList<>();
    }

    public List<Avengers> getListado() {
        return listado;
    }
    public void setListado(List<Avengers> listado) {
        this.listado = listado;
    }

    public void agregarAvenger(Avengers avenger) {
        listado.add(avenger);
    }

    public void add(String id, String nombre, int pagoMensual) throws Exception {
        listado.add(new Avengers(id, nombre, pagoMensual));
    }

    public List<Avengers> listarAvenger(){
        return new ArrayList<Avengers>(listado);
    }
}
