public class Vendedor extends Funcionario {
    private double comissaoFixa;

    public Vendedor(String nome, double salarioBase, double comissaoFixa) {
        super(nome, salarioBase);
        this.comissaoFixa = comissaoFixa;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() + comissaoFixa; // Salário base + comissão
    }
}
