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
public class OctalFrac {
    
    //Atributos privados da classe OctalFrac
    private double decimal;
    private String binario;
    private String hexa;
    
    //Método para conversão em decimal
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
        double n = Double.parseDouble(m);
        long dc = (long) n,e=0;
        String h = Long.toString(dc); 
        for(int i =h.length()-1;i>=0;i--){
            g = Integer.parseInt(Character.toString(h.charAt(i)));
            r+=(Math.pow(8,e)*g);
            e++;
        }
        
        //convers'ao da parte fraccionária do número binário informado
        
        e=-1;
        for(int i =a+1;i<m.length();i++){
            g = Integer.parseInt(Character.toString(m.charAt(i)));
            r+=(Math.pow(8,e)*g);
            e--;
        } 
        
        decimal =r;
    }
    
    //Método para retornar a conversão em decimal
    public double getDecimal(){
        return decimal;
    }
    
    //Metodo para a conversão em Binário
    public void setBinario(double d,String l){
        //Quantidade de numeros depois da virgula
        int v = contar(l,1);
        
        //Separação da parte fraccionária e a parte inteira
        int n = (int) d;
        double m = d -n;
        
        //conversão de da parte inteira
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
             w = "00"; 
          }else if(bin.length()==2){
              w="0";
          }       
            bin = w + bin;
        
        //conversão da parte fraccionária
        double r = m,t=0;
        int ir = 0,h=0;
        String bin2 ="";
        while(t!=1){
            if(h<=v){ 
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
        
        //concatemação da conversão inteira e fraccionária
        binario =bin+","+bin2;
    }
    
    //Método para retornar a conversao em Binario
    public String getBinario(){
        return binario;
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
            //Verificar se o total de numreos depois da virgula é multiplo de 4
            d*=3;
            if(d%4!=0){
                do{
                   d++; 
                }while(d%4!=0);
            }
            
            d/=4;
        }else{
            //Verificar a quantidade de números depois da virgula e multiplicar por 3
            d*=3;
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

    //Métido para conversão em hexadecimal
    public void setHexa(double o,String l){
        //Quantidade de numeros depois da virgula
        int v = contar(l,2);
        
        //separação da parte inteira e a parte fraccionária
        int n = (int) o;
        double m = o -n;
        
        //conversão da parte inteira
        int r1=0,q1=0,c1=1;
        int vet1[]=new int[100];        
        do{
           q1 = n/16;
           r1 = n%16;
           n = q1;
           vet1[c1]=r1;
           c1++;
        }while(q1>=1);        
        String bin = "",g = "";        
        for(int d=c1-1;d>=1;d--){
            g = letra(vet1[d]);
            bin+=g;
        
        //conversão da parte fraccionária
        double r = m,t=0;        
        int ir = 0,f=0,c=0;
        String b ="",u="",h="";
        while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7 & t!=8 & t!=9 & t!=10 & t!=11 & t!= 12 & t!= 13 & t!=14 & t!=15){

            if(v==0){
                b="0"; 
            }

            if(c<v){              
                t = r*16;

                ir = (int) t;            
                r = t - ir;
                g= letra(ir);
                b+=g;
                c++;
            }else {
                break;
            }
          
        }
            //concatenação da conversão inteira e fraccionária
            hexa = bin+","+b;    
    } 
  }    
    //método para retornar a conversão em hexadecimal
    public String getHexa() {
        return hexa;
    }
     
}
