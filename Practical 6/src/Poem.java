public class Poem {
    private String poemName;
    private int numLine;

    public Poem(String name, int num) {
        poemName = name;
        numLine = num;
    }

    public String getPoemName(){
        return poemName;
    }

    public int getNumLine(){
        return numLine;
    }
}
