import java.util.ArrayList;
public class Reserva {
    private ArrayList<Quarto> quartos;
    private int numeroReserva;
    private String nome_hospede;

    public Reserva(int numeroReserva, String nome_hospede) {
        this.quartos = new ArrayList<>();
        this.numeroReserva = numeroReserva;
        this.nome_hospede = nome_hospede;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getNome_hospede() {
        return nome_hospede;
    }

    public void setNome_hospede(String nome_hospede) {
        this.nome_hospede = nome_hospede;
    }


    public void AdicionarQuarto(Quarto quarto){
        quartos.add(quarto);
    }

    public void ReservarQuarto(Quarto quarto){
        if(quarto.isDisponivel()){
            System.out.println("Reservando... O quarto foi reservado!");
            quarto.setDisponivel(false);
        }
        else{
            System.out.println("Quarto indisponível no momento.");
        }
    }

    public void CancelarReserva(Quarto quarto){
        if(!quarto.isDisponivel()){
            System.out.println("Cancelando a reserva...");
            quarto.setDisponivel(true);
        }
        else{
            System.out.println("A reserva já está cancelada.");
        }
    }

    public void MostrarQuartos(){
        for(Quarto quarto:quartos){
            quarto.MostrarReservas();
        }
    }


    public void MostrarQuartosDisponiveis() {
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            if (!quarto.isDisponivel()) {
                quarto.MostrarReservas();
            }
        }
    }

    public void MostrarReservasAtivas() {
        System.out.println("Quartos indisponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                quarto.MostrarReservas();
            }
        }
    }
}
