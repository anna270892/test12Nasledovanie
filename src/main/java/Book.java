//книги
public class Book extends Product {
    private String author; //создадим поля относящиеся только к книгам
    private int pages;  //количество страниц
    private int publushedYear; //год выпуска


    //Конструктор для передачи аргументов для конструктора в Product
    public Book(int id, String name, int price, String author, int pages) {
        super(id, name, price); //аргументы для конструктора в Product
        this.author = author;
        this.pages = pages;
        this.publushedYear = publushedYear;
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return false;
        }

    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublushedYear(int publushedYear) {
        this.publushedYear = publushedYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getPublushedYear() {
        return publushedYear;
    }

}
