
public class Book {

    String title;
    int pages;
    
    public Book(String title, int pages){
    
        this.title = "Java Programming";
        this.pages = 200;

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

    public String toString(){

        return "Book title: " + title + "\nTotal pages: " + pages + "\n\n------------- End of Line -------------";
    }

}
