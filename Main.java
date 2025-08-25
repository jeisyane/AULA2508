public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 3000));
        funcionarios.add(new Gerente("Ana", 5000));
        funcionarios.add(new Vendedor("Pedro", 2000, 500));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Pagamento: " + f.calcularPagamento());
        }
    }
}
