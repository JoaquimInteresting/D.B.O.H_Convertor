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
public class Decimal {
    
    private long num = 0;
    private String binario = "";
    private String octal = "";
    private String hexa = "";
    
    public void setvalor(long n){
        num = n;        
        long r1=0,q1=0,b=0;
        int c=1;
        long vet1[]=new long[100];        
        do{
           q1 = n/2;
           r1 = n%2;
           n = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }   
        
        String w = "";
        
          if(bin.length()==1){
             w = "000"; 
          }else if(bin.length()==2){
              w="00";
          }else if(bin.length()==3){
             w = "0"; 
          }       
            bin = w + bin;
        binario = bin;
        
         r1=0;q1=0;c=1;b=0;
         n = num;
         do{
           q1 = n/8;
           r1 = n%8;
           n = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String oct = "";        
        for(int d=c-1;d>=1;d--){
            oct+= vet1[d]+"";
        }        
        octal = oct;
        
        r1=0;q1=0;c=1;b=0;
         n = num;
         do{
           q1 = n/16;
           r1 = n%16;
           n = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String hex = "";        
        for(int d=c-1;d>=1;d--){
            String l = Long.toString(vet1[d]);
            int x = Integer.parseInt(l);
            switch(x){
                case 10:
                   hex+="A ";
                   break;
                case 11:
                   hex+="B ";
                   break;
                case 12:
                   hex+="C ";
                   break;
                case 13:
                   hex+="D ";
                   break;
                case 14:
                   hex+="E ";
                   break;
                case 15:
                   hex+="F ";
                   break;
                default :
                   hex+= vet1[d]+""; 
            }            
        }        
        hexa = hex;
    }
    
    public String getBinario(){
        return binario;
    }
    
    public String getOctal(){
        return octal;
    }
    
    public String getHexa(){
        return hexa;
    }
    
}
