package edu.payclip.design.patterns.agp.domain;

import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;

public interface GatewayProxy {

    PaymentRequestReady prepare(PaymentRequest paymentRequest);

    ProxyTransaction pay(PaymentRequestReady paymentReady);

}
