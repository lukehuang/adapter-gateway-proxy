package edu.payclip.design.patterns.agp.representation.request;

import edu.payclip.design.patterns.agp.domain.ProxyComponent;
import edu.payclip.design.patterns.agp.representation.OrderRepresentation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class PaymentRequest {

    private ProxyComponent proxy;
    private OrderRepresentation order;

}
