public class Main {

    public static void main(String[] args) {
        Product book = new Book(  // положили book (в ячейке Product лежит book)
                1,                 //передаем все параметры
                "Моя весна",
                200,
                "Александр Шубкин",
                1947
        );
        //джава разрешает использовать только те методы которые есть в Product или Book
        book.use(); //метод use есть и в book и в футболке, но так как у нас в ячейке Product лежит book он и выполнится
    }
}
