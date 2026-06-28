package oops;

public class Borrow_History extends Book implements Edition{
    public String[] borrowed_books = {"Gone girl","Animal Farm","Christopher Nibble"};
    boolean is_borrow=false;

    @Override
    void display_member_info(String member_name) {
        System.out.println("Member name:"+member_name);
        System.out.println("Title of the book:"+book_title);
        System.out.println("Author:"+author);
        System.out.println("Number of pages:"+pages);
    }

    @Override
    void display_info() {
        System.out.println("Books borrowed for the first time:");
    }
    public boolean is_borrowed(String book_title){
        for(int i=0;i<borrowed_books.length;i++){
            if(book_title.equalsIgnoreCase(borrowed_books[i])){
                is_borrow=true;
            }
        }
        return is_borrow;
    }

    @Override
   public void new_edition() {
        System.out.println("New edition available");
    }
}
