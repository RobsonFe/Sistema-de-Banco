package SistemaBancario;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Carlos Alberto");
        cliente1.setCpf("0026589423");

        Conta conta1 = new Conta();

        conta1.setTitular(cliente1);
        conta1.setNumero(1000);
        conta1.setSaldo(50);

        Banco sistemaBancario = new Banco();

        System.out.println("Saldo antes do depósito");
        System.out.println("Cliente: " + cliente1.getNome() + "\nCPF: " + cliente1.getCpf());
        conta1.imprimirSaldo();

        System.out.println("\n");

        System.out.println("Saldo depois do depósito");
        sistemaBancario.depositar(conta1, 200);

        System.out.println("\n");

        System.out.println("Sacando 20  reais");
        sistemaBancario.sacar(conta1, 20);

        System.out.println("\nOutro Cliente\n");

        Cliente cliente2 = new Cliente();

        cliente2.setNome("Fabiana Santos");
        cliente2.setCpf("15678942583");

        Conta conta2 = new Conta();

        conta2.setTitular(cliente2);
        conta2.setNumero(2000);
        conta2.setSaldo(20);

        System.out.println("Saldo antes do depósito");
        System.out.println("Cliente: " + cliente2.getNome() + "\nCPF: " + cliente2.getCpf());
        conta2.imprimirSaldo();

        System.out.println("\n");

        System.out.println("Transferencia do Cliente: " + cliente1.getNome() + "\nPara o Cliente: " + cliente2.getNome());

        sistemaBancario.transferir(conta1, conta2, 100);

        System.out.println("\n");

        System.out.println("Saldo depois da transferencia");
        System.out.println("Cliente: " + cliente2.getNome() + "\nCPF: " + cliente2.getCpf());
        conta2.imprimirSaldo();
    }

}
