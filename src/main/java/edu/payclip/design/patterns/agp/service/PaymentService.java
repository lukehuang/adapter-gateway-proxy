package edu.payclip.design.patterns.agp.service;

import edu.payclip.design.patterns.agp.domain.Gateway;
import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.domain.ProxyTransaction;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    private final Gateway gateway;

    public PaymentService(Gateway gateway) {
        this.gateway = gateway;
    }

    public void pay(PaymentRequest paymentRequest) {
        PaymentRequestReady requestReady = gateway.preparePayment(paymentRequest);
        ProxyTransaction transaction = gateway.pay(requestReady);

        log.info("Transaction to save {}", transaction);
    }
}
