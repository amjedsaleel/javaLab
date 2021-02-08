import java.util.*;

public class Test {
    public static String remVowel(String str)
    {
        Character vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character>al = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<sb.length();i++)
        {
            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a String");
        String str=s.nextLine();
        System.out.println("After Vowels removed from the string is: " + remVowel(str));
    }
}
