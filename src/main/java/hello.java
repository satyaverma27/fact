import java.util.Scanner;
public class hello {
    public static void main(String[] args)
    {


                hello obj = new hello();
                System.out.print("Enter a number : ");
                Scanner scanner=new Scanner(System.in);
                int n= scanner.nextInt();
                System.out.println(obj.factoral(n));

            }
            public int factoral(int n)
            {
                int ans=1;
                for(int i=1;i<=n;i++)
                    ans*=i;
                return ans;
            }

}
