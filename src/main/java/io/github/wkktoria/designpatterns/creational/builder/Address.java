package io.github.wkktoria.designpatterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipCode;
    private String state;
}
