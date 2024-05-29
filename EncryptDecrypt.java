import java.util.Scanner;
class EncryptDecrypt{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int key = 3;
        for(int i = 0; i < input.length(); i++){
            char output = (char)((int)input.charAt(i) + key);
            System.out.print(output);
        }
    }
}