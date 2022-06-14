package HW9;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Jane", "Austen");
        Book book1 = new Book("Emma", 1994, author1);
        Author author2 = new Author("H. Rider", "Haggard");
        Book book2 = new Book("King Solomon's mines", 2004, author2);

        System.out.println(book1.getBookName()+", "+book1.getPublishingYear()+", "+book1.getAuthor().getFirstName()+" "+book1.getAuthor().getSurname());
        System.out.println(book2.getBookName()+", "+book2.getPublishingYear()+", "+book2.getAuthor().getFirstName()+" "+book2.getAuthor().getSurname());

        book1.setPublishingYear(2009);
        System.out.println("New date of a publishing year is " + book1.getPublishingYear());

    }

}
