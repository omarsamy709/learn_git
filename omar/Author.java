package Oop.omar;

import java.util.Objects;

public class Author {
    int id;
    String firstname;
    String lastname;

    public Author(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstname, id, lastname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Author other = (Author) obj;
        return Objects.equals(firstname, other.firstname) && id == other.id
                && Objects.equals(lastname, other.lastname);
    }
    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstname=" + firstname + '}';
    }
}
