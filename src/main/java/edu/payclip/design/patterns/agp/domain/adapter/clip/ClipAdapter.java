package edu.payclip.design.patterns.agp.domain.adapter.clip;

import edu.payclip.design.patterns.agp.domain.adapter.GatewayAdapter;
import edu.payclip.design.patterns.agp.domain.adapter.GenericAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClipAdapter extends GatewayAdapter {

    protected ClipAdapter(GenericAdapter genericAdapter, ClipGatewayProxy proxy) {
        super(genericAdapter, proxy);
    }
}
