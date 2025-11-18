import java.util.ArrayList;
import java.util.List;

public class Lista extends Exception {
    private List<Avengers> lista;

    public Lista(){
        lista = new ArrayList<>();
    }

    public List<Avengers> getListado() {
        return lista;
    }
    public void setListado(List<Avengers> listado) {
        this.lista = lista;
    }

    /*public void agregarAvenger(Avengers avenger) {
        listado.add(avenger);
    }*/

    public void add(String id, String nombre, int pagoMensual) throws Exception {
        lista.add(new Avengers(id, nombre, pagoMensual));
    }

    public List<Avengers> listarAvenger(){
        return new ArrayList<Avengers>(lista);
    }

}
