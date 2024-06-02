import java.util.Scanner;
class EncryptDecrypt{
    public static StringBuilder encrypted(String input , int key){
        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char encodedChar = input.charAt(i);
            if(Character.isDigit(encodedChar)){
                int asciiValue = (int)encodedChar;
                char encodedNum = (char)((asciiValue - 48 + key) % 10 + 48);
                encoded.append(encodedNum);
             }else if(Character.isUpperCase(encodedChar)){
                char encodedUpperCase = (char)(((int)encodedChar - 65 + key)% 26 + 65);
                encoded.append(encodedUpperCase);
             }else if(Character.isLowerCase(encodedChar)){
                char encodedLowerCase = (char)(((int)encodedChar - 97 + key)% 26 + 97);
                encoded.append(encodedLowerCase);
             }
        }
        encoded.toString();
        System.out.print(encoded);
        return encoded;
}
 

    public static StringBuilder decrypted(String input, int key){
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            char decodedChar = (char)input.charAt(i);
            if(Character.isDigit(decodedChar)){
                int asciiValue = (int)decodedChar;
                char decodedNum = (char)((asciiValue + 52 - key) % 10 + 48);
                decoded.append(decodedNum);
            }else if(Character.isUpperCase(decodedChar)){
                char  decodedUpperCase = (char)(((int)decodedChar + 65 - key)% 26 + 65);
                decoded.append(decodedUpperCase);

            }else if(Character.isLowerCase(decodedChar)){
                char decodedLowerCase = (char)(((int)decodedChar + 85 - key)% 26 + 97);
                decoded.append(decodedLowerCase);
            }
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
