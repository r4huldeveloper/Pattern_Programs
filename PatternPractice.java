
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

    static void pattern4(int number){
         /*
         1
         12
         123
         1234
         12345
          */
         int count = 1;
         for(int row = 1; row <=number; row++){
             for (int col = 1; col <= row; col++){
                 System.out.print(col + " ");
             }
             System.out.println();

         }
    }

    static void pattern5(int number) {

         /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         *
          */
        for (int row = 1; row < 2 * number; row++) {
          int totalCol = (row > number) ? 2 * number - row : row;
          for (int j = 1 ; j <= totalCol; j++ ){
              System.out.print("* ");
           }
            System.out.println();
        }
    }

    static void pattern6(int number){
         /*
              *
            *   *
           *  *  *
         *  *  *   *
        *  *  *  *  *
         *  *   *  *
          *   *   *
            *   *
              *
          */

        for (int row = 1; row < 2 * number; row++){
            int totalColInRow = (row > number) ? 2 * number - row : row;

            int noOfSpaces = number - totalColInRow;
            for (int space = 1; space <= noOfSpaces; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int number){
         /*
               1
             2 1 2
           3 2 1 2 3
         4 3 2 1 2 3 4
       5 4 3 2 1 2 3 4 5

          */

        for (int row = 1; row <= number; row++){

            int totalSpaces = number-row;
            for (int space = 1; space <= totalSpaces; space++ ){
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--){
                System.out.print(col + " " );
            }
            for (int col = 2; col <=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

     }

     static void pattern8(int number) {
    /*
         1
         2 1 2
         3 2 1 2 3
         4 3 2 1 2 3 4
         3 2 1 2 3
         2 1 2
         1

     */
         for (int row = 1; row < 2 * number; row++) {

          int totalCol = (row > number) ? 2 * number - row : row ;

          int spaces = number - totalCol;
          for (int space = 1 ; space <= spaces; space++){
              System.out.print("  ");
          }
          for (int col = totalCol; col >= 1; col--){
              System.out.print(col+ " ");
          }
          for (int col = 2; col <= totalCol; col++){
              System.out.print(col + " ");
          }
             System.out.println();
         }
     }

     static void pattern9(int number){
         int n = 2 * number;
         int newNumber = number+1;
         for (int row = 1; row < n; row++){
             for (int col = 1; col < n; col++){

                 /* FOR MAKING THE PATTERN IN THE BELOW WAY WE WILL USE (atEachIndex2)
                 1 1 1 1 1 1 1
                 1 2 2 2 2 2 1
                 1 2 3 3 3 2 1
                 1 2 3 4 3 2 1
                 1 2 3 3 3 2 1
                 1 2 2 2 2 2 1
                 1 1 1 1 1 1 1
                 */

                 int atEachIndex1 = Math.min(Math.min(row , col) , Math.min(n-row , n-col));

                  /* FOR MAKING THE PATTERN IN THE BELOW WAY WE WILL USE (atEachIndex2)
                 4 4 4 4 4 4 4
                 4 3 3 3 3 3 4
                 4 3 2 2 2 3 4
                 4 3 2 1 2 3 4
                 4 3 2 2 2 3 4
                 4 3 3 3 3 3 4
                 4 4 4 4 4 4 4
                   */
                 int atEachIndex2 = newNumber - Math.min(Math.min(row , col) , Math.min(n-row , n-col));

                 System.out.print(atEachIndex2+" ");
             }
             System.out.println();
         }
     }
    public static void main(String[] args) {
    //    pattern1(5);
    //    pattern2(8);
    //    pattern3(5);
    //    pattern4(5);
    //    pattern5(4);
    //    pattern6(5);
    //    pattern7(4);
    //    pattern8(4);
    //    pattern9(4);
    }

}
