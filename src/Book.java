import java.util.Objects;

public class Book {
    private String title;
     private Author author;
    private int yearPublishing;

    public Book(String title, Author author, int yearPublishing) {
        this.title = title;
        this.author=author;
        this.yearPublishing = yearPublishing;


    }

    public String getTitle() {
        return title;
    }

    public  String toString() {
        return getTitle()+" "+getAuthor().getSurName()+" "+ getAuthor().getName()+" "+getYearPublishing();
    }
    public Author getAuthor() {

        return author;

    }

    public int getYearPublishing() {

        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearPublishing != book.yearPublishing) return false;
        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + yearPublishing;
        return result;
    }
}
