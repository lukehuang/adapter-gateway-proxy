package edu.payclip.design.patterns.agp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProxyTransaction {

    private Long orderId;
    private Instant createAt;
    private BigDecimal amount;
    private ProxyComponent proxy;
    private String reference;

}
