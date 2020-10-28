package apupoo.modelo;

import java.util.ArrayList;
import java.util.List;

public class ISBN {

    private String isbn;

    public ISBN(String isbn) {
        this.isbn = isbn;
    }
    List<Character> lista = new ArrayList<>();
    char[] vect1= new char[13];
    char[] vect2= new char[13];

    public ISBN(){

    }

    public boolean verificarISBN(String isbn){
        String verISBN = getIsbn();
        int cont = 0;

        for (int i=0;i<verISBN.length();i++){
            vect1[i] = verISBN.charAt(i);
        }

        for(int i=0;i<isbn.length();i++){
            vect2[i] = isbn.charAt(i);
        }

        for(int i=0;i<13;i++){
 
            if(vect1[i] == vect2[i])
                cont++;
        }
        if(cont == 13){
            System.out.println("Correcto");
            return true;
        }else{
            return false;}

    }

 //       for (int i=0;i<verISBN.length();i++){
   //         System.out.println("Caracter " + i+1 + ": " + verISBN.charAt(i));
     //   }

        
    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    
}