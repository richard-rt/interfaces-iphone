package org.telefone.iphone;

import org.telefone.navegacao.Navegador;
import org.telefone.reprodutorMusical.Musica;
import org.telefone.telelecomunicacao.Telefonia;

public class Iphone implements Musica, Telefonia, Navegador {
    public static void main(String[] args) {
        Iphone iphoneXr = new Iphone();

        System.out.println("Ações da interface Navegador");
        iphoneXr.adicionarNovaAba();
        iphoneXr.exibirPagina();
        iphoneXr.atualizarPagina();

        System.out.println("\nAções da interface Reprodutor Musical");
        iphoneXr.selecionarMusica();
        iphoneXr.tocarMusica();
        iphoneXr.pausarMusica();

        System.out.println("\nAções da interface Telefonia");
        iphoneXr.ligar();
        iphoneXr.atender();
        iphoneXr.inciarCorreioVoz();
    }
}