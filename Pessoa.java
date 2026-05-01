public class Pessoa {
    public enum Genero {
        MASCULINO, FEMININO, NAO_BINARIO, OUTRO, PREFIRO_NAO_DIZER
    }

    private double altura;
    private String nome;
    private Genero genero;
    private String cor_olhos;
    private String cor_cabelo;
    private final String país = "Brasil";
    private final String língua = "Português";
    private int idade;
    private boolean comer;
    private boolean temComida;
    private boolean fogo;

    public Pessoa(double altura, String nome, Genero genero, String cor_olhos, String cor_cabelo, int idade, boolean comer, boolean temComida, boolean fogo) {
        this.altura = altura;
        this.nome = nome;
        this.genero = genero;
        this.cor_olhos = cor_olhos;
        this.cor_cabelo = cor_cabelo;
        this.idade = idade;
        this.comer = comer;
        this.temComida = temComida;
        this.fogo = fogo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "altura=" + altura +
                ", nome='" + nome + '\'' +
                ", genero=" + genero +
                ", cor_olhos='" + cor_olhos + '\'' +
                ", cor_cabelo='" + cor_cabelo + '\'' +
                ", país='" + país + '\'' +
                ", língua='" + língua + '\'' +
                ", idade=" + idade +
                ", comer=" + comer +
                ", temComida=" + temComida +
                ", fogo=" + fogo +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCor_olhos() {
        return cor_olhos;
    }

    public void setCor_olhos(String cor_olhos) {
        this.cor_olhos = cor_olhos;
    }

    public String getCor_cabelo() {
        return cor_cabelo;
    }

    public void setCor_cabelo(String cor_cabelo) {
        this.cor_cabelo = cor_cabelo;
    }

    public String getPaís() {
        return país;
    }

    public String getLíngua() {
        return língua;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isComer() {
        return comer;
    }

    public void setComer(boolean comer) {
        this.comer = comer;
    }

    public boolean isTemComida() {
        return temComida;
    }

    public void setTemComida(boolean temComida) {
        this.temComida = temComida;
    }

    public boolean isFogo() {
        return fogo;
    }

    public void setFogo(boolean fogo) {
        this.fogo = fogo;
    }

    public void adicionarComida() {
        temComida = true;
        System.out.println("Comida adicionada! Bon appétit!");
    }

    public void removerComida() {
        if (temComida) {
            temComida = false;
            System.out.println("A comida acabou!");
        } else {
            System.out.println("Não há comida.");
        }
    }

    public void comer() {
        if (temComida) {
            System.out.println("Você está comendo...");
        } else {
            System.out.println("Você não tem comida! Adicionando comida...");
            adicionarComida();
            System.out.println("Agora você pode comer!");
        }
    }

    public void fazerFogo() {
        if (!fogo) {
            System.out.println("Você não consegue fazer fogo.");
            fogo = true;
            System.out.println("Você fez fogo.");
        } else {
            System.out.println("Você consegue fazer fogo.");
        }
    }

    public void apagarFogo() {
        if (fogo) {
            fogo = false;
            System.out.println("O fogo foi apagado.");
        } else {
            System.out.println("O fogo já estava apagado.");
        }
    }

    public void FOGO() {
        if (fogo) {
            System.out.println("Você acendeu fogo!");
        } else {
            this.fazerFogo();
            System.out.println("Você tem fogo agora!");
        }
    }
}