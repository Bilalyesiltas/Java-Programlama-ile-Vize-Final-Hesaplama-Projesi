
package vizefinalhesaplama;

import java.util.Scanner;


public class VizeFinalHesaplama {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        System.out.print("VİZE1: ");
        int vize1= scanner.nextInt();
        System.out.print("VİZE2: ");
        int vize2= scanner.nextInt();
        System.out.print("FİNAL: ");
        int finalnot= scanner.nextInt();
        System.out.print("OKUL ORTALAMANIZ: ");

        
        double ortalama =scanner.nextDouble();
        
        double toplamnot = (vize1* 3/10.0)+ (vize2* 3/10.0) + (finalnot* 4/10.0); 
        
        if (toplamnot >=90 ) {
            
            System.out.println("AA Aldınız..");
        }
        else if (toplamnot >=85 ){
            
            System.out.println("AB Aldınız..");
        }   
        else if (toplamnot >=80 ){
            
            System.out.println("BB Aldınız..");
        }  
         else if (toplamnot >=75 ){
            
            System.out.println("CB Aldınız..");
        }
         else if (toplamnot >=70 ){
            
            System.out.println("CC Aldınız..");
        }
         else if (toplamnot >=65 ){
            
            System.out.println("DC Aldınız..");
        }
         else if (toplamnot >=60 ){
            
            System.out.println("DD Aldınız..");
            
            if (ortalama < 2.50)
                System.out.println("DD ALDINIZ VE NOT ORTALAMANIZ DÜŞÜK. NOT ORTALAMANIZI YÜKSELTMEK İÇİN BU DERSİ TEKRARDAN ALMAYI DÜŞÜNEBİLİRSİNİZ...");
        }
         else if (toplamnot >=55 ){
            
            System.out.println("FD Aldınız ve kaldınız..");
        }
         else{
             System.out.println("FF Aldınız ve Kaldınız...");
        }
    }        
    
    
}
