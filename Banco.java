package SistemaBancario;

public class Banco {

    public void depositar(Conta conta, double valor) {

        double saldoAtual = conta.getSaldo();

        double novoSaldo = saldoAtual + valor;

        conta.setSaldo(novoSaldo);

        System.out.println("O Depósito de " + valor + " realizado com sucesso. O Novo Saldo é de: " + novoSaldo);
    }

    public void sacar(Conta conta, double valor) {

        double saldoAtual = conta.getSaldo();

        double novoSaldo = saldoAtual - valor;

        if (novoSaldo < 0) {
            System.out.println("Não foi possivel realizar o saque, Saldo Insuficiente!");
        } else {
            conta.setSaldo(novoSaldo);
            System.out.println("Saldo Anterior: " + saldoAtual + "\nValor Retirado: " + valor + "\nValor Atual: " + novoSaldo);
        }

    }

    public void transferir(Conta origem, Conta destino, double valor) {

        double saldoAtualOrigem = origem.getSaldo();
        double novoSaldoOrigem = saldoAtualOrigem - valor;

        if (novoSaldoOrigem < 0) {
            System.out.println("Transferencia não realizada! Saldo Insuficiente.");
        } else {
            origem.setSaldo(novoSaldoOrigem);
            double novoSaldoDestino = destino.getSaldo();
            destino.setSaldo(novoSaldoDestino + valor);

            System.out.println("Transferencia realizada com sucesso!");
        }

    }
}
