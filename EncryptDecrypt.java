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

    public static StringBuilder decrypted(String input, int key){
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char decodedChar = (char)(((int)input.charAt(i) + 65 - key)% 26 + 65);
            decoded.append(decodedChar);
        }
        decoded.toString();
        System.out.println(decoded);
        return decoded;
    }

    public static void main(String [] args){
        int key = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("do u want to decrypt or encrypt string?");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")){
            String input = sc.next();
            encrypted(input , key);
        }
        else if(choice.equalsIgnoreCase("decrypt")){
            String input = sc.next();
            decrypted(input , key);
        }
        else{
            System.out.println("invalid");
         }
    }
}