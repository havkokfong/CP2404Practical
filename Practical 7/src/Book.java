public abstract class Book {
    String title;
    double price;

    public Book(String book_title) {
        title = book_title;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public abstract void setPrice();
}
