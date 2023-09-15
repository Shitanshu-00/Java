package day15;

class BookId {
    //INITIALISING SOME BOOKS WITHOUT BOOK ID
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
    public String getAuthorName(){
        return authName;
    }
    public void setAuthorName(String authName){
        this.authName= authName;
    }
    public String getSession(){
        return session;
    }
    public void setSession(String session){
        this.session=session;
    }
    BookId(String name, int bookId, String authName,String session){
        this.name=name;
        this.bookId=bookId;
        this.authName=authName;
        this.session=session;
    }
}
class BookRecord2 {
    void display(BookId book) {
        System.out.println("Name of Book =" + book.getName() + "\nID of Book =" + book.getBookId() + "\nAuthor name of Book =" + book.getAuthorName() + "\nSession of Book =" + book.getSession());
    }

    public static void main(String[] args) {
        BookId book1 = new BookId("Digital & Logics", 101, "O.P.", "2001");
        BookId book2 = new BookId("Operating System", 181, "M.N.", "2015");

        BookRecord2 obj = new BookRecord2();
        obj.display(book1);
        obj.display(book2);


    }
}