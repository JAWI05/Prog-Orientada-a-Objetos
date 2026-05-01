import java.util.ArrayList;
public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void FaltaEstoque(){
        for(Produto produto:produtos){
            if(produto.getQuant_em_estoque() == 0){
                System.out.println(produto.getNome()+" está em falta no estoque!");
            }
        }
    }

    public void AdicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void AcrescentarProduto(Produto produto){
        int numquant = produto.getQuant_em_estoque();
        if(produto.getQuant_em_estoque() == numquant){
            produto.setQuant_em_estoque(numquant+1);
        }
    }

    public void RemoverProduto(Produto produto) {
        produtos.remove(produto);
        int numquant = produto.getQuant_em_estoque();
        if (produto.getQuant_em_estoque() == 0) {
            System.out.println("O produto não existe no estoque!");
        }
        if (produto.getQuant_em_estoque() == numquant) {
            produto.setQuant_em_estoque(numquant - 1);
        }
    }

    public void MostrarInfoProduto(){
        for(Produto produto : produtos){
            produto.MostrarInfo();
        }
    }
}