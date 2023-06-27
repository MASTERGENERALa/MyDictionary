package MyDictionary;

public class Main {
    public static void main(String[] args) {
        MyDictionary myDictionary = new MyDictionary();
        myDictionary.addPair("apple", "яблуко");
        myDictionary.addPair("cat", "кіт");

        String translation = myDictionary.getElementAt("apple");
        System.out.println("Переклад слова 'apple': " + translation);

        int count = myDictionary.getCount();
        System.out.println("Загальна кількість пар елементів: " + count);
    }
}
