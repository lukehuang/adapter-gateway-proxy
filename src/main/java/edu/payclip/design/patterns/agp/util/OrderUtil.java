package edu.payclip.design.patterns.agp.util;

import edu.payclip.design.patterns.agp.representation.OrderItemRepresentation;
import edu.payclip.design.patterns.agp.representation.OrderRepresentation;

import java.math.BigDecimal;

public final class OrderUtil {

    private OrderUtil() {
    }

    public static BigDecimal calculateAmount(OrderRepresentation orderRepresentation) {
        return orderRepresentation.getItems().stream()
                .map(OrderUtil::calculatePriceByItem)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal calculatePriceByItem(OrderItemRepresentation orderItemRepresentation) {
        BigDecimal quantity = BigDecimal.valueOf(orderItemRepresentation.getQuantity());
        return orderItemRepresentation.getPrice().multiply(quantity);
    }

}
