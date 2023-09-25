public class Main {

    public static void main(String[] args) {
        Book book = new Book(  //передаем все параметры
                1,
                "Моя весна",
                200,
                "Александр Шубкин",
                1947
        );
        book.setPrice(12000);
        System.out.println(book.isTooExpensive());
    }
}
