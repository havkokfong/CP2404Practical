public class NonFiction extends Book {

    public NonFiction(String book_title){
        super(book_title);
        setPrice();
    }

    public void setPrice(){
        super.price = 37.99;
    }
}
