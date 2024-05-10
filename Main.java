package SistemaBancario;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNome("Carlos Alberto");
        cliente.setCpf("0026589423");

        Conta conta1 = new Conta();

        conta1.setTitular(cliente);
        conta1.setNumero(1000);
        conta1.setSaldo(50);

        Banco sistemaBancario = new Banco();

        System.out.println("Saldo antes do depósito");
        conta1.imprimirSaldo();

        System.out.println("Saldo depois do depósito");
        sistemaBancario.depositar(conta1, 200);

        System.out.println("Sacando 20  reais");
        sistemaBancario.sacar(conta1, 20);


    }

}
