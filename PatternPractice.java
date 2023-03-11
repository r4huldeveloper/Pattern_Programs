public class PatternPractice {

     static void pattern1(int number){
        /*

        ******
        ******
        ******
        ******

         */

        for(int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

     static void pattern2(int number){
        /*

        *
        **
        ***
        ****
        *****
        ******

         */

        for (int row = 1; row <= number; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int number) {
        /*

         ******
         *****
         ****
         ***
         **
         *

         */
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    

        // WE CAN DO ONE MORE THING TO SOLVE THIS PATTERN

        for (int row = 0 ; row <= number; row++){
            for (int col = 1 ; col <= number - row; col++){
                System.out.print("*");
            }
             System.out.println();
         }
    }

    public static void main(String[] args) {
    //    pattern1(5);
    //    pattern2(8);
          pattern3(5);
    }

}
