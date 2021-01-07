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
public class Verificar {
    
    public static String setDecimal(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número Binário (fraccionário):",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1") || l.equals("2") || l.equals("3") || l.equals("4") || l.equals("5") 
                       || l.equals("6") || l.equals("7") || l.equals("8") || l.equals("9")){
                   t=1;
               }else if(l.equals(".") || l.equals(",")){
                   JOptionPane.showMessageDialog(null,"<html>&nbsp;O número digitado não "
                           + " é um <br>número inteiro. Clique em <strong>OK</strong><br>e digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } else{
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está no <br>sistema Decimal. Clique em <strong>OK</strong><br>e digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               } 
              t=1; 
           }           
        }
        return h;
    }
    
    public static String setBinario(){       
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um numero Binário:",""
                   + "",JOptionPane.QUESTION_MESSAGE);           
           for(int c=0;c<h.length();c++){               
               String l =Character.toString(h.charAt(c)); 
               if(l.equals("0") || l.equals("1")){
                   t=1;
               } else if(l.equals(".") || l.equals(",")){
                   JOptionPane.showMessageDialog(null,"<html>&nbsp;O número digitado não "
                           + " é um <br>número inteiro. Clique em <strong>OK</strong><br>e digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
               }else{
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
                || l.equals("5") || l.equals("6") || l.equals("7")){
                   t = 1;
               }else if(l.equals(".") || l.equals(",")){
                   JOptionPane.showMessageDialog(null,"<html>&nbsp;O número digitado não "
                           + " é um <br>número inteiro. Clique em <strong>OK</strong><br>e digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
                   t=0;
                   break;
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
    
    public static String setHexa(){
        int t=0,u=0; 
        String h="",y="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um numero Hexadecimal:",""
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
               }else if(u==2){
                   JOptionPane.showMessageDialog(null,"<html>&nbsp;O número digitado não "
                           + " é um <br>número inteiro. Clique em <strong>OK</strong><br>e digite"
                           + " novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
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
            case ",":
                u=2;
                break;
            default: 
               u=1;     
            }
        return u;
    }
    
    public static String setBcdDec(){
        int t=0,y=0; 
        String h="";
        while(t==0){            
           h = JOptionPane.showInputDialog(null,"Digite um número BCD:",""
                   + "",JOptionPane.QUESTION_MESSAGE);
           if(h.length()%4!=0){
               JOptionPane.showMessageDialog(null,"<html>Um número em BCD possui apenas<br>"
                       + "0 e 1,e a quanidade de dígitos é sempre <br> multiplo de 4.O numero digitado "
                       + "não<br> possui todas essas características.<br>Clique em <strong>OK</strong>"
                       + " e digite novamente!</html>","ERRO!",JOptionPane.WARNING_MESSAGE);
               continue;
           }           
           for(int c=0;c<h.length();c++){
               y = Integer.parseInt(Character.toString(h.charAt(c)));
               if(y<0 || y>1){
                   JOptionPane.showMessageDialog(null,"<html>O número digitado não "
                           + "está em <br/>código BCD."
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
    
     public static void sobre(){
        JOptionPane.showMessageDialog(null, "<html>"
                + "<strong>Copyright [&copy;] 2018</strong>"
                + "<em><strong> , Joaquim Domingos António</strong>"
                + "</em><br><br>Estudante do curso de Engenharia "
                + "Electrônica <br>e Telecomunicações da "
                + "Universidade <br>Agostinho Neto (<strong>U.A.N</strong>).<br>"
                + "<br><strong>E-mail: interestingjack0@Gmail.com</strong>"
                + "<br></html>","Sobre...",JOptionPane.PLAIN_MESSAGE);
    } 
    
    
}
