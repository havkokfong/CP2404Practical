public class Fiction extends Book {

    Fiction(String book_title) {
        super(book_title);
        setPrice();
    }

    public void setPrice(){
        super.price = 24.99;
    }
}
