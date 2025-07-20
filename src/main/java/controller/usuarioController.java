package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class usuarioController {
    
    private static List<Usuario> listasUsuarios = new ArrayList<>();

    public static void addUsuario(Usuario user) {
        listasUsuarios.add(user);
    }

    public static Usuario login(String email, String senha) {
        for (Usuario user : listasUsuarios) {
            if (user.getEmail().equals(email) && user.getSenha().equals(senha)) {
                return user;
            }
        }
        return null;
    }

    
}
