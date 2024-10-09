package io.github.wkktoria.designpatterns.creational.builder;

import java.time.LocalDate;

/**
 * The client which works also as a director.
 */
class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder builder = new UserWebDtoBuilder();

        UserDto dto = directBuild(builder, user);
        System.out.println(dto);
    }

    /**
     * Servers the role of director which construct desired product.
     * @param builder the concrete builder
     * @param user the user entity to build product from
     * @return the final product
     */
    private static UserDto directBuild(UserDtoBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    /**
     * Helper method which returns a sample user.
     * @return sample user
     */
    private static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1987, 12, 1));

        Address address = new Address();
        address.setHouseNumber("13");
        address.setStreet("Main Street");
        address.setCity("New York");
        address.setState("NY");
        address.setZipCode("10001");

        user.setAddress(address);

        return user;
    }
}
