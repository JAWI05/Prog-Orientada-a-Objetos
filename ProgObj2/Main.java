public class Main {
    public static void main(String[] args) {
        System.out.println("\nSistema de Gerenciamento de Funcionários");
        Empresa empresa = new Empresa("Tech Solutions");
        Funcionario f1 = new Funcionario("Julio", "Engenheiro Civil", 6500);
        Funcionario f2 = new Funcionario("Livia", "Economista", 3500);
        empresa.AdicionarFuncionario(f1);
        empresa.AdicionarFuncionario(f2);
        empresa.MostrarInfoFuncionarios();
        empresa.BonusAnual();

        System.out.println("\nSistema de Gerenciamento de Pedidos");
        Pedido pedido = new Pedido(428);
        Produto p1 = new Produto("Vassoura", 25, 5);
        pedido.AdicionarProduto(p1);
        Produto p2 = new Produto("Celular", 2500, 1);
        pedido.AdicionarProduto(p2);
        pedido.ExibirDetalhes();

        System.out.println("\nBiblioteca de livros");
        Biblioteca biblioteca = new Biblioteca("Biblioteca");
        Livro livro1 = new Livro("Frankenstein", "Mary Shelley", 1818, true);
        Livro livro2 = new Livro("Metamorfose", "Franz Kafka", 1915, false);
        biblioteca.AdicionarLivro(livro1);
        biblioteca.AdicionarLivro(livro2);
        biblioteca.devolverLivro("Metamorfose");
        biblioteca.MostrarInfoLivro();

        System.out.println("\nSistema de Gestão de Veículos");
        Frota frota = new Frota();
        Veiculo v1 = new Veiculo("Corsa", 10, 200);
        Veiculo v2 = new Veiculo("Fiat", 5, 100);
        frota.AdicionarVeiculo(v1);
        frota.AdicionarVeiculo(v2);
        frota.CalcularMediaQuilometragem(110);
        frota.MostrarInfoVeiculos();

        System.out.println("\nSistema de Controle de Estoque");
        Estoque estoque = new Estoque();
        Produto p3 = new Produto("Cadeira", 60, 0);
        estoque.AdicionarProduto(p1);
        estoque.AdicionarProduto(p2);
        estoque.AdicionarProduto(p3);
        estoque.MostrarInfoProduto();
        estoque.FaltaEstoque();
        estoque.AcrescentarProduto(p3);
        estoque.MostrarInfoProduto();

        System.out.println("\nSistema de Reservas de Hotel");
        Reserva reserva = new Reserva(23, "Rafael");
        Quarto q1 = new Quarto(12, 1, false);
        Quarto q2 = new Quarto(13, 1, true);
        reserva.AdicionarQuarto(q1);
        reserva.AdicionarQuarto(q2);
        reserva.MostrarQuartosDisponiveis();
        reserva.MostrarQuartos();
    }
}
