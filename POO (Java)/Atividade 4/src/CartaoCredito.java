public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Valor a ser pago: " + valor);
        System.out.println("Pagando com Cartão de Credito...");
    }
}
