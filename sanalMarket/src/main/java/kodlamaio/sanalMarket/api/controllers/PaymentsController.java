package kodlamaio.sanalMarket.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.sanalMarket.business.abstracts.PaymentService;
import kodlamaio.sanalMarket.core.utilities.result.DataResult;
import kodlamaio.sanalMarket.entities.concretes.Payment;

@RestController
@RequestMapping("/api/payments/")
@CrossOrigin
public class PaymentsController {
	
	private PaymentService paymentService;

	public PaymentsController(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}
	
	@GetMapping("getbyorderid")
	public DataResult<Payment> getByOrderId(int orderId) {
		return this.paymentService.getByOrderId(orderId);
	}

}
