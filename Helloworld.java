/* 완성된 프로젝트 아님 */
public class HelloWorld{

     public static void main(String []args){
            String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!",","};
      String[] hello = "hello, world!".split("");
      
       
       for(int i = 0; i<hello.length;i++)
       {
           for(int j=0; j<alphabet.length;j++)
           {
                System.out.println(alphabet[j]));
                
               if(alphabet[j] == hello[i])
               {
                    System.out.println("debug : correct");
                   break;
               }
               else continue;
           }
       }
       
     }
}
