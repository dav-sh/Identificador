package src.tipos;

import java.util.ArrayList;

public class VerificaTipos {
    private String texto;
    int[] numeros = new int[] {0,1,2,3,4,5,6,7,8,9};
    String[] other = new String[] {"[","]","{","}",",",";"};
    String[] abc = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public VerificaTipos(String texto) {
        this.texto = texto;
        System.out.println(this.texto + " Vamo a verificar");
        verificar();
    }

    public String[] verificar() {
        ArrayList<String> verificar = new ArrayList<String>();
        String txt = "";
        texto = texto.replace("\n","");

        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if(String.valueOf(c).equals(" ")){
                verificar.add(txt);
                verificardos(txt);
                System.out.println(txt + " verified");
                txt = "";
                System.out.println(txt + " reset");
            
            }
            else if(i == texto.length()-1){
                txt = txt + c;
                verificar.add(txt);
                System.out.println(txt + " last text");
                verificardos(txt);

            }
            else{
                txt = txt + c;
                System.out.println(txt);

            }
        }

        //comparaStrings(verificar.toArray(new String[verificar.size()]));

        return verificar.toArray(new String[verificar.size()]);
    }



    //un identificador por lo general es solo numeros enteros y solo numeros
    //el numero entero no lleva punto decimal y solo numeros
    //un numero decimal lleva punto decimal y solo numeros

    public void verificardos(String texto){
        boolean tieneNumeros = false;
        boolean tieneLetras = false;
        boolean tieneOtros = false;
        int contador = 0;
        System.out.println("tengo este texto: " + texto);
        for(int z=0; z<texto.length(); z++){
            System.out.println("evaluando: "+ texto.charAt(z));
            for(int i=0; i<numeros.length; i++){
                if(Character.getNumericValue(texto.charAt(z))==numeros[i]){
                    System.out.println("Soy numero: " + texto.charAt(z));
                    tieneNumeros = true;

                }
            }
            for (int i = 0; i<abc.length; i++){
                if(String.valueOf(texto.charAt(z)).equals(abc[i])){
                    System.out.println("Soy una letra: " + texto.charAt(z));
                    tieneLetras = true;
                }
            }
            for(int i=0; i<other.length; i++){
                if(String.valueOf(texto.charAt(z)).equals(other[i])){
                    System.out.println("Soy un caracter: " + texto.charAt(z));
                    tieneOtros= true;
                }
            }if(String.valueOf(texto.charAt(z)).equals(".")){ //
                contador++;
            }
            
            
            
        }
        if(tieneNumeros && tieneOtros==false && tieneLetras ==false){
            if(contador==1){
                System.out.println("Soy un decimal");
            }else if(contador==0){
                System.out.println("Soy un entero");
            }
        }
        else if(tieneNumeros==false && tieneOtros && tieneLetras ==false && contador==0){
            System.out.println("Soy solo otros");
        }
        else if(tieneNumeros==false && tieneOtros==false && tieneLetras && contador==0){
            System.out.println("Soy solo letras");
        }
        else{
            System.out.println("No soy de nadie, Hubo un error");
        }


            
    }
}
