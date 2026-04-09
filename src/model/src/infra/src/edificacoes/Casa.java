package edificacoes;
import model.ModuloUrbano;

public class Casa extends ModuloUrbano {
    private String proprietario;

    public Casa(int id, String nome, double custo, String dono) {
        super(id, nome, custo);
        this.proprietario = dono;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção residencial na casa de " + proprietario);
    }
}
