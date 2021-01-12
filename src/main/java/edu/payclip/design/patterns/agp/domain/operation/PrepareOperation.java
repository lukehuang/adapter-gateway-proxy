package edu.payclip.design.patterns.agp.domain.operation;

import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;

@FunctionalInterface
public interface PrepareOperation {

    PaymentRequestReady prepare(PaymentRequest paymentRequest);

}
