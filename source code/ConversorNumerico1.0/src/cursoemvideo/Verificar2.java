/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERESTING
 */

//Metodo para a verificar o número fracicionário(decimal) incerido
public class Verificar2 {
    
    //Atributos da classe armazenar as partes do n[umero decimal
    private long a;
    private double b;
    
    public static String setDecimal(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número Binário (fraccionário):",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals(".") || l.equals("2") || l.equals("3") || l.equals("4") || l.equals("5") 
                       || l.equals("6") || l.equals("7") || l.equals("8") || l.equals("9")){
                   t=1;
               } else{
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está em <br/>Decimal. Clique em <strong>OK</strong> e digite<br/>"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } 
              t=1; 
           }           
        }
        return h;
    }
    
    //Metodo para contar a quantidade de casas decimais antes e depois da virgula do número decimal informado
    public void contar(String u){
        
        //Contagem de quantidade de números antes e depois da virgula
        String m = u,y="";
        int t =0,g=0;
        double r =0;
        String a="",d="0.";
        for(int i = 0;i<m.length();i++){
            y = Character.toString(m.charAt(i));
            if(y.equals(".")){
                t=1;
                continue;
            }
            
            if(t==0){
               a+=y; 
            }else{
               d+=y; 
            }         
        }
        
        this.a = Long.parseLong(a);
        this.b = Double.parseDouble(d);
    } 

    //Metodos para retonar os valoeres dos atributos desta clasee 
    public long getParteInt(){
        return a;
    }
    
    public double getParteRea(){
        return b;
    }
    
    //Método para verificar o número Binário fracionário incerido
    public static String setBinario(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número Binário (fraccionário):",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals(".")){
                   t=1;
               } else{
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está em <br/>código Binário. Clique em <strong>OK</strong> e <br/>digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } 
              t=1; 
           }           
        }
        return h;
    }
    
    //Método para verificar o número Octal fracionário incerido
    public static String setOctal(){
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número Octal (fraccionário):",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals("2")|| l.equals("3") || l.equals("4")
                || l.equals("5") || l.equals("6") || l.equals("7")|| l.equals(".")){
                   t = 1;
               }else{               
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está <br/>em Octal. "
                           + "Clique em <strong>OK</strong> e <br/>digite "
                           + "novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               }  
              t=1; 
           }           
        }
        return h;
    }
    
    //Método para verificar o número Hexadeccimal fracionário incerido
    public static String setHexa(){
        int t=0,u=0; 
        String h="",y="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número Hexadecimal (fraccionário):",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){
               y = Character.toString(h.charAt(c));
               u = selecinar(y);
               if(u==1){
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está em <br/>Hexadecimal. "
                           + "Clique em <strong>OK</strong> e <br/>digite "
                           + "novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               }
               t=1;                 
           }                    
        }
        return h;
    }
   
    //Método para selecionar os caracteres do código hexadecimal
    
    public static int selecinar(String y){
        int u;
        
        switch(y){
            case "0":
                u=0;
                break;
            case "1":
                u=0;
                break;
            case "2":
                u=0;
                break; 
            case "3":
                u=0;
                break; 
            case "4":
                u=0;
                break;
            case "5":
                u=0;
                break;
            case "6":
                u=0;
                break;
            case "7":
                u=0;
                break;
            case "8":
                u=0;
                break;
            case "9":
                u=0;
                break; 
            case "A":
                u=0;
                break;
            case "B":
                u=0;
                break;
            case "C":
                u=0;
                break; 
            case "D":
                u=0;
                break;
            case "E":
                u=0;
                break;
            case "F":
                u=0;
                break;
            case "a":
                u=0;
                break;
            case "b":
                u=0;
                break;
            case "c":
                u=0;
                break;
            case "d":
                u=0;
                break;
            case "e":
                u=0;
                break;
            case "f":
                u=0;
                break;
            case ".":
                u=0;
                break;
            default: 
               u=1;     
            }
        return u;
    }
    
    //Método para verificar o código BCD incerido
    public static String setBcdDec(){
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número BCD:",""
                   + "",JOptionPane.QUESTION_MESSAGE);
           if(h.length()%4!=0){
               JOptionPane.showMessageDialog(null,"<html>Um número em BCD possui apenas<br>"
                       + "0 e 1,e a quanidade de dígitos é sempre<br> multiplo de 4.O numero digitado<br>"
                       + "não possui todas essas características.<br>Clique em <strong>OK</strong>"
                       + " e digite novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
               continue;
           }           
           for(int c=0;c<h.length();c++){
               y = Integer.parseInt(Character.toString(h.charAt(c)));
               if(y<0 || y>1){
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não<br>"
                           + "está em código BCD.<br>"
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
}
