/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosinteiros;

/**
 *
 * @author INTERESTING
 */
public class Hexa {
    protected long num = 0;
    protected long decimal = 0;
    protected String octal = "";
    protected String bin = "";
    
    public void setValor(String n){        
        long y,t=0,u=0;
        char p; 
        for(int c = n.length()-1;c>=0;c--){
             p = n.charAt(c);
            switch(p){
                case 'A':
                   y = 10;
                   break;
                case 'a':
                   y = 10;
                   break;
                case 'B':
                   y = 11;
                   break;
                case 'b':
                   y = 11;
                   break;   
                case 'C':
                   y = 12;
                   break;
                case 'c':
                   y = 12;
                   break;
                case 'D':
                   y = 13;
                   break;   
                case 'd':
                   y = 13;
                   break;
                case 'E':
                   y = 14;
                   break; 
                case 'e':
                   y = 14;
                   break;
                case 'F':
                   y = 15;
                   break;   
                case 'f':
                   y = 15;
                   break;
                default :
                   y = Long.parseLong(Character.toString(p)); 
            }    
            t+= (long) (y*Math.pow(16, u));
            u++;                        
        }        
        decimal =t;
        
        long r1=0,q1=0,b=0;
        int c=1;
        long vet1[]=new long[100]; 
        long v = decimal;
        do{
           q1 = v/2;
           r1 = v%2;
           v = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String in = "";        
        for(int d=c-1;d>=1;d--){
            in+= vet1[d]+"";
        }  
        
        String w = "";
        
          if(in.length()==1){
             w = "000"; 
          }else if(in.length()==2){
              w="00";
          }else if(in.length()==3){
             w = "0"; 
          }       
            in = w + in;        
         bin = in;
        
         r1=0;q1=0;c=1;b=0;
         v = decimal;
         do{
           q1 = v/8;
           r1 = v%8;
           v = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String oct = "";        
        for(int d=c-1;d>=1;d--){
            oct+= vet1[d]+"";
        }        
        octal = oct;
    }
    
    public long getDecimal(){
        return decimal;
    }
    
    public String getOctal(){
        return octal;
    }
    
    public String getBinario(){
        return bin;
    }
}
