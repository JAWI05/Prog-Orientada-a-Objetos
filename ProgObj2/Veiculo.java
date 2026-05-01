public class Veiculo {
    private String marca;
    private int ano;
    private double quilometragem;

    public Veiculo(String marca, int ano, double quilometragem) {
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void MostrarInfo(){
        double mediaQuilometragem = quilometragem * ano;
        System.out.println("A marca do carro: "+marca);
        System.out.println("Ele foi fabricado há "+ano);
        System.out.println("A sua quilometragem é "+quilometragem);
        System.out.println("A média de quilometragem usada é de "+mediaQuilometragem);
        System.out.println("-------------------------------------------------------");
    }
}
