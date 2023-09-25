//создадим общие характеристики товаров книги и футболки
public class Product {
      protected int id; //создадим поля для кажого продукта
      protected String name;
      protected int price;

      public boolean isTooExpensive() {
            if (price > 1_000_000) {
                  return true;
            } else {
                  return false;
            }
      }

      public int getId() {
            return id;
      }

      public void setId(int id) {
            this.id = id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public int getPrice() {
            return price;
      }

      public void setPrice(int price) {
            this.price = price;
      }
}
