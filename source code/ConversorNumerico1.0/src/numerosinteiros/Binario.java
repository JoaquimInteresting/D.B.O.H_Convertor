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
public class Binario {
    protected int num = 0;
    protected long decimal = 0;
    protected String octal = "";
    protected String hexa = "";
    
    public void setValor(String n){
        long y,t=0,u=0;
        for(int c = n.length()-1;c>=0;c--){
            y = Long.parseLong(Character.toString(n.charAt(c)));
            t+= (long) (y*Math.pow(2, u));
            u++;                        
        }
        
        decimal =t;
        
        long r1=0,q1=0,b=0;
        int c=1;
        long vet1[]=new long[100];
        r1=0;q1=0;c=1;b=0;
         t = decimal;
         do{
           q1 = t/8;
           r1 = t%8;
           t = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String oct = "";        
        for(int d=c-1;d>=1;d--){
            oct+= vet1[d]+"";
        }        
        octal = oct;
        
        r1=0;q1=0;c=1;b=0;
         t = decimal;
         do{
           q1 = t/16;
           r1 = t%16;
           t = q1;
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
    
    public String getOctal(){
        return octal;
    }
    
    public String getHxa(){
        return hexa;
    }
}
