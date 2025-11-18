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

    public void add(String id, String nombre, int pagoMensual) throws Exception {
        lista.add(new Avengers(id, nombre, pagoMensual));
    }

    public List<Avengers> listarAvenger(){
        return new ArrayList<Avengers>(lista);
    }

    public int busquedaBin(int NivelPeligro) throws Exception{
        int inicio = 0;
        int fin = lista.size() - 1;
        while (inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if (NivelPeligro == lista.get(medio).getNivelPeligro()) {
                return medio;
            } else if (NivelPeligro > lista.get(medio).getNivelPeligro()) {         // este me la genero copilot
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public int busquedaSecuencial(int NivelPeligro) throws Exception{
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getNivelPeligro() == NivelPeligro){
                return i;
            }
        }
        return -1;
    }
}