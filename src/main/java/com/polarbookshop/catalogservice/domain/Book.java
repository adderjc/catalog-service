package com.polarbookshop.catalogservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record Book(
        @NotBlank(message = "The book ISBN  must be defined.")
        @Pattern(regexp = "^([0-9]{10}|[0-9]{13})$", message = "The ISBN format must be valid")
        String isbn,

        @NotBlank(message = "The title must be defined")
        String title,

        @NotBlank(message = "The author must be defined")
        String author,

        @Positive(message = "The price should be greater than zero.")
        Double price
) {
}
