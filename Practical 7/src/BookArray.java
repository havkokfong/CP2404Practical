public class BookArray {
    public static void main(String[] args){
        String[] NonFicBookList = {"Java", "Python", "C++", "#C", "Swift"};
        String[] ficBookList = {"The Ghost", "Crazy Love", "Lost In SG", "Never forget", "Goodbye"};
        int index = 1;
        try {
            for (int i = 0; i <= NonFicBookList.length; ++i) {

                Fiction fiction = new Fiction(NonFicBookList[i]);
                System.out.println(index + ". The book title is: " + fiction.getTitle() + " and the price is: $" +
                        fiction.getPrice() + ".");
                ++index;
            }
        }catch (Exception e){}
        try {
            for (int j = 0; j <= ficBookList.length; ++j) {

                NonFiction nonFiction = new NonFiction(ficBookList[j]);
                System.out.println(index + ". The book title is: " + nonFiction.getTitle() + " and the price is: $" +
                        nonFiction.getPrice() + ".");
                index += 1;

            }
        }catch (Exception e){}
    }
}
