package org.telefone.navegacao;

public interface Navegador {

    public default void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public default void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

    public default void atualizarPagina(){
        System.out.println("Atualizando página");
    }
}
