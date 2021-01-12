package edu.payclip.design.patterns.agp.domain.adapter;

import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.domain.ProxyTransaction;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;

public abstract class PaymentAdapter {

    public abstract PaymentRequestReady preparePayment(PaymentRequest paymentRequest);

    public abstract ProxyTransaction pay(PaymentRequestReady paymentReady);

    // pay
    // authorize (reference)
    // refund (reference)
    // charge-back

}
