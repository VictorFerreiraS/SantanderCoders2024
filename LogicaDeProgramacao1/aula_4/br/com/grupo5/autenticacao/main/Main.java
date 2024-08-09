//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.grupo5.autenticacao.main;

import br.com.grupo5.autenticacao.constantes.Constantes;
import br.com.grupo5.autenticacao.login.Login;
import br.com.grupo5.autenticacao.utilitarios.Utilitarios;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu usuario:");
        String usuario = sc.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = sc.nextLine();
        boolean estaAutenticado = Login.autenticacao(usuario, senha);
        if (!estaAutenticado) {
            System.out.println(Constantes.MENSAGEM_LOGIN_INVALIDO);
        } else {
            System.out.println(Utilitarios.converterKmParaMilhas(5.0));
            System.out.println(Utilitarios.calcularCoposParaEncherPiscina(190000.0));
            System.out.println(Utilitarios.converterCelsiusParaKelvin(30.0));
            System.out.println(Utilitarios.converterCmParaPolegadas(50.0));
            System.out.println(Utilitarios.isPar(3));
            System.out.println(Utilitarios.converterEnergiaParaHumanosGWH(150.0));
            sc.close();
        }
    }
}
