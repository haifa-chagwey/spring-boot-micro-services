package com.haifachagwey.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
