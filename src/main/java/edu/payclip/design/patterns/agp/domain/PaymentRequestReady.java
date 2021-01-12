package edu.payclip.design.patterns.agp.domain;

import edu.payclip.design.patterns.agp.representation.OrderRepresentation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class PaymentRequestReady {

    private BigDecimal amount;
    private BigDecimal tax;
    private ProxyComponent proxy;
    private OrderRepresentation order; // Nice to have Immutable object

}
