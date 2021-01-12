package edu.payclip.design.patterns.agp.domain;

import edu.payclip.design.patterns.agp.domain.adapter.AdapterFactory;
import edu.payclip.design.patterns.agp.domain.adapter.PaymentAdapter;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class Gateway {

    private final AdapterFactory adapterFactory;

    public Gateway(AdapterFactory adapterFactory) {
        this.adapterFactory = adapterFactory;
    }

    public PaymentRequestReady preparePayment(PaymentRequest paymentRequest) {
        PaymentAdapter adapter = adapterFactory.getInstance(paymentRequest.getProxy());
        return adapter.preparePayment(paymentRequest);
    }

    public ProxyTransaction pay(PaymentRequestReady paymentRequestReady) {
        PaymentAdapter adapter = adapterFactory.getInstance(paymentRequestReady.getProxy());
        return adapter.pay(paymentRequestReady);
    }
}
