package Oop.omar;

import java.util.Objects;

public class Publisher {

    int id;
    String PublisherName;

    public Publisher(int id, String publisherName) {
        this.id = id;
        PublisherName = publisherName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, PublisherName );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publisher other = (Publisher) obj;
        return id == other.id && Objects.equals(PublisherName, other.PublisherName);
    }

    @Override
    public String toString() {
        return "Publisher{" + "id=" + id + ", PublisherName=" + PublisherName + '}';
    }
}
