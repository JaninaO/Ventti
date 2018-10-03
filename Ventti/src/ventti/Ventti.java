
package ventti;

import java.util.Scanner;


public class Ventti {

  
    public static void main(String[] args) {
       
        int korttienNumerot = 21
                
                
                Scanner input = new Scanner(System.in);
                Scanner take = new Scanner (System.in);
                String aloitus = input.nextLine();
                
                
                System.out.println("Haluaisitko aloittaa pelin?"(kyllä/ei));
               
                //while (aloitus >0){
                
                    if (aloitus.equals(kyllä){
                        System.out.println("Pelaaja aloittaa, ole hyvä.");
                        
                    }
                    else (aloitus.equals(ei)){
                        
                        System.out.println("Emäntä aloittaa.");
                }   
                    int valittuNumero = 0
                            
                    valittuNumero = take.nextInt();
                    
                    if (valittuNumero >2){
                        valittuNumero =2;
                    }
                
                    else if (valittuNumero <1){
                        valittuNumero =1;
                    }
            int numValinta = numValinta - valittuNumero;
                    
                    if (numValinta <=0) {
                        System.out.println("Sinä voitit!");
                    }
                    else {
                        if ((numValinta - 2) % 3 == 0){
                            valittuNumero = 1
                                    
                    }     else {  
                            valittuNumero = 2;
                            System.out.println("Emäntä ottaa" + numValinta "ja lisää");
                            System.out.println("Kuinka monta korttia haluat ottaa (1 tai 2)");
                            valittuNumero = takeNextInt();
                            
                            if (valittuNumero >2){
                            valittuNumero = 2
                            }
                            else if (valittuNumero<1){
                            valittuNumero = 1;
                            
                            numValinta = numValinta -valittuNumero;
                            
                            if (numValinta <=0){
                                    System.out.println("Sinä hävivit.");
                            }
                                    
                            }
                           
                   
    
