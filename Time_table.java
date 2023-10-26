
/**
 * 在这里给出对类 Time_table 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Time_table
{  
   public void hehe(int x){
       String uuu=x*x+"";
       int ys=uuu.length();
       for (int i=1;i<=x;i++){
           for (int o=1;o<=x;o++){
               bd(ys, o*i);
               System.out.print(o*i);
           }
           System.out.println( );
       }
   }
   
   void bd(int a, int b){
       String sp=b+"";
       int sa=a-sp.length();
       while (sa>=0){
           System.out.print(" ");
           sa--;
       }
   }
}
