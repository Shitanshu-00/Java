package day15;

class Book {
    String name, authName, session;
    int bookId;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getBookId(){
        return bookId;
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public String getAuthName(){
        return authName;
    }
    public void setAuthName(String authName){
        this.authName=authName;
    }
    public String getSession(){
        return session;
    }
    public void setSession(String session){
        this.session= session;
    }
    Book(String name, int bookId, String authName,String session){
        this.name=name;
        this.bookId=bookId;
        this.authName=authName;
        this.session=session;
    }
}
class BookRecord{
    private void details(Book book){
        System.out.println("Name of Book ="+book.getName()+"\nID of Book ="+book.getBookId()+"\nAuthor name of Book ="+book.getAuthName()+"\nSession of Book ="+book.getSession());
    }

    public static void main(String[] args) {
        Book book1= new Book("Digital & Logics",101,"O.P.","2000");
        Book book2= new Book("Operating System",181,"M.N.","2014");

        BookRecord bookRecord= new BookRecord();
        bookRecord.details(book1);
        bookRecord.details(book2);
    }
}
