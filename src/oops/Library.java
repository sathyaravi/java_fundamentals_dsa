package oops;

public class Library {

    public static void main(String[] args) {
        Borrow_History bObj = new Borrow_History();
        Book b = new Borrow_History();
        b.display_member_info("John");
        bObj.book_title="Animal Farm";
        bObj.author="Oscar Wilde";
        bObj.pages=100;
        bObj.member_name="John Doe";

        bObj.display_member_info(bObj.member_name);
        bObj.display_info();
        bObj.new_edition();
        System.out.println(bObj.is_borrowed(bObj.book_title));

    }
}
