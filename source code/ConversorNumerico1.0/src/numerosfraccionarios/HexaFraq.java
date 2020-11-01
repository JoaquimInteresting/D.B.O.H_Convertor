/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosfraccionarios;

/**
 *
 * @author INTERESTING
 */
public class HexaFraq {
    //atributos privados da classe HexaFraq
    private double decimal;
    private String binario;
    private String octal;
    
    //Metodo para conversão de hexa para decimal
    public void setDecimal(String p){
         
        //Contar os números antes da virgula
        String m = p,y="";
        int t =0,a=0,g=0;
        double r =0;
        for(int i = 0;i<m.length();i++){
            y = Character.toString(m.charAt(i));
            if(y.equals(".")){
                t=1;
                continue;
            }
            
            if(t==0){
               a++; 
            }         
        }
        
        //Conversão da parte inteira do numero binário informado
        int e =0;
        for(int i =a-1;i>=0;i--){
            switch(m.charAt(i)){
                case 'A':
                case 'a':
                    g = 10;
                    break;
                case 'B':
                case 'b':
                    g = 11;
                    break;
                case 'C':
                case 'c':
                    g = 12;
                    break;
                case 'D':
                case 'd':
                    g = 13;
                    break;
                case 'E':
                case 'e':
                    g = 14;
                    break;
                case 'F':
                case 'f':
                    g = 15;
                    break;
                default :
                     g = Integer.parseInt(Character.toString(m.charAt(i))); 
            }
            r+=(Math.pow(16,e)*g);
            e++;
        }
        
        //convers'ao da parte fraccionária do número binário informado
        e=-1;
        for(int i =a+1;i<m.length();i++){
             switch(m.charAt(i)){
                case 'A':
                case 'a':
                    g = 10;
                    break;
                case 'B':
                case 'b':
                    g = 11;
                    break;
                case 'C':
                case 'c':
                    g = 12;
                    break;
                case 'D':
                case 'd':
                    g = 13;
                    break;
                case 'E':
                case 'e':
                    g = 14;
                    break;
                case 'F':
                case 'f':
                    g = 15;
                    break;
                default :
                   g = Integer.parseInt(Character.toString(m.charAt(i))); 
            }
            r+=(Math.pow(16,e)*g);
            e--;
        } 
        
        decimal =r;
    }
    
    //M+etodo para obter o valor de decimal
    public double getDecimal(){
        return decimal;
    }
    
    //Metodo para contar a quantidade de casas decimais depois da virgula do número binário informado
    private int contar(String u,int z){
        
        //Contagem de quantidade de números antes e depois da virgula
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
            //Verificar se o total de numreos depois da virgula é multiplo de 3
            d*=4;
            if(d%3!=0){
                do{
                   d++; 
                }while(d%3!=0);
            }
            
            d/=3;
        }else{
            //Verificar a quantidade de números depois da virgula e multiplicar por 3
            d*=4;
        }
         
        return d;
    }
    
    //Metodo para conversºao de hexa para binário
    public void setBinario(double d,String l){
        
        int v = contar(l,1);
        
        //Separação da parte fraccionária e a parte inteira
        int n = (int) d;
        double m = d -n;
        
        //conversão de ambas as partes
        int r1=0,q1=0,c=1,b=0;
        int vet1[]=new int[100];        
        do{
           q1 = n/2;
           r1 = n%2;
           n = q1;
           vet1[c]=r1;
           c++;
        }while(q1>=1);        
        String bin = "";        
        for(int p=c-1;p>=1;p--){
            bin+= vet1[p]+"";
        }
        
        //algoritmo para complementar o número de zeros (1 número octal corresponde a 3 binários)
        String w ="";
        if(bin.length()==1){
             w = "000"; 
          }else if(bin.length()==2){
              w="00";
          }else if(bin.length()==3){
              w="0";
          }       
            bin = w + bin;
               
        double r = m,t=0;
        int ir = 0,h=0;
        String bin2 ="";
        while(t!=1){
            if(h<v){ 
              t = r*2;
              String y = Double.toString(t);
              String u = Character.toString(y.charAt(0));
              ir = Integer.parseInt(u);
              r = t - ir;
              bin2+=ir;
              h++;
            }else {
               break;
            }   
          
            //Algoritmo para acrecentar zeros depois da virgula
            if(t==1){
                  if(h!=v){
                      int z = v - h;
                      for(int j=0;j<z;j++){
                          bin2+="0";
                      }
                  }  
            } 
           
       }
       
       //algoritmo para atribuir 0 atrás da virgula quando o número for inteiro  
       bin2=bin2==""?"0":bin2;
        
        binario =bin+","+bin2;
    }
    
    //M+etodo para obter o valor de binario
    public String getBinario(){
        return binario;
    }
    
    //Metodo para conversºao de hexa para octal
    public void setOctal(double o,String l){
        
        int v = contar(l,2);
        
        int n = (int) o;
        double m = o -n; 
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
        
        double r = m,t=0,c1=0;
        int ir = 0;
        String b ="";
        while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7){
            
            if(v==0){
                b="0"; 
            }
            
            if(c1<v){ 
                t = r*8;
                String y = Double.toString(t);
                String u = Character.toString(y.charAt(0));
                ir = Integer.parseInt(u);
                r = t - ir;
                b+=ir;
                c1++;
            }else {
                break;
            }

          }
        
        octal = bin+","+b;
    }
    
    //M+etodo para obter o valor de Octal
    public String getOctal(){
        return octal;
    }
}
