//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Ricardo", "43222", 4.5);
        e1.atualizarNota(8.9);
        System.out.println(e1);
        Conta_bancaria c1 = new Conta_bancaria("32444", 56.89);
        c1.depositar(5.8);
        System.out.println(c1);
    }
}