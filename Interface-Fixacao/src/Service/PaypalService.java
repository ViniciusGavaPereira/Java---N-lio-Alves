package Service;

public class PaypalService implements OnlinePaymentService {

    private Double jurosSimples = 0.01;
    private Double taxa = 0.02;

    @Override
    public Double paymentFee(Double amount) {
        return amount * taxa;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * jurosSimples * months;
    }
    
}
