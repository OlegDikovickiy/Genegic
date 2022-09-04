public class Main {
  public static void main(String[] args) {
    MagicBox<String> magicBox = new MagicBox<>(3);
    magicBox.add("Элемент 1");
    magicBox.add("Элемент 2");
    magicBox.add("Элемент 3");
    magicBox.add("Элемент 4");

    String pick = magicBox.pick();
    System.out.println("Рандомное значение: " + pick);


    MagicBox<Character> magicBox2 = new MagicBox<>(2);
    magicBox2.add('!');

    Character pick2 = magicBox2.pick();
    System.out.println(pick2);

  }
}
