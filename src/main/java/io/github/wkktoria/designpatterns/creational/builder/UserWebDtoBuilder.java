package io.github.wkktoria.designpatterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * The concrete builder for {@link UserWebDto}.
 */
class UserWebDtoBuilder implements UserDtoBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto userDto;

    @Override
    public UserDtoBuilder withFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthday(final LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(final Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
        return this;
    }

    @Override
    public UserDto build() {
        this.userDto = new UserWebDto(firstName + " " + lastName, address, age);
        return userDto;
    }

    @Override
    public UserDto getUserDto() {
        return userDto;
    }
}
