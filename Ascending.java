
public class Ascending
{
   public static int haha(int a, int b){
       int ans=0;
       int d;
       boolean gg=false;
       int rr;
       for (int i=a;i<=b;i++){
           String dd=Integer.toString(i);
           d=dd.length();
           rr=i;
           for (int t=0;t<d-1;t++){
               if (d<=1) gg=true;
               else {
                   if (rr%(10^(t+1))>(rr/(10^(t+1)))%(10)) gg=true;
                   else gg=false;
               }
               rr=rr/10;
           }
           if (gg) ans++;
       }
       return ans;
   }
}
