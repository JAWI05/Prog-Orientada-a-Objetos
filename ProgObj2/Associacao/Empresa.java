import java.util.ArrayList;
public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void AdicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void MostrarInfoFuncionarios(){
        for(Funcionario funcionario : funcionarios){
            funcionario.mostrarInfo();
        }
    }

    public void BonusAnual(){
        for(Funcionario funcionario : funcionarios){
            double bonus = (funcionario.getSalario()*0.1);
            funcionario.setSalario(funcionario.getSalario()+bonus);
            System.out.println("O funcionario "+funcionario.getNome()+" ganhará bônus: "+bonus);
            System.out.println("O funcionario "+funcionario.getNome()+" ganhará agora com o bônus: "+funcionario.getSalario());
            System.out.println("------------------------------------------");
        }
    }

}
