package Mem;


public class Palavramem {

    private byte[] bytes; //Criando o tipo byte(8 bits)

    public Palavramem(){
        this.bytes= new byte[3]; //vamos ter 3 bytes (24 bits)
    }
    
    //Aqui definimos o valor da nossa memoria de 3 bytes
    public void setValor(byte b1, byte b2, byte b3){
        bytes[0] = b1;
        bytes[1] = b2;
        bytes[2] = b3;  
    }
    public byte[] getBytes(){ 
        return bytes;
    }

}
