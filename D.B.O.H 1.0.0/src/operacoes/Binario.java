/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author INTERESTING
 */
public class Binario {
    
    //Procedimento que verifica se o primeiro numero binário foi inserido correctamente
    public static String setBinario(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite o primeiro número Binário:",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals(".")){
                   t=1;
               } else{
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não<br>"
                           + "está em código Binário.<br>"
                           + "Clique em <strong>OK</strong> e digite<br>"
                           + "novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } 
              t=1; 
           }           
        }
        return h;
    }
    
    //Procedimento que verifica se o segundo numero binário foi inserido correctamente
    public static String setBinario2(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite o segundo número Binário:",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals(".")){
                   t=1;
               } else{
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não<br>"
                           + "está em código Binário.<br>"
                           + "Clique em <strong>OK</strong> e digite<br>"
                           + "novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } 
              t=1; 
           }           
        }
        return h;
    }
    
    //Função que soma dois numeros binários  
    public static String Somar(String n,String m){
      long r = 0;
        for(int j = 0;j<=1;j++){
            if(j==1){
                n=m;
            }
                int y,t=0,u=0;
            for(int c = n.length()-1;c>=0;c--){
               y = Integer.parseInt(Character.toString(n.charAt(c)));
               t+= (int) (y*Math.pow(2, u));
               u++;                        
            }
           r+=t; 
        }
        
        long r1=0,q1=0,b=0;
        int c=1;
        long vet1[]=new long[100];        
        do{
           q1 = r/2;
           r1 = r%2;
           r = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }
                
       return bin;        
    }
    
    //Função que subtrai dois numeros binários
    public static String Subtrair(String n, String m){
       long as = Long.parseLong(n);
       long ad = Long.parseLong(m),r=0;;        
       long re = (as>ad)?1:0;
       
       if(re==1){
            for(int j = 0;j<=1;j++){
                if(j==1){
                   n=m;
                }
                int y,t=0,u=0;
                  for(int c = n.length()-1;c>=0;c--){
                    y = Integer.parseInt(Character.toString(n.charAt(c)));
                    t+= (int) (y*Math.pow(2, u));
                    u++;                        
                }
                  if(j==1){
                      r-=t; 
                  }else{
                      r+=t;
                  }                 
           }
       } else {
           for(int j = 0;j<=1;j++){
                if(j==1){
                   m=n;
                }
                int y,t=0,u=0;
                  for(int c = m.length()-1;c>=0;c--){
                    y = Integer.parseInt(Character.toString(m.charAt(c)));
                    t+= (int) (y*Math.pow(2, u));
                    u++;                        
                }
                  if(j==1){
                      r-=t; 
                  }else{
                      r+=t;
                  }                 
           }            
       }
       
       long r1=0,q1=0,b=0;
       int c=1;
        long vet1[]=new long[100];        
        do{
           q1 = r/2;
           r1 = r%2;
           r = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin = ""; 
            bin = (as>ad)?"":"[1] ";
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }
        bin += (as>ad)?"":"<html><br/><br/>O primeiro dígito <strong>[1]</strong> indica o sinal <br>"
                        + "negativo.O resto é o resultado.<br></html> ";
        
        return bin;
    }
    
    //Multiplicacar dois numeros binarios
    public static String Multiplicar(String n,String m){
      long r = 1;
        for(int j = 0;j<=1;j++){
            if(j==1){
                n=m;
            }
                long y,t=0,u=0;
            for(int c = n.length()-1;c>=0;c--){
               y = Long.parseLong(Character.toString(n.charAt(c)));
               t+= (int) (y*Math.pow(2, u));
               u++;                        
            }
           r*=t; 
        }
        
        long r1=0,q1=0,b=0;
        int c=1;
        long vet1[]=new long[100];        
        do{
           q1 = r/2;
           r1 = r%2;
           r = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }
         
       return bin;        
    }
    
    //Dividir dois numeros binarios
    public static String Dividir(String n,String m){
      double r = 0;
         for(int j = 0;j<=1;j++){
                if(j==1){
                   n=m;
                }
                int y,u=0;
                long t=0;
                  for(int c = n.length()-1;c>=0;c--){
                    y = Integer.parseInt(Character.toString(n.charAt(c)));
                    t+= (int) (y*Math.pow(2, u));
                    u++;                        
                }
                  if(j==1){
                      r/=t; 
                  }else{
                      r=t;
                  }                 
           }
          
         DecimalFormat df = new DecimalFormat("#,###.000"); 
         String dfs = (df.format(r)).toString();
         r = Double.parseDouble(dfs.replace(",","."));
          long i= (long) r;
          double d = r - i; 
          
          long r1=0,q1=0,b=0;
          int c=1;
        long vet1[]=new long[100];        
        do{
           q1 = i/2;
           r1 = i%2;
           i = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin1 = "";        
        for(int f=c-1;f>=1;f--){
            bin1+= vet1[f]+"";
        }
        
        double r2 = d,t=0,h=0;
        int ir = 0;
        String bin2 ="";
        while(t!=1){
          if(h<4){ 
            t = r2*2;
            String y = Double.toString(t);
            String u = Character.toString(y.charAt(0));
            ir = Integer.parseInt(u);
            r2 = t - ir;
            bin2+=ir;
            h++;
          }else {
             break;
          }       
           
       }
         
          String bin ="";  
          bin=bin1+","+bin2;
       return bin;        
    }
}
