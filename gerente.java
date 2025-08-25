 class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() * 1.2; // 20% de bônus
    }
}
