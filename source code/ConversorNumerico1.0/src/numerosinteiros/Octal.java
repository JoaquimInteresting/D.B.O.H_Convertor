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
public class Octal {
    protected int num = 0;
    protected long decimal = 0;
    protected String bin = "";
    protected String hexa = "";
    
    public void setValor(long n){
        String i = Long.toString(n);
        long y,t=0,u=0;
        for(int c = i.length()-1;c>=0;c--){
            y = Long.parseLong(Character.toString(i.charAt(c)));
            t+= (long) (y*Math.pow(8, u));
            u++;                        
        }
        
        decimal =t;
        
        n = decimal;
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
        String in = "";        
        for(int d=c-1;d>=1;d--){
            in+= vet1[d]+"";
        } 
        String w ="";
        if(in.length()==1){
             w = "00"; 
          }else if(in.length()==2){
              w="0";
          }       
            in = w + in;
        bin = in;
        
        r1=0;q1=0;c=1;b=0;
         n = decimal;
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
    
    public long getDecimal(){
        return decimal;
    }
    
    public String getBinario(){
        return bin;
    }
    
    public String getHexa(){
        return hexa;
    }
}
