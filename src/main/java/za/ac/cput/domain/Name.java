package za.ac.cput.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

/*@Entity
@Table(name = "Name")
public class Name implements Serializable {
    @EmbeddedId
    private NameId nameId;

    protected Name() {}

    public Name(Builder builder) {
        nameId = new NameId(builder.firstName, builder.middleName, builder.lastName);}

    public String getFirstName(){
        return nameId.getFirstName();
    }
    public String getMiddleName(){
        return nameId.getMiddleName();
    }
    public String getLastName(){
        return nameId.getLastName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public static class Builder{
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.firstName = name.nameId.getFirstName();
            this.middleName = name.nameId.getMiddleName();
            this.lastName = name.nameId.getLastName();
            return this;
        }

        public Name build(){return new Name(this);}
    }
}*/
