public class Quarto {
    private int numeroQuarto;
    private int capacidade;
    private boolean disponivel;

    public Quarto(int numeroQuarto, int capacidade, boolean disponivel) {
        this.numeroQuarto = numeroQuarto;
        this.capacidade = capacidade;
        this.disponivel = disponivel;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void MostrarReservas(){
        System.out.println("O quarto "+numeroQuarto);
        if(disponivel){
            System.out.println("O quarto está disponível!");
            System.out.println("--------------------------------------");
        }
        else{
            System.out.println("O quarto está indisponível!");
            System.out.println("--------------------------------------");
        }
    }
}
