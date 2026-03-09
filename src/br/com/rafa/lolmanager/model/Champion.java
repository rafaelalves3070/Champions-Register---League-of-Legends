package br.com.rafa.lolmanager.model;

public class Champion {
    private int id;
    private String nome;
    private int danoBase;
    private int vidaBase;
    private int dificuldade;
    private ChampionClass classe;

    public Champion(
            String nome,
            ChampionClass classe,
            int danoBase,
            int vidaBase,
            int dificuldade)
    {
        this.nome = nome;
        this.classe = classe;
        this.danoBase = danoBase;
        this.vidaBase = vidaBase;
        this.dificuldade = dificuldade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(int vidaBase) {
        this.vidaBase = vidaBase;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public ChampionClass getClasse() {
        return classe;
    }

    public void setClasse(ChampionClass classe) {
        this.classe = classe;
    }
}