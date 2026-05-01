public class Livros {
    private String titulo;
    private String autor;
    private String Genero;
    private String idioma;
    private String edicao;
    private int num_identificacao;
    private int num_paginas;
    private int ano_publicacao;
    private int quantos_exemplares;
    private boolean esta_dispoonivel;
    private boolean aluno_multa;

    public Livros(String titulo, String autor, String genero, String idioma, String edicao, int num_identificacao, int num_paginas, int ano_publicacao, int quantos_exemplares, boolean esta_dispoonivel, boolean aluno_multa) {
        this.titulo = titulo;
        this.autor = autor;
        Genero = genero;
        this.idioma = idioma;
        this.edicao = edicao;
        this.num_identificacao = num_identificacao;
        this.num_paginas = num_paginas;
        this.ano_publicacao = ano_publicacao;
        this.quantos_exemplares = quantos_exemplares;
        this.esta_dispoonivel = esta_dispoonivel;
        this.aluno_multa = aluno_multa;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", Genero='" + Genero + '\'' +
                ", idioma='" + idioma + '\'' +
                ", edicao='" + edicao + '\'' +
                ", num_identificacao=" + num_identificacao +
                ", num_paginas=" + num_paginas +
                ", ano_publicacao=" + ano_publicacao +
                ", quantos_exemplares=" + quantos_exemplares +
                ", esta_dispoonivel=" + esta_dispoonivel +
                ", foi_emprestado=" + aluno_multa +
                '}';
    }

    public String getNome() {
        return titulo;
    }

    public void setNome(String nome) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNum_identificacao() {
        return num_identificacao;
    }

    public void setNum_identificacao(int num_identificacao) {
        this.num_identificacao = num_identificacao;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getQuantos_exemplares() {
        return quantos_exemplares;
    }

    public void setQuantos_exemplares(int quantos_exemplares) {
        this.quantos_exemplares = quantos_exemplares;
    }

    public boolean isEsta_dispoonivel() {
        return esta_dispoonivel;
    }

    public void setEsta_dispoonivel(boolean esta_dispoonivel) {
        this.esta_dispoonivel = esta_dispoonivel;
    }

    public boolean isFoi_emprestado() {
        return aluno_multa;
    }

    public void setFoi_emprestado(boolean foi_emprestado) {
        this.aluno_multa = foi_emprestado;
    }

    public void Emprestimo(){
        if(aluno_multa){
            System.out.println("O aluno está com multa. Não é possivel realizar o empréstimo");
        }
        else{
            if(esta_dispoonivel){
                System.out.println("O livro está disponível. Empréstimo realizado!");
            }
            else{
                System.out.println("O livro não está disponível.");
            }
        }
    }
    public void pagar_multa() {
        if (aluno_multa) {
            System.out.println("O aluno pagou! A multa sairá do sistema");
            aluno_multa = false;
        } else {
            System.out.println("O aluno não possui multa!");
        }
    }

}