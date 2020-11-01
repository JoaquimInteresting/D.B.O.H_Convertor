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
public class DEcimalFraq {
    
    //atributos privados da classe DEcimalFraq
    private int num;
    private String binario;
    private String octal;
    private String hexa;
    
    //Método para a conversão de decimal para binário(fraccionário)
    public void setBinario(long n,double m){
        //Separação da parte inteira e a parte fraccionária do número decimal
        long r1=0,q1=0,b=0;
        int c=1;
        int vet1[]=new int[100];   
        
        //Conversão da parte inteira  
        do{
           q1 = n/2;
           r1 = n%2;
           n = q1;
           vet1[c]=Integer.parseInt(Long.toString(r1));
           c++;
        }while(q1>=1); 
       
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }
        
        //Complemento de dígitos aos números binários menosres que 8 
        String w = "";
        if(bin.length()==1){
            w = "000"; 
        }else if(bin.length()==2){
            w="00";
        }else if(bin.length()==3){
            w = "0"; 
        }       
        bin = w + bin;
        
        //Conversão da parte fraccinária e atribuição de letras as números maiores que 9
        double r = m,t=0,h=0;
        String bin2 ="";
        if(m!=0){
            int ir = 0;
            while(t!=1){
                if(h<100){ 
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

           }
        }else{
            bin2="0";
        } 
        
        //Concatenação do resultado inteiro e o resultado fraccionário
        binario =bin+","+bin2;
    }
    
    //Método para retornar o conversão de Binário(fraccionário)
    public String getBinario(){
        return binario;
    }
    
    //Método para a conversão de decimal para Octal(fraccionário)
    public void setOctal(long n,double m){
        //Separação da parte inteira e a parte fraccionária do número decimal
        long r1=0,q1=0;
        int c=1;
        int vet1[]=new int[100]; 
        
        //Conversão da parte inteira
        do{
           q1 = n/8;
           r1 = n%8;
           n = q1;
           vet1[c]=Integer.parseInt(Long.toString(r1));
           c++;
        }while(q1>=1);
        String bin = "";        
        for(int d=c-1;d>=1;d--){
            bin+= vet1[d]+"";
        }     
        
        //Conversão da parte fraccinária
        double r = m,t=0,c1=0;
        int ir = 0;
        String b ="";
        if(m!=0){
            while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7){
                if(c1<100){ 
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
        }else{
           b="0";
        } 
        
        //Concatenação do resultado inteiro e o resultado fraccionário
        octal = bin+","+b;
    }
    
    //Método para retornar o conversão de Octal(fraccionário)
    public String getOctal(){
        return octal;
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
    
    //Método para a conversão de decimal para Hexadecimal(fraccionário)
    public void setHexa(long n,double m){
        //Separação da parte inteira e a parte fraccionária do número decimal
        long r1=0,q1=0;
        int c1=1;
        int vet1[]=new int[100];  
        
        //Conversão da parte inteira
        do{
           q1 = n/16;
           r1 = n%16;
           n = q1;
           vet1[c1]=Integer.parseInt(Long.toString(r1));
           c1++;
        }while(q1>=1);  
        
        //Conversão da parte fraccinária
        String b ="",bin = "",g = "";        
        for(int d=c1-1;d>=1;d--){
            g = letra(vet1[d]);
            bin+=g;
            
            double r = m,t=0,c=0;        
            int ir = 0,f=0;
            String u="",h="";
        
            if(m!=0){
                while(t!=1 & t!=2 & t!= 3 & t!=4 & t!=5 & t!=6 & t!=7 & t!=8 & t!=9 & t!=10 & t!=11 & t!= 12 & t!= 13 & t!=14 & t!=15){
                    if(c<100){              
                        t = r*16;

                        ir = (int) t;            
                        r = t - ir;
                        g=letra(ir);
                        b+=g;
                        c++;
                    }else {
                        break;
                    }
                }
            }else{
               b="0";
            }

        }
        //Concatenação do resultado inteiro e o resultado fraccionário
        hexa = bin+","+b;
  
    }
    
    //Método para retornar a conversão de Hexadecimal(fraccionário)
    public String getHexa(){
        return hexa;
    }
}
