package interfaz;

import java.util.List;

import model.Usuario;

public interface BusquedaStrategy {
    List<Usuario> buscar(List<Usuario> usuarios, String criterio);
}
