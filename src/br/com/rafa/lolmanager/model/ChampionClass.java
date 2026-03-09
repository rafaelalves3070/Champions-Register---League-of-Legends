package br.com.rafa.lolmanager.model;

public enum ChampionClass {
    MAGO(1),
    ATIRADOR(2),
    SUPORTE(3),
    TANK(4),
    ASSASSINO(5);

    private final int valor;

    ChampionClass(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static ChampionClass fromValor(int valor) {
        for (ChampionClass classe : values()) {
            if (classe.valor == valor) {
                return classe;
            }
        }
        throw new IllegalArgumentException("Valor inválido");
    }
}
