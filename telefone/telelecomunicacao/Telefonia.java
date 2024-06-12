package org.telefone.telelecomunicacao;

public interface Telefonia {

    public default void ligar(){
        System.out.println("Ligando");
    }

    public default void atender(){
        System.out.println("Atendendo");
    }

    public default void inciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
