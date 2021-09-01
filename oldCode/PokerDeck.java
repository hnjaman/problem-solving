package oldCode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PokerDeck {
    public static int k;
    public static int count = 1;
    public static Random rndm = new Random();
    public static ArrayList<Integer> arylst = new ArrayList<>();
    public static ArrayList<Integer> shuffledList = new ArrayList<>();
    public static ArrayList<Integer> h1 = new ArrayList<>();
    public static ArrayList<Integer> h2 = new ArrayList<>();
    public static ArrayList<Integer> h3 = new ArrayList<>();
    public static ArrayList<Integer> h4 = new ArrayList<>();
    public static ArrayList<Integer> h5 = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static ArrayList<Integer> Shuffle() {
        for (int i = 1; i <= 52; i++) {
            arylst.add(i);
        }
        System.out.println();
        System.out.println("All 52 cards");
        System.out.println(arylst);

        while (arylst.size() != 0) {
            k = rndm.nextInt(arylst.size());
            int l = arylst.get(k);
            shuffledList.add(l);
            arylst.remove(k);
        }
        System.out.println();
        System.out.println("All 52 cards after shuffle");
        System.out.println(shuffledList);
        return (shuffledList);
    }

    public static ArrayList<ArrayList<Integer>> deal(int hands) {
        Shuffle();
        if (hands == 2) {
            while (shuffledList.size() != 0) {
                if ((count - 1) % 2 == 0) {
                    h1.add(shuffledList.get(0));
                }
                if ((count - 2) % 2 == 0) {
                    h2.add(shuffledList.get(0));
                }
                ++count;
                shuffledList.remove(0);
            }
            result.add(h1);
            result.add(h2);
        }
        if (hands == 3) {
            shuffledList.remove(shuffledList.size() - 1);
            while (shuffledList.size() != 0) {
                if ((count - 1) % 3 == 0) {
                    h1.add(shuffledList.get(0));
                }
                if ((count - 2) % 3 == 0) {
                    h2.add(shuffledList.get(0));
                }
                if ((count - 3) % 3 == 0) {
                    h3.add(shuffledList.get(0));
                }
                ++count;
                shuffledList.remove(0);
            }
            result.add(h1);
            result.add(h2);
            result.add(h3);
        }
        if (hands == 4) {
            while (shuffledList.size() != 0) {
                if ((count - 1) % 4 == 0) {
                    h1.add(shuffledList.get(0));
                }
                if ((count - 2) % 4 == 0) {
                    h2.add(shuffledList.get(0));
                }
                if ((count - 3) % 4 == 0) {
                    h3.add(shuffledList.get(0));
                }
                if ((count - 4) % 4 == 0) {
                    h4.add(shuffledList.get(0));
                }
                ++count;
                shuffledList.remove(0);
            }
            result.add(h1);
            result.add(h2);
            result.add(h3);
            result.add(h4);
        }
        if (hands == 5) {
            shuffledList.remove(shuffledList.size() - 1);
            shuffledList.remove(shuffledList.size() - 2);
            while (shuffledList.size() != 0) {
                if ((count - 1) % 5 == 0) {
                    h1.add(shuffledList.get(0));
                }
                if ((count - 2) % 5 == 0) {
                    h2.add(shuffledList.get(0));
                }
                if ((count - 3) % 5 == 0) {
                    h3.add(shuffledList.get(0));
                }
                if ((count - 4) % 5 == 0) {
                    h4.add(shuffledList.get(0));
                }
                if ((count - 5) % 5 == 0) {
                    h5.add(shuffledList.get(0));
                }
                ++count;
                shuffledList.remove(0);
            }
            result.add(h1);
            result.add(h2);
            result.add(h3);
            result.add(h4);
            result.add(h5);
        }
        System.out.println();
        System.out.println("All 52 cards after dealing between " + hands + " players ( all element within [] represents a single players cards)");
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int players = input.nextInt();
        for (ArrayList<Integer> a : deal(players)) {
            System.out.println(a);
        }
    }
}