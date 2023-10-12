package org.golfshop.entities;

import org.golfshop.Category;

import java.time.LocalDate;

public record ImmutableObjectProduct(
        int id,
        String name,
        double rating,
        double price,
        Category category,
        LocalDate createdDate,
        LocalDate lastmodified
) {
}
