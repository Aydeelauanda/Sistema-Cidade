package infra;
import model.ModuloUrbano;
import model.IConectavel;

public class Estrada extends ModuloUrbano implements IConectavel {
    private double extensaoKm;
    private int limiteVelocidade;

    public Estrada(int id, String nome, double custo, double extensao) {
        super(id, nome, custo);
        this.extensaoKm = extensao;
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Recapeando asfalto da " + nome);
    }

    @Override
    public void conectar() {
        System.out.println("Estrada vinculada ao mapa urbano.");
    }

    @Override
    public String obterCaminho() {
        return "Rota calculada pela via " + nome;
    }
}
