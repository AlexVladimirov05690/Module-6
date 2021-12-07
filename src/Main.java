public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();   //создание колоды
        deck.fill();              //заполнение колоды картами
        deck.showDeck();          //вывод содержимого колоды
        deck.mixed();             //тасовка колоды
        deck.showDeck();          //вывод содержимого тасованной колоды
    }
}
