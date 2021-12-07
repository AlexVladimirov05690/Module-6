import java.util.Random;

public class Deck extends Card {
    int number = 52;
    Card [] deck = new Card[number];
    Card [] deckOut = new Card[number];
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

    public void pullOutRandom(){
        int number = random.nextInt(52);
        System.out.print(number + "\t");
        showCard(number);
    }

    public void pullOutRandomAll() {
        for (int i = 0; i < 53; i++) {
            pullOutRandom();
        }
    }
}
