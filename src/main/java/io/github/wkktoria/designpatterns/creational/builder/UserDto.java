package io.github.wkktoria.designpatterns.creational.builder;

/**
 * An interface implemented by products such as {@link UserWebDto}.
 */
interface UserDto {
    String getName();
    String getAddress();
    String getAge();
}
