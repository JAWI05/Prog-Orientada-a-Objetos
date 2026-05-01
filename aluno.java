public class aluno {
    public enum Curso{
        ENGENHARIA_COMPUTACAO, ENGENHARIA_PRODUCAO, DIREITO, ECONOMIA, ADMINISTRACAO
    }
    private String nome;
    private Curso curso;
    private String email;
    private String dia_que_pegou;
    private String dia_devolucao;
    private int idade;
    private int ra;
    private int cpf;
    private int quantidade_livros_possui;
    private boolean tem_multa;
    private boolean aluno_da_instituicao;

    public aluno(String nome, Curso curso, String email, String dia_que_pegou, String dia_devolucao, int idade, int ra, int cpf, int quantidade_livros_possui, boolean tem_multa, boolean aluno_da_instituicao) {
        this.nome = nome;
        this.curso = curso;
        this.email = email;
        this.dia_que_pegou = dia_que_pegou;
        this.dia_devolucao = dia_devolucao;
        this.idade = idade;
        this.ra = ra;
        this.cpf = cpf;
        this.quantidade_livros_possui = quantidade_livros_possui;
        this.tem_multa = tem_multa;
        this.aluno_da_instituicao = aluno_da_instituicao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso=" + curso +
                ", email='" + email + '\'' +
                ", dia_que_pegou='" + dia_que_pegou + '\'' +
                ", dia_devolucao='" + dia_devolucao + '\'' +
                ", idade=" + idade +
                ", ra=" + ra +
                ", cpf=" + cpf +
                ", quantidade_livros_possui=" + quantidade_livros_possui +
                ", tem_multa=" + tem_multa +
                ", aluno_da_instituicao=" + aluno_da_instituicao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_que_pegou() {
        return dia_que_pegou;
    }

    public void setDia_que_pegou(String dia_que_pegou) {
        this.dia_que_pegou = dia_que_pegou;
    }

    public String getDia_devolucao() {
        return dia_devolucao;
    }

    public void setDia_devolucao(String dia_devolucao) {
        this.dia_devolucao = dia_devolucao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getQuantidade_livros_possui() {
        return quantidade_livros_possui;
    }

    public void setQuantidade_livros_possui(int quantidade_livros_possui) {
        this.quantidade_livros_possui = quantidade_livros_possui;
    }

    public boolean isTem_multa() {
        return tem_multa;
    }

    public void setTem_multa(boolean tem_multa) {
        this.tem_multa = tem_multa;
    }

    public boolean isAluno_da_instituicao() {
        return aluno_da_instituicao;
    }

    public void setAluno_da_instituicao(boolean aluno_da_instituicao) {
        this.aluno_da_instituicao = aluno_da_instituicao;
    }

    public void multa(){
        if(tem_multa){
            System.out.println("O aluno possui multa. Ele não pode receber livros.");
        }
    }
    public void sem_multa(){
        if(!tem_multa){
            System.out.println("O aluno tem permissão de pegar o livro.");
        }
    }
    public void pagar_multa() {
        if (tem_multa) {
            System.out.println("O aluno pagou! A multa sairá do sistema");
            this.sem_multa();
        } else {
            System.out.println("O aluno não possui multa!");
            this.sem_multa();
        }
    }
}