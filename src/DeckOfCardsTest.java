public class DeckOfCardsTest {

    public static void main(String[] args) {
        DeckOfCards myWhot = new DeckOfCards();
        myWhot.shuffle();

        for(int count = 1; count <= 52; count++){
            System.out.printf("%-19s", myWhot.dealCard());

            if(count % 5 ==0){
                System.out.println();
            }
        }
    }
}
