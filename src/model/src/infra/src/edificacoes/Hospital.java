package edificacoes;
import model.ModuloUrbano;

public class Hospital extends ModuloUrbano {
    private int leitos;

    public Hospital(int id, String nome, double custo, int leitos) {
        super(id, nome, custo);
        this.leitos = leitos;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Higienização e manutenção hospitalar técnica.");
    }
}
