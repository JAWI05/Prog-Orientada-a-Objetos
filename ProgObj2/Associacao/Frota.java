import java.util.ArrayList;
public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public void AdicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void MostrarInfoVeiculos(){
        for(Veiculo veiculo:veiculos){
            veiculo.MostrarInfo();
        }
    }

    public void CalcularMediaQuilometragem(double mediaQuilometragem){
        for(Veiculo veiculo:veiculos){
            mediaQuilometragem = veiculo.getQuilometragem() * veiculo.getAno();
            System.out.println("A quilometragem média é "+mediaQuilometragem);
        }
    }
}
