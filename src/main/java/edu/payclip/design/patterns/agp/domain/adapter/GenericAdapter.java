package edu.payclip.design.patterns.agp.domain.adapter;

import edu.payclip.design.patterns.agp.domain.GatewayProxy;
import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.domain.ProxyTransaction;
import edu.payclip.design.patterns.agp.domain.operation.PaymentOperation;
import edu.payclip.design.patterns.agp.domain.operation.PrepareOperation;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class GenericAdapter {

    public PrepareOperation prepareOn(GatewayProxy proxy) {
        return paymentRequest -> prepare(paymentRequest, proxy);
    }

    public PaymentOperation payOn(GatewayProxy proxy) {
        return paymentReady -> pay(paymentReady, proxy);
    }

    private ProxyTransaction pay(PaymentRequestReady paymentReady, GatewayProxy proxy) {
        return proxy.pay(paymentReady);
    }

    private PaymentRequestReady prepare(PaymentRequest paymentRequest, GatewayProxy proxy) {
        return proxy.prepare(paymentRequest);
    }

}
