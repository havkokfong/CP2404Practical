public class DemoPoems {

    public static void main(String[] args){
        Poem poem = new Poem("Hello", 50);
        Couplet couplet = new Couplet("World");
        Limerick limerick = new Limerick("New World");
        Haiku haiku = new Haiku("Three lines");
        display(poem);
        display(couplet);
        display(limerick);
        display(haiku);
    }

    private static void display(Poem poem) {
        System.out.println("Poem: " + poem.getPoemName() + "\nThe number of lines is: " + poem.getNumLine());
    }
}
