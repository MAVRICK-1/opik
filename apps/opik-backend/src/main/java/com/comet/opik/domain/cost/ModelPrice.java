package com.comet.opik.domain.cost;

import lombok.NonNull;

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.BiFunction;

public record ModelPrice(
        @NonNull BigDecimal inputPrice,
        @NonNull BigDecimal outputPrice,
        @NonNull BigDecimal cacheCreationInputTokenPrice,
        @NonNull BigDecimal cacheReadInputTokenPrice,
        @NonNull BigDecimal audioInputPrice,
        @NonNull BigDecimal audioOutputPrice,
        @NonNull BigDecimal imageInputPrice,
        @NonNull BigDecimal videoInputPrice,
        @NonNull BigDecimal audioInputPerSecondPrice,
        @NonNull BigDecimal videoInputPerSecondPrice,
        @NonNull BiFunction<ModelPrice, Map<String, Integer>, BigDecimal> calculator) {
}
