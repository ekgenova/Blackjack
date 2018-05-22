public class Blackjack {

    public int blackjack(int firstInt, int secondInt){

        /*Condition 1: Both values over 21. Return 0
        Condition 2: First number over 21, second below. Return second number.
        Condition 3: Second number over 21, first below. Return first number.
        Condition 4: Both numbers below 21. Evaluate difference and print closer value.
         */
        if (firstInt > 21 && secondInt > 21){
            return 0;
        } else if (firstInt > 21 && secondInt <= 21){
            return secondInt;
        } else if (firstInt <= 21 && secondInt > 21){
            return firstInt;
        } else {
            if (21 - firstInt < 21 - secondInt){
                return firstInt;
            } else {
                return secondInt;
            }
        }
    }
}
