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

    public Boolean equals(Book book) {
        if (this == book) {
            return true;
        } else {
            return false;
        }
    }

}
