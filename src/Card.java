public class Card {
    private int cost;
    private int suit;

    public Card(){

    }

    public Card(int cost, int suit) {
        this.cost = cost;
        this.suit = suit;
    }

    public void show() {
        if (cost > 1 & cost < 15 & suit >= 0 & suit < 4) {
            System.out.println(cost(cost) + suit(suit));
        } else System.out.println("Error! Сard denomination is not correct");
    }

    private String suit (int suit) {
        String result = switch (suit) {
            case 0 -> " Hearts";
            case 1 -> " Diamonds";
            case 2 -> " Clubs";
            case 3 -> " Spades";
            default -> " ";
        };
        return result;
    }

    private String cost (int cost) {
        String result = " ";
        Integer costInt = cost;
        if(cost < 11) {
            result = costInt.toString();
        } else {
            switch (cost){
                case 11: result = "Jack";
                break;
                case 12: result = "Lady";
                break;
                case 13: result = "King";
                break;
                case 14: result = "Ace";
                break;
            }
        }
        return result;
    }

}
