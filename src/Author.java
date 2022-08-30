import java.util.Objects;

public class Author {
    private String surName;
    private String name;

    public Author(String surName,String name) {
        this.surName=surName;
        this.name=name;
    }

    public String getSurName() {
        return surName;
    }
    public String toString() {
        return getSurName()+" "+getName();
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surName.equals(author.surName) && name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name);
    }
    //

}
