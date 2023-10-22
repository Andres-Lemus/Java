package dev.aeld.sga.servicio;

import dev.aeld.sga.domain.Usuario;
import java.util.List;


public interface UsuarioService {
    public List<Usuario> listarUsuario();
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    
    public Usuario encontrarUsuarioPorUsername(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
}
