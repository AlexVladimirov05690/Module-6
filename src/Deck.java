import java.util.Random;

public class Deck extends Card {
    int number = 52;
    Card [] deck = new Card[number];
    Random random = new Random();

    public void showCard(int i) {
        deck[i].show();
    }

    public void showDeck() {
        for(int i = 0; i < 52; i++) {
            showCard(i);
        }
    }

    public void fill() {
        int i = 0;
            for(int y = 2; y < 15; y++) {
                for(int x = 0; x < 4; x++) {
                    deck[i] = new Card(y,x);
                    i++;
                }
            }
    }

    public void mixed() {
        Card temp;
        for(int i = 0; i < deck.length; i++) {
            int tmp = random.nextInt(deck.length - 1);
            temp = deck[i];
            deck[i] = deck[tmp];
            deck[tmp] = temp;
        }
    }
}
