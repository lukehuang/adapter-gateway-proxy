package edu.payclip.design.patterns.agp.domain.operation;

import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.domain.ProxyTransaction;

public interface PaymentOperation {

    ProxyTransaction pay(PaymentRequestReady paymentReady);

}
