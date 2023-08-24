package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Nationality {
    @Id
    private String country;
    private String description;

    protected Nationality() {}

    public Nationality(Builder builder){
        this.country = builder.country;
        this.description = builder.description;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nationality that = (Nationality) o;
        return Objects.equals(country, that.country) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, description);
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "country='" + country + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String country;
        private String description;

        public void setCountry(String country) {
            this.country = country;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Builder copy(final Nationality nationality) {
            this.country = nationality.country;
            this.description= nationality.description;
            return this;
        }

        public Nationality build() {
            return new Nationality(this);
        }
    }
}

