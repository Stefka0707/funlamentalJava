package artikcles;

public class Article {
    // полета - > характеристики
    private String title;
    private String content;
    private String author;

    // конструктор-> създава нови обекти
    // alt + insert == конструктор


    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //методи -> поведение
    public void edit(String newContent){
        // съдържанието да се промени
        this.content = newContent;

    }
    public void changeAuthor(String newAuthor){
        this.author=newAuthor;
    }
    public void rename(String newTitle){
        this.title=newTitle;
    }
    public String toString(){
        return this.title + " - "+ this.content + ": "+this.author;
    }
}
