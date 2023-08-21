package Service;

import java.time.LocalDate;

import Entities.Contract;
import Entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	

    public void  processContract(Contract contract, Integer months){
        Double basicQuota = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota,i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getParcelas().add(new Installment(dueDate, quota));
        }
    }
}
