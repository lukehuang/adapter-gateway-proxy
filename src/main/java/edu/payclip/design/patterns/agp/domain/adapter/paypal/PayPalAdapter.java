package edu.payclip.design.patterns.agp.domain.adapter.paypal;

import edu.payclip.design.patterns.agp.domain.adapter.GatewayAdapter;
import edu.payclip.design.patterns.agp.domain.adapter.GenericAdapter;
import org.springframework.stereotype.Component;

@Component
public class PayPalAdapter extends GatewayAdapter {

    protected PayPalAdapter(GenericAdapter genericAdapter, PayPalGatewayProxy proxy) {
        super(genericAdapter, proxy);
    }

}
