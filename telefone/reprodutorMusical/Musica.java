package org.telefone.reprodutorMusical;

public interface Musica {

    public default void tocarMusica() {
        System.out.println("Tocando música");
    }

    public default void pausarMusica() {
        System.out.println("Pausando música");
    }

    public default void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
