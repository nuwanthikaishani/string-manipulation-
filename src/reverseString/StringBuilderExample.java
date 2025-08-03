package reverseString;

public class StringBuilderExample {
    public static void main(String args[]){
        StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("Hello");
         stringBuilder.append(" ");
         stringBuilder.append("Word");

         String result = stringBuilder.toString();
         System.out.println(result);

    }
}
