public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(12000);
        System.out.println(book.isTooExpensive());
    }
}
