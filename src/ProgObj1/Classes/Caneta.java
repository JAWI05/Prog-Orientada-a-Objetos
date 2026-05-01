public class Caneta {

    //enum enumerar (enumerar certos atributos)
    public enum Cor{
        AZUL, VERMELHA, PRETA, VERDE
    }

    private Cor cor;
    // final - não muda mais o tamanho (fixo)
    private final double tamanho = 10.0;
    private final double expessura = 1.5;
    private String marca;
    private String material;
    private boolean tampa;

    public Caneta(Cor cor, String marca, String material, boolean tampa) {
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.tampa = tampa;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "cor=" + cor +
                ", tamanho=" + tamanho +
                ", expessura=" + expessura +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", tampa=" + tampa +
                '}';
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getExpessura() {
        return expessura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public void abrirTampa(){
        if(!tampa){
            tampa=true;
            System.out.println("A tampa foi aberta!");
        }
        else{
            System.out.println("A tampa já está aberta!");
        }
    }
    public void fecharTampa(){
        if(tampa){
            tampa=false;
            System.out.println("A tampa foi fechada!");
        }
        else{
            System.out.println("A tampa já foi fechada!");
        }
    }
    public void escrever(){
        if(tampa){
            System.out.println("Você pode escrever...");
        }
        else{
            System.out.println("Você não consegue escrever. A tampa está fechada!");
            this.abrirTampa();
            System.out.println("Você pode escrever agora!");
        }
    }
}
