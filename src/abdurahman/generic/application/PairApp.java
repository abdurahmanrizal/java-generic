package abdurahman.generic.application;

import abdurahman.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Boolean> pair = new Pair<String, Boolean>("Rahman",true);

        String stringPair = pair.getFirst();
        Boolean booleanPair = pair.getSecond();

        System.out.println(stringPair);
        System.out.println(booleanPair);

    }
}
