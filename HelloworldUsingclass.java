/* Written By ChatGPT
Not confirmed code 
same code with Helloworld.java but using classes and methods 
*/ 

class HelloWorld {
    private String[] alphabet;
    private String[] hello;

    public HelloWorld(String[] alphabet, String[] hello) {
        this.alphabet = alphabet;
        this.hello = hello;
    }

    public void generateCombinations() {
        String temp = "";
        for(int i = 0; i<hello.length;i++) {
            temp += hello[i];
            for(int j=0; j<alphabet.length;j++) {
                if(alphabet[j].equals(hello[i])){
                    break;}
                System.out.println("alphabet : " + alphabet[j] + " hello : "+temp);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!",","};
        String[] hello = "hello, world!".split("");
        HelloWorld hw = new HelloWorld(alphabet, hello);
        hw.generateCombinations();
    }
}
