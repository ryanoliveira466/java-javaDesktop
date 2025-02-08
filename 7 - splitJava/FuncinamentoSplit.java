
package Aula10;


public class FuncinamentoSplit {
    
    public static void main(String[] args) {
//        
//        String str = "I love Java";
//        String[] words = str.split(",");
//        System.out.println(words);
        
        String str = "apple,banana,grape";
        
        // Split by comma
        String[] fruits = str.split(",");
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        //https://codegym.cc/pt/groups/posts/pt.512.metodo-java-string-split-

    
}
}