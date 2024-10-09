package io.github.wkktoria.designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The product.
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
class UserWebDto implements UserDto {
    private String name;
    private String address;
    private String age;
}
