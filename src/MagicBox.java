import java.util.Random;

public class MagicBox<T> {

  protected T[] items;

  public MagicBox(int itemsLength) {
    this.items = (T[]) new Object[itemsLength];
  }

  Random random = new Random();

  public boolean add(T item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        System.out.println("Элемент: " + item + " - добавлен!");
        return true;
      }
    }
    System.out.println("Нет места, элемент: " + item + " - не добавлен!");
    return false;
  }

  public T pick() {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        throw new RuntimeException("В коробке еще есть место, можно добавить: " + (items.length - i) + " элементов");
      }
    }
    int randomInt = random.nextInt(items.length - 1);
    return items[randomInt];
  }
}
