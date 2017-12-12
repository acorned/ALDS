package recursive;

import java.util.ArrayList;

public class Task13 {
    public static int maxPileHeight(ArrayList<Box> pile) {
        return 0;
    }

    static class Box {
        int height;
        int width;
        int length;

        public Box(int height, int width, int length) {
            this.height = height;
            this.width = width;
            this.length = length;
        }
    }

    public static void main(String[] args) {

        ArrayList<Box> pile = new ArrayList<>();
        pile.add(new Box(1,2,3));
        pile.add(new Box(2,2,4));
        pile.add(new Box(1,5,7));
        pile.add(new Box(3,3,5));
        pile.add(new Box(1,7,1));

        System.out.println(maxPileHeight(pile));
    }
}
