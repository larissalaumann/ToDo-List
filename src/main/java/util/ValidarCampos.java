package util;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ValidarCampos {
    public boolean validaTextField(JTextField campo, String texto, JLabel aviso) {
        if (campo.getText().equals(texto) || campo.getText().isEmpty()) {
            campo.setBorder(new LineBorder(Color.RED, 2));
            aviso.setText("O campo \"" + texto + "\" não foi preenchido.");
            aviso.setForeground(Color.RED);
            return true;
        } else {
            campo.setBorder(new LineBorder(Color.GRAY, 1));
            aviso.setText("");
            return false;
        }
    }

    public static boolean validaPasswordField(JPasswordField campo, String texto, JLabel aviso) {
        String valor = new String(campo.getPassword());
        if (valor.equals(texto) || valor.isEmpty()) {
            campo.setBorder(new LineBorder(Color.RED, 2));
            aviso.setText("O campo " + texto + " não foi preenchido.");
            aviso.setForeground(Color.RED);
            return true;
        } else {
            campo.setBorder(new LineBorder(Color.GRAY, 1));
            aviso.setText("");
            return false;
        }
    }

    public static boolean validaSenhaIguais(JPasswordField senha, JPasswordField confirmarSenha, JLabel aviso) {
        String s1 = new String(senha.getPassword());
        String s2 = new String(confirmarSenha.getPassword());

        if (!s1.equals(s2)) {
            senha.setBorder(new LineBorder(Color.RED, 2));
            confirmarSenha.setBorder(new LineBorder(Color.RED, 2));
            aviso.setText("As senhas não coincidem.");
            aviso.setForeground(Color.RED);
            return true;
        } else {
            senha.setBorder(new LineBorder(Color.GRAY, 1));
            confirmarSenha.setBorder(new LineBorder(Color.GRAY, 1));
            aviso.setText("");
            return false;
        }
    }
}
