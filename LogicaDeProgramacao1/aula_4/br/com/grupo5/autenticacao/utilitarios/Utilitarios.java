package br.com.grupo5.autenticacao.utilitarios;

import static  br.com.grupo5.autenticacao.constantes.Constantes.*;

public class Utilitarios {
    public Utilitarios() {
    }

    public static double converterKmParaMilhas(double km) {
        return km * FATOR_CONVERSAO_KM;
    }

    public static double converterMilhasParaKm(double milhas) {
        return milhas * FATOR_CONVERSAO_MILHAS;
    }

    public static double calcularCoposParaEncherPiscina(double volumePiscina) {
        return volumePiscina / VOLUME_COPO_EM_LITROS;
    }

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static double converterPolegadasParaCm(double polegadas) {
        return polegadas * FATOR_CONVERSAO_POLEGADA_PARA_CM;
    }

    public static double converterCmParaPolegadas(double cm) {
        return cm / FATOR_CONVERSAO_POLEGADA_PARA_CM;
    }

    public static double converterCelsiusParaKelvin(double celsius) {
        return celsius + FATOR_KELVIN;
    }

    public static double converterKelvinParaCelsius(double kelvin) {
        return kelvin - FATOR_KELVIN;
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return 1.8 * celsius + 32.0;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return 0.5555555555555556 * (fahrenheit - 32.0);
    }

    public static double converterEnergiaParaHumanosGWH(double energia) {
        return energia / ENERGIA_MEDIA_GERADA_POR_HUMANOS_GHW;
    }
}

