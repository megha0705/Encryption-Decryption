import java.util.Scanner;
class EncryptDecrypt{
    static final String TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()-=_+[]{}\\|;:\'\",.<>/?";

    public static String encrypted(String input , int key) {
        String encoded = "";

        for(int i = 0; i < input.length(); i++)
            encoded += TABLE.charAt(TABLE.indexOf(input.charAt(i)) + key % TABLE.length());
            
        System.out.print(encoded);
        return encoded;
    }
 

    public static String decrypted(String input , int key) {
        String decoded = "";

        for(int i = 0; i < input.length(); i++)
            decoded += TABLE.charAt(TABLE.indexOf(input.charAt(i)) - key % TABLE.length());
            
        System.out.print(decoded);
        return decoded;
    }

    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("do u want to decrypt or encrypt string?");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("encrypt")){
            System.out.print("provide input");
            String input = sc.next();
            System.out.print("provide key");
            int key = sc.nextInt();
            encrypted(input , key);
        }
        else if(choice.equalsIgnoreCase("decrypt")){
            System.out.print("provide input");
            String input = sc.next();
            System.out.print("provide key");
            int key = sc.nextInt();
            decrypted(input , key);
        }
        else{
            System.out.println("invalid");
         }
    }
}
