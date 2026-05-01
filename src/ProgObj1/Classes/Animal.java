public class Animal {
    public enum Alimentacao{
        ONIVORO, VEGETARIANO, CARNIVORO
    }
    public enum Tamanho{
        PEQUENO, MEDIO, GRANDE
    }
    public enum Class{
        AÉREO, TERRESTRE, AQUATICO
    }
    private String nome;
    private Tamanho tamanho;
    private boolean comer;
    private boolean dormir;
    private Alimentacao alimentacao;
    private String COR_predominante;
    private boolean selvagem;
    private Class classificacao;

    public Animal(String nome, Tamanho tamanho, boolean comer, boolean dormir, Alimentacao alimentacao, String COR_predominante, boolean selvagem, Class classificacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.comer = comer;
        this.dormir = dormir;
        this.alimentacao = alimentacao;
        this.COR_predominante = COR_predominante;
        this.selvagem = selvagem;
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tamanho=" + tamanho +
                ", comer=" + comer +
                ", dormir=" + dormir +
                ", alimentacao=" + alimentacao +
                ", COR_predominante='" + COR_predominante + '\'' +
                ", selvagem=" + selvagem +
                ", classificacao=" + classificacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isComer() {
        return comer;
    }

    public void setComer(boolean comer) {
        this.comer = comer;
    }

    public boolean isDormir() {
        return dormir;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getCOR_predominante() {
        return COR_predominante;
    }

    public void setCOR_predominante(String COR_predominante) {
        this.COR_predominante = COR_predominante;
    }

    public boolean isSelvagem() {
        return selvagem;
    }

    public void setSelvagem(boolean selvagem) {
        this.selvagem = selvagem;
    }

    public Class getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Class classificacao) {
        this.classificacao = classificacao;
    }

    public void Semcomida() {
        if (comer) {
            comer = false;
            System.out.println("Você já não tem comida disponível.");
        } else {
            System.out.println("Você não tem comida disponível.");
        }
    }

    public void Comercomida() {
        if (!comer) {
            comer = true;
            System.out.println("Adicionando comida....Você tem comida disponível agora!");
        } else {
            System.out.println("Você pode comer. Bon appetit!");
        }
    }

    public void Comer() {
        if (comer) {
            System.out.println("Você está comendo...");
        } else {
            System.out.println("Você não tem comida disponível! Adicionando comida...");
            this.comer = true;
            System.out.println("Agora você tem comida. Pode comer!");
        }
    }

    public void Dormimdo() {
        if (!dormir) {
            dormir = true;
            System.out.println("Ele estava acordado. Agora ele está dormindo.");
        } else {
            System.out.println("Ele já está dormindo");
        }
    }

    public void Acordado() {
        if (dormir) {
            dormir = false;
            System.out.println("Ele estava dormindo. Agora está acordado!");
        } else {
            System.out.println("Ele já está acordado!");
        }
    }

    public void Dormir() {
        if (dormir) {
            System.out.println("Ele já está dormindo.");
        } else {
            System.out.println("Ele não está dormindo! Dormindo...");
            this.comer = true;
            System.out.println("Agora ele está dormindo!");
        }
    }
}
