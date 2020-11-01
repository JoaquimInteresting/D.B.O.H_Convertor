/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosfraccionarios;

import java.text.DecimalFormat;

/**
 *
 * @author INTERESTING
 */
public class BinarioFraq {
    
    //atributos privados da classe BinarioFraq
    private int num;
    private String decimal;
    private String octal;
    private String hexa;
    private String a;
    private String b;
    
    //Metodo para separar a parte inteira da parte fraccionaria
    public void separar(String u){
        
        //Contagem de quantidade de números antes e depois da virgula
        String m = u,y="";
        int t =0,g=0;
        double r =0;
        String a="",d="";
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
        
        this.a = a;
        this.b = d;
    }
    //Metodo para a converção de binario para decimal(fraqcionario)
    public void setDecimal() {
        
        //Contar os números antes da virgula
        
        String m = this.a;
        String n = this.b;
        
        
        //Conversão da parte inteira do numero binário informado
        int e = 0,g=0; 
        long r1 = 0;
        for(int i =m.length()-1;i>=0;i--){
            g = Integer.parseInt(Character.toString(m.charAt(i)));
            r1+=(Math.pow(2,e)*g);
            e++;
        }
        
        //convers'ao da parte fraccionária do número binário informado
        
        e=-1;
        double r2 = 0;
        for(int i =0;i<n.length()-1;i++){
            g = Integer.parseInt(Character.toString(n.charAt(i)));
            r2+=(Math.pow(2,e)*g); 
            e--;
        } 
        
        decimal +=Long.toString(r1)+""+Double.toString(r2);        
    }
    
    //Metodo experimental
    public String mostra(){
        return this.a;
    } 
    
    public String mestre(){
        return this.b;
    }
    
    //Metodo que retorna a conversão em decimal(fraqcionario)
    public String getDecimal() {
        return decimal;
    }
    
    //Metodo para a converção de binario para octal(fraqcionario)
    public void setOctal(double o,String l) {
        
        //Quantidade de numeros depois da virgula
        int v = contar(l,1);
        
        //SEparção da parte interia e a fraccionária
        int n = (int) o;
        double m = o -n; 
        
        //Conversão da parte inteira
        int r1=0,q1=0,c=1;
        int vet1[]=new int[100];        
        do{
           q1 = n/8;
           r1 = n%8;
           n = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1); 
        
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }     
        
        //Conversão da parte fraccionaria
        double r = m,t=0,c1=0;
        int ir = 0;
        String b ="";
        while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7){
          if(c1<v){ 
            t = r*8;
            String y = Double.toString(t);
            String u = Character.toString(y.charAt(0));
            ir = Integer.parseInt(u);
            r = t - ir;
            b+=ir;
            c1++;
          }else {
            b="0";  
            break;
          }
            
        }
        
        //Concatenação do resultado inteiro e fraccionário
        octal = bin+","+b;
    }
    
    //Metodo que retorna a conversão em Octal(fraqcionario)
    public String getOctal() {
        return octal;
    }

    //Metodo para contar a quantidade de casas decimais depois da virgula do número binário informado
    private int contar(String u,int z){
        
        //Contar quantos numeros estão antes deppois da virgula
        String m = u,y="";
        int t =0,a=0,g=0,d=0;
        double r =0;
        for(int i = 0;i<m.length();i++){
            y = Character.toString(m.charAt(i));
            if(y.equals(".")){
                t=1;
                continue;
            }
            
            if(t==0){
               a++; 
            }else{
               d++; 
            }         
        }
     
        if(z==2){
            //Verificar se o total de numreos antes da virgula é multiplo de 4
            if(d%4!=0){
                do{
                   d++; 
                }while(d%4!=0);
            }
            
            d/=4;
        }else{
            //Verificar se o total de numreos antes da virgula é multiplo de 3
            if(d%3!=0){
                do{
                   d++; 
                }while(d%3!=0);
            }
            
            d/=3;
        }
            
        
        return d;
    }
    
    //Metodo para atribur a letra aos números maiores que 9 no código Hexadecimal
    private String letra(int o){
        String g="";
        switch(o){
                case 10:
                    g = "A";
                    break;                    
                case 11:
                    g = "B";
                    break;
                case 12:
                    g = "C";
                    break;
                case 13:
                    g = "D";
                    break; 
                case 14:
                    g = "E";
                    break;
                case 15:
                    g = "F";
                    break; 
                default:
                    g = Integer.toString(o);  
            }   
        return g;
    }
    
    //Método para a conversão em Hexadecimal
    public void setHexa(double o,String l){
        
        //Quantidade de numeros depois da virgula
        int v = contar(l,2);
        
        //separação da parte inteira e a parte fraccionária 
        int n = (int) o;
        double m = o -n;
        
        //Conversão da parte inteira
        int r1=0,q1=0,c1=1;
        int vet1[]=new int[100];        
        do{
           q1 = n/16;
           r1 = n%16;
           n = q1;
           vet1[c1]=r1;
           c1++;
        }while(q1>=1);
        
        //conversão da parte fraccionario
        String bin = "",g = ""; 
        for(int d=c1-1;d>=1;d--){
            //Atribução das letras para os valores maiores que 9
            g = letra(vet1[d]);
            bin+=g;
         
        
        //Conversão da parte fraccionaria
        double r = m,t=0,c=0;        
        int ir = 0,f=0;
        String b ="",u="",h="";
        while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7 & t!=8 & t!=9 & t!=10 & t!=11 & t!= 12 & t!= 13 & t!=14 & t!=15){
          if(c<v){              
            t = r*16;
            
            ir = (int) t;            
            r = t - ir;
               g="";
            //Atribução das letras para os valores maiores que 9  
            g = letra(ir);
            b+=g;
            c++;
          }else {
            b="0";  
            break;
          }
        }
        //Concatenação do resultado decimal e fraccionário  
        hexa = bin+","+b;        
    } 
        
}

    //Metodo que retorna a conversão em hexadecimal(fraqcionario)
    public String getHexa(){
        return hexa;
    }    

}