package model;

public abstract class ModuloUrbano {
    protected int id;
    protected String nome;
    protected double custoManutencao;

    public ModuloUrbano(int id, String nome, double custo) {
        this.id = id;
        this.nome = nome;
        this.custoManutencao = custo;
    }

    public abstract void realizarManutencao();
}
