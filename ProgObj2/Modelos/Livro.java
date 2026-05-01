public class Livro {
    private String Titulo;
    private String Autor;
    private int AnoPublicacao;
    private boolean Disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        Titulo = titulo;
        Autor = autor;
        AnoPublicacao = anoPublicacao;
        Disponivel = disponivel;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.AnoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        Disponivel = disponivel;
    }

    public void Emprestimo(){
        if(Disponivel){
            System.out.println("O livro está disponivel, empréstimo realizado!");
            Disponivel = false;
        }
        else{
            System.out.println("O livro está indisponível no momento.");
        }
    }

    public void DevolverLivro(){
        if(!Disponivel){
            Disponivel = true;
            System.out.println("O livro foi devolvido com sucesso!");
        }
    }

    public void MostrarInfo(){
        System.out.println("Título: "+Titulo);
        System.out.println("Autor é "+Autor);
        System.out.println("O ano de publicação é "+AnoPublicacao);
        if(Disponivel){
            System.out.println("O livro está disponível!");
        }
        else{
            System.out.println("O livro não está disponível!");
        }
        System.out.println("--------------------------------------");
    }
}
