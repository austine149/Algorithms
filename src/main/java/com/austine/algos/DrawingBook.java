package com.austine.algos;

public class DrawingBook {
    /**
     * A teacher asks the class to open their books to a page number.
     * A student can either start turning pages from the front of the book or from the back of the book.
     * They always turn pages one at a time. When they open the book, page  is always on the right side:
     * When they flip page , they see pages  and . Each page except the last page will always be printed on both sides.
     * The last page may only be printed on the front, given the length of the book.
     * If the book is  pages long, and a student wants to turn to page , what is the minimum number of pages to turn?
     * They can start at the beginning or the end of the book.
     *
     * Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page .
     * @param args
     */

    public static int pageCount(int n, int p) {
        int j=1;
        int flips=-10;
        if (n-p == 1) return 0;
        if (p < n/2) {
        for (int i=0; i<n; i++){
            if (p == i){
               flips=i/2;
            }
        }
        }
        else {

            for (int i = n; i >= 0; i--) {
                if (p == i) {
                    flips = i / 2;
                }
            }
        }
        return flips;
    }
    public static void main(String[] args) {
        System.out.println(pageCount(37455, 29835));
    }
}
