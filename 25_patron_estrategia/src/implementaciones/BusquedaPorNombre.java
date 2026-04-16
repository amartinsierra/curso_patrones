package implementaciones;

import java.util.List;

import interfaz.BusquedaStrategy;
import model.Usuario;

public class BusquedaPorNombre implements BusquedaStrategy {
    public List<Usuario> buscar(List<Usuario> usuarios, String criterio) {
        return usuarios.stream()
                .filter(u -> u.getNombre().equalsIgnoreCase(criterio))
                .toList();
    }
}
