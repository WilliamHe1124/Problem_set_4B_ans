
/**
 * 在这里给出对类 Pig_Latin 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Pig_Latin
{
   public static String quesB(String str){
       String ans="";
       String curans="";
       int x=0;
       int s=str.length();
       if (str.contains(" ")){
           int i=0;
           while (i<s){
            if (i==str.lastIndexOf(" ")){
                curans=str.substring(i+1);
                i=s;
            } else if (i==0){
                curans=str.substring(0, str.indexOf(" "));
            }else {
                curans=str.substring(i+1, str.indexOf(" ", i+1));
            }
            if (curans.length()>2) {
               ans+=" "+curans.substring(1);
               ans+=curans.charAt(0)+"ay";
            } else {
                ans+=" "+curans;
            }
            if (i<s) i=str.indexOf(" ", i+1);
           }
           ans=ans.substring(1);
        }  else{ 
           if (s>2) {
               ans+=str.substring(1);
               ans+=str.charAt(0)+"ay";
            } else {
                ans+=str;
            }
        }
       return ans;
   }
}
