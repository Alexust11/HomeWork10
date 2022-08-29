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
}
