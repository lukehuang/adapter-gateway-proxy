package edu.payclip.design.patterns.agp.domain.adapter;

import edu.payclip.design.patterns.agp.domain.GatewayProxy;
import edu.payclip.design.patterns.agp.domain.PaymentRequestReady;
import edu.payclip.design.patterns.agp.domain.ProxyTransaction;
import edu.payclip.design.patterns.agp.representation.request.PaymentRequest;

public abstract class GatewayAdapter extends PaymentAdapter {

    private final GenericAdapter genericAdapter;
    private final GatewayProxy proxy;

    protected GatewayAdapter(GenericAdapter genericAdapter, GatewayProxy proxy) {
        this.genericAdapter = genericAdapter;
        this.proxy = proxy;
    }

    @Override
    public PaymentRequestReady preparePayment(PaymentRequest paymentRequest) {
        return genericAdapter.prepareOn(proxy).prepare(paymentRequest);
    }

    @Override
    public ProxyTransaction pay(PaymentRequestReady paymentReady) {
        return genericAdapter.payOn(proxy).pay(paymentReady);
    }

}
