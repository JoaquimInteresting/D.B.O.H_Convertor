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
public class Bcd {
    protected String bcd = "";
    protected long decimal = 0;
    
    public void setValor1(long n){
        int y=0;
         String r = Long.toString(n);
         String e="",w="";
         for(int c = 0;c<r.length();c++){
             y =Integer.parseInt(Character.toString(r.charAt(c))); 
             switch(y){
                 case 0:
                    w = "0000";
                    break;
                 case 1:
                    w = "0001";
                    break;
                 case 2:
                    w = "0010";
                    break;
                 case 3:
                    w = "0011";
                    break;
                 case 4:
                    w = "0100";
                    break;
                 case 5:
                    w = "0101";
                    break;
                 case 6:
                    w = "0110";
                 case 7:
                    w = "0111";
                    break;
                 case 8:
                    w = "1000";
                    break;
                 case 9:
                    w = "1001";
                    break;                    
             }
             e+=w+"";
         }
         bcd = e;
    }          
       
    public void setValor2(String n){
        int u = 0,i=0,r=0;        
        String e = "";
        String y = n;
        for(int c=0;c<y.length();c++){
            e+=Character.toString(y.charAt(c));
            i++;
            if(i==4){
                if(e.equals("0000")){
                    bcd+=0;
                }else if(e.equals("0001")){
                    bcd+=1;
                }else if (e.equals("0010")){
                    bcd+=2;                    
                }else if(e.equals("0011")){
                    bcd+=3;                    
                }else if(e.equals("0100")){
                    bcd+=4;                    
                }else if(e.equals("0101")){
                    bcd+=5;
                }else if(e.equals("0110")){
                    bcd+=6;
                }else if(e.equals("0111")){
                    bcd+=7;
                }else if(e.equals("1000")){
                    bcd+=8;
                }else if(e.equals("1001")){
                    bcd+=9;
                }else{
                    System.out.println("Este numero não está em BCD");
                    bcd="";
                    break;
                } 
                i=0;
                e="";
           }
    }
        decimal = Long.parseLong(bcd);
}
    
    public long getDecimal(){
        return decimal;
    }
    
    public String getBCD(){
        return bcd;
    }
}    

