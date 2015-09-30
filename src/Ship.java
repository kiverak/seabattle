public class Ship {
    private int decks;      //количество палуб корабля
    boolean[] deckState = new boolean[decks];   //статус палубы - жива или нет

    public int getDecks() {
        return decks;
    }

    public boolean[] getDeckState() {
        return deckState;
    }

    public void setDeckState(boolean[] deckState) {
        this.deckState = deckState;
    }

    public Ship(Point point, int decks) {
        this.decks = decks;
        for (int i = 0; i < deckState.length; i++){
            deckState[i] = true;
        }
    }
}
