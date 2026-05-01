import java.util.ArrayList;
public class Pedido {
    private ArrayList<Produto> produtos;
    private int numeroPedido;

    public Pedido(int numeroPedido) {
        this.produtos = new ArrayList<>();
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void AdicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularValorTotal() {
        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco() * produto.getQuant_em_estoque();
        }
        return soma;
    }

    public void ExibirDetalhes(){
        for(Produto produto:produtos){
            produto.MostrarInfo();
        }
        System.out.println("O valor total é "+calcularValorTotal());
    }
}
