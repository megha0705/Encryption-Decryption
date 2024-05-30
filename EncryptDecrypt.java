import java.util.Scanner;
class EncryptDecrypt{
    public static StringBuilder encrypted(String input , int key){
         StringBuilder encoded = new StringBuilder();
         for(int i = 0; i < input.length(); i++){
            char encodedChar = (char)(((int)input.charAt(i) - 65 + key) % 26 + 65 );
            encoded.append(encodedChar);
        }
         encoded.toString();
         System.out.print(encoded);
         return encoded;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int key = 3;
        encrypted(input , key);
    }
}