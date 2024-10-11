package io.github.wkktoria.designpatterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Entity class used to construct the DTO.
 *
 * @see <a href="https://stackoverflow.com/questions/1051182/what-is-a-data-transfer-object-dto"></a>
 */
@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
}
