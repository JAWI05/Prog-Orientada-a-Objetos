public class Produto {
    private String nome;
    private double preco;
    private int quant_em_estoque;

    public Produto(String nome, double preco, int quant_em_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quant_em_estoque = quant_em_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant_em_estoque() {
        return quant_em_estoque;
    }

    public void setQuant_em_estoque(int quant_em_estoque) {
        this.quant_em_estoque = quant_em_estoque;
    }

    public void MostrarInfo(){
        System.out.println("Produto: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Possui "+quant_em_estoque+" em estoque");
        System.out.println("--------------------------------------");
    }
}