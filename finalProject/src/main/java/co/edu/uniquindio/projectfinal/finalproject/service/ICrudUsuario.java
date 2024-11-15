package co.edu.uniquindio.projectfinal.finalproject.service;

import co.edu.uniquindio.projectfinal.finalproject.model.Usuario;

import java.util.List;

public interface ICrudUsuario {
    boolean crearUsuario(String nombreUsuario, String contrasenia);
    boolean eliminarUsuario(String nombreUsuario);
    boolean modificarUsuario(String nombreUsuario, String NuevaContrasenia, String nuevoNombreUsuario);
    Usuario buscarUsuario(String nombreUsuario);
    List<Usuario> listarUsuarios();
    boolean verificarUsuarioExistente(String nombreUsuario);
}
