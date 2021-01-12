package edu.payclip.design.patterns.agp.controller;

import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;
import edu.payclip.design.patterns.agp.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payments")
@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public void pay(@RequestBody PaymentRequest paymentRequest) {
        paymentService.pay(paymentRequest);
    }
}
