package data;

public class Progression {
    private int correct;
    private int total;
    private int chapter[];
    private int chapterTests[];
    
    Progression(){
        this.correct = 0;
        this.total = 0;
        this.chapter = new int[10];
        this.chapterTests = new int[10];                
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct += correct;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total += total;
    }

    //returns the array
    public int[] getChapter() {
        return chapter;
    }

    //num is the chapter number
    public void setChapter(int num) {
        this.chapter[num] = 1;
    }

    //returns the array
    public int[] getChapterTests() {
        return chapterTests;
    }

    //num is the chapter number
    public void setChapterTests(int num) {
        this.chapterTests[num] = 1;
    }
    
    
    
    
    
}