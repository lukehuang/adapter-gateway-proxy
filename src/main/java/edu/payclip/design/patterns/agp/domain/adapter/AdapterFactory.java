package edu.payclip.design.patterns.agp.domain.adapter;

import edu.payclip.design.patterns.agp.domain.ProxyComponent;
import edu.payclip.design.patterns.agp.domain.adapter.clip.ClipAdapter;
import edu.payclip.design.patterns.agp.domain.adapter.paypal.PayPalAdapter;
import org.springframework.stereotype.Component;

@Component
public class AdapterFactory {

    private final PayPalAdapter payPalAdapter;
    private final ClipAdapter clipAdapter;

    public AdapterFactory(PayPalAdapter payPalAdapter, ClipAdapter clipAdapter) {
        this.payPalAdapter = payPalAdapter;
        this.clipAdapter = clipAdapter;
    }

    public PaymentAdapter getInstance(ProxyComponent proxyComponent) {
        switch (proxyComponent) {
            case PAYPAL:
                return payPalAdapter;
            case CLIP:
                return clipAdapter;
            default:
                throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
