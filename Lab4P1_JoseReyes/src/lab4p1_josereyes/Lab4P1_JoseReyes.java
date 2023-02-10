/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_josereyes;

/**
 *
 * @author josem
 */
import java.util.Scanner;
public class Lab4P1_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in).useDelimiter("\n");
        boolean flag=true;
        
        while(flag==true){
            System.out.println("---Menu principal---");
            System.out.println("1.Substitute\n2.Repite\n3.Can you built it?\n4.salir");
            int menu=r.nextInt();
            
            switch(menu){
                case 1:{
                    String index1="%d";
                    String num1;
                    String num2;
                    int indexx;
                    System.out.println("Ingrese la cadena (con el simbolo %d): ");
                    String cadena=r.next();
                    System.out.println("Ingrese cadena que hara la susticion");
                    String sus=r.next();
                    
                    indexx=cadena.indexOf(index1);
                    num1=cadena.substring(0,indexx);
                    num2 = cadena.substring(indexx+2);
                    if(cadena.length()>indexx){
                        System.out.println("Resultado: "+num1+sus+num2);
                    }else{
                        System.out.println("Resultado: "+num1+sus);
                    }
                    System.out.println();
                }break;
                case 2:{
                   System.out.println("Ingrese la cadena de entrada: ");
                    String input = r.next();
                    String output = "";

                    int i = 0;
                    while (i < input.length()) {
                      int dotIndex = input.indexOf(".", i);
                      if (dotIndex == -1) {
                        output += input.substring(i);
                        break;
                      }
                      String sub = input.substring(i, dotIndex);
                      int dotCount = 0;
                      for (int j = dotIndex; j < input.length(); j++) {
                        if (input.charAt(j) == '.') {
                          dotCount++;
                        } else {
                          break;
                        }
                      }
                      for (int j = 0; j < dotCount; j++) {
                        output += sub;
                      }
                      i = dotIndex + dotCount;
                    }
                    System.out.println("La cadena de salida es: " + output);
                    //solo esto pude hacer aqui no entendi del todo porque no me sale bien
                }break;
                case 3:{
                    System.out.print("Ingrese la cadena larga: ");
                    String larga = r.next();
                    System.out.print("Ingrese la cadena corta: ");
                    String corta =r.next();

                    boolean puede = true;
                    for (int i = 0; i < corta.length(); i++) {
                      char c = corta.charAt(i);
                      boolean encontrar = false;
                      for (int j = 0; j < larga.length(); j++) {
                        if (larga.charAt(j) == c) {
                          encontrar= true;
                          larga = larga.substring(0, j) + larga.substring(j + 1);
                          break;
                        }
                      }
                      if (!encontrar) {
                        puede= false;
                        break;
                      }
                    }
                    if (puede) {
                      System.out.println("You can build it!");
                    } else {
                      System.out.println("You cant't build it!");
                    }
                    System.out.println();
                }break;
                case 4:{
                    flag=false;
                    System.out.println("Programa finalizado");
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                }break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
