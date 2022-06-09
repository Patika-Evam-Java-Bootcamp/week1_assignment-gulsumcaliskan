
import java.util.Scanner;

public class HomeworkOne {
    
//    Homework Week 1

/*
    A�a��daki kod sat�rlar�na g�re ka� tane obje yarat�lacakt�r ?
    
    String s1="Welcome"; 
    String s2="Welcome"; 
    String s3="Welcome"; 
   
  
Answer: Only one object will be created. All of three variables; s1, s2, and s3 will refer to the same object i.e. "Welcome".
So, in the string pool memory they will point the same reference. 
*/
    
    
/*1)  static ve String data tipinde de�i�ken yaratal�m. Ve de�eri <<code>> olsun.*/

//Created a static and String data type which the value of variable is code.
    static String code = "code";
    
/* 2)   
D�n�� tipi String olan ve String[] parametre alan bir metod yazal�m. 
Gelen parametrenin i�inde en az 5 farkl� String olsun. 
Her bir eleman i�inde static olarak belirledi�imiz value i�eriyor 
mu i�ermiyor mu ko�ulunu kontrol etsin. 
*/
    
/*Takes an array of Strings and return the first String that contains
code.*/
    public static String isContains(String[] strArray){
        
        for(String item : strArray){
            if(item.contains(code)){
                return "The value of the String that contains the defined value is\n"
                		+ "(Tan�ml� value'yu i�eren String de�er): " + item;
            }
        }
        return "It is not found the value of the String that contains the defined value.\n"
        		+ "(Tan�ml� value'yu i�eren String de�er bulunamad�.)";
    }


 /*3)
Main metod i�erisinde metoda g�nderece�imiz parametreleri 
kullan�c�dan Scanner ile input olarak alal�m. Metod 
i�erisinde belirlenen static <<code>> stringini i�eren 
String bulunsun, bulunan String metoddan d�nd�r�ls�n. 
(1 tane String belirledi�imiz de�eri i�eriyor olacak) 
Console'a "Tan�ml� value yu i�eren 
String deger: " + <<String_deger_adi>> 
*/
    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many numbers will you add?: ");
        int number = scan.nextInt();
        
        String[] inputArray = new String[number];
        
/* Given a condition until the statements will work by writing the inputs 
at the console if the user entered 5 or more than 5 inputs. */    
        if(number >= 5){
            for(int i = 0; i < number; i++){
                System.out.print("Item of the "  + (i+1) + ": ");
                inputArray[i] = scan.next();
            }
                      
            scan.close();
            
            System.out.println(isContains(inputArray));
        }else {
            System.out.println("The number of the (inputs) Strings can't be less than 5!!!");
        }
    }
}