import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros;
    private String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void AdicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void MostrarInfoLivro(){
        for(Livro livro:livros){
            livro.MostrarInfo();
        }
    }

    public void emprestarLivro() {
        for (Livro livro : livros) {
            livro.Emprestimo();
        }
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.DevolverLivro();
            }
        }
    }
}
