
public class Book {

    private String title = "Java Programming";
    private int pages = 200;
    
    public Book(String title, int pages){

        this.title = title;
        this.pages = pages;
    
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(){
        this.title = title;
    }

    public void setPages(){
        this.pages = pages;
    }

    @Override
    public String toString(){

        return "Book title: " + title + "\nTotal pages: " + pages + "\n\n------------- End of Line -------------";
    }

}
