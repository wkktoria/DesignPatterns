package io.github.wkktoria.designpatterns.creational.builder;

import java.time.LocalDate;

/**
 * The abstract builder.
 */
interface UserDtoBuilder {
    // Methods to build parts of product at a time:
    UserDtoBuilder withFirstName(final String firstName);
    UserDtoBuilder withLastName(final String lastName);
    UserDtoBuilder withBirthday(final LocalDate birthday);
    UserDtoBuilder withAddress(final Address address);

    /**
     * Method to assemble the final product.
     * @return final product
     */
    UserDto build();

    /**
     * Method to fetch already built object. It is optional.
     * @return built object
     */
    UserDto getUserDto();
}
