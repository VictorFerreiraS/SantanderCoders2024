package br.com.grupo5.autenticacao.login;

public class Login {
    public Login() {
    }

    public static boolean autenticacao(String usuario, String senha) {
        return usuario.equals(MockDataBase.adminUserName) ? senha.equals(MockDataBase.adminPassword) : false;
    }
}