/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp2;






/**
 *
 * @author jamesostmann
 */
public class Main {
    
    public static void main(String[] args) {
      
        GUI window;
        
        
      if(args.length > 0) {
          
          window = new GUI(args[0]);
          
      } else {
          
          window = new GUI(null);
      }
      
       }
        
        
      
      
        
    }
    

