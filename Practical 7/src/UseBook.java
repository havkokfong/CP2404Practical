public class UseBook {
    public static void main(String[] args){
        Fiction fiction = new Fiction("Java");
        NonFiction nonFiction = new NonFiction("Python");
        System.out.println("The fiction book title is: " + fiction.getTitle() + " with the price of $" + fiction.getPrice()
        + " and the non-fiction book title is: " + nonFiction.getTitle() + " with the price of $" + nonFiction.getPrice());
    }
}
