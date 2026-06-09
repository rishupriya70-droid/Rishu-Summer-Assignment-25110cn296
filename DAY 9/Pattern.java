public class Pattern {
    public static void main(String[] args)
    {
        System.out.println("The hollow square pattern:");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <=5; j++){
                if (i ==1 || i == 5 || j == 1 || j== 5)
                {
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
