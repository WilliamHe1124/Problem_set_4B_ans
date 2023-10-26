
/**
 * 在这里给出对类 Palindrome 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Palindrome
{
    public static boolean checkPalindrome(String str){
        String ans="";
        int s=str.length();
        String symbol=",.:;()[]{}!?@#$%^&* ";
        for (int i=s-1;i>=0;i--){
            
            String currentstr=str.substring(i, i+1);
            if (!symbol.contains(currentstr)){
                ans+=currentstr;
            }
        }
        return ans.equalsIgnoreCase(str);
    }
}
