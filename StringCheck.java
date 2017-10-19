
import java.util.Scanner;

public class StringCheck {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scan.nextLine();
        System.out.println(isValid(input));
    }   
    
    public static boolean isValid(String input){        
        if(input.length()>50 || input.length()<5) return false; 
        if(!Character.isDigit(input.charAt(0))) return false; 
        
        int numVowels=0;
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)) return false; //check for upper case
            if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)) return false; //check for special characters
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVowels++;                    
            }
            
        }
        if(numVowels<10) return false;
                
        return true;
    }
    
    
}
