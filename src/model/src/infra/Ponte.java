package infra;
import model.ModuloUrbano;

public class Ponte extends ModuloUrbano {
    private double cargaMaxima;

    public Ponte(int id, String nome, double custo, double carga) {
        super(id, nome, custo);
        this.cargaMaxima = carga;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Vistoria estrutural da ponte " + nome);
    }
}
