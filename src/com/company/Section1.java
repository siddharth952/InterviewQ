package com.company;

public class Section1 {

    public static void pattern5(){
        /*
                * * * * *
                  * * * *
                    * * *
                      * *
                      nsp = spaces
                      nst = stars
                      *
                      * logic - nsp++
                      *         nst--
         */

        int n = 5;

        int nsp = 0;
        int nst = n;
        int row = 0;

            while(row < n){
                // Spaces
                int csp = 0;

                while(csp < nsp){
                    System.out.print(" ");
                csp++;

                }

                int cst = 0;
                while(cst < nst ){
                    System.out.print("*");
                    cst++;
                }
                    System.out.print("\n");
                // update
                nsp++;
                nst--;
                row++;

            }

    }

    public static void pattern6(){

        /*
         * * * * *
             * * * *
                 * * *
                     * *
                         *
         */

        int n = 5;
        int nsp = 1;
        int nst = n;

        int row = 1;

        while(row<=n){

            int csp = 1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.print("\n");

            nsp = nsp*2;
            nst--;
            row++;


        }

    }


}
