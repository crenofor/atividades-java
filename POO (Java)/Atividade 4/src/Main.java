import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Pix());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Boleto());

        for (Pagamento pagamento : pagamentos) {
            pagamento.pagar(100.0);
            System.out.println();
        }
    }
}