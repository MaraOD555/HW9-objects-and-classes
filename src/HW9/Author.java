package HW9;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String surname;
    public int hashCode;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return " " + "firstName: " + " " + firstName + ", surname: " + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}
