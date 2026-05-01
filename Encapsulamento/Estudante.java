public class Estudante {
    private String nome;
    private String matricula;
    private double nota;

    public Estudante(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibir_informacoes(){
        System.out.print("O nome do estudante é ");
        System.out.println(getNome());
        System.out.print("O numero da matricula é ");
        System.out.println(getMatricula());
        System.out.print("Ele(a) tirou ");
        System.out.println(getNota());
    }
    public void atualizarNota(double novaNota){
        nota = novaNota;
    }
}
