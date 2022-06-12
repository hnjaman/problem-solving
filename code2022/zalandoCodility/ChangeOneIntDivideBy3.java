package code2022.zalandoCodility;

/**
 * 23
 * 03 33 63 93 21 24 27 -> 7
 */
public class ChangeOneIntDivideBy3 {
        public static int findCount(String S) {
            int sum = 0;
            for (int i = 0; i < S.length(); ++i) {
                sum += S.charAt(i) - 48;
            }

            int count = 0;

            if(sum % 3 == 0)
                ++count;

            for (int i = 0; i < S.length(); ++i) {
                int remainingSum = sum - (S.charAt(i) - 48);

                for (int j = 0; j <= 9; ++j) {
                    if ((remainingSum + j) % 3 == 0 && j != S.charAt(i) - 48) {
//                        System.out.println(remainingSum+j);
                        ++count;
                    }
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String number = "23";
            System.out.println(findCount(number));
        }

}
