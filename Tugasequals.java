/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasequals;

/**
 *
 * @author Fidha
 */
public class Tugasequals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Perbedaan Antara (==) Dengan Equals ");
        System.out.println("        ----");
        
        String st1 = "saya suka makan nasi goreng";
        String st2 = "saya suka makan nasi goreng";
        String st3 ="saya suka";
        String st4 =" makan";
        String st5=" nasi goreng";
        String st6 = st3 + st4 + st5;
        
        System.out.println("Pernyataan 1 adalah : " + st1);
        System.out.println("Pernyataan 2 adalah : " + st2);
        System.out.println("Pernyataan 3 adalah : " + st3);
        System.out.println("Pernyataan 4 adalah : " + st4);
        System.out.println("Pernyataan 5 adalah : " + st5);
        System.out.println("");
        System.out.println("Pernyataan 1 == Pertanyaan 2 : " + (st1==st2)) ;
        System.out.println("Pernyataan 6 == Pertanyaan 1 :" + (st6==st1));
        System.out.println("Pernyataan 6 == Pertanyaan 2 :"+ (st6==st2));
        System.out.println("Pernyataan 1 Equals Pernyataan 2 " + (st1.equals(st1)));
        System.out.println("Pernyataan 6 Equals Pernyataan 1 " + (st6.equals(st1)));
        System.out.println("Pernyataan 6 Equals Pernyataan 2 " + (st6.equals(st2)));
        
        
        
    }
    
}
