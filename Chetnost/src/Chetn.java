public class Chetn {
    public static void main(String args[])
           throws java.io.IOException
    {
               System.out.print("Введите число для определения чётности: ");
               char i = (char)System.in.read();
               if (i % 2 == 0)
                   System.out.printf("Число %c - чётное\n", i);
               else System.out.printf("Число %c - нечётное\n", i);

        System.out.println("Test for Git");
              /* double a = 2;
               int b = 3;
               double c = b/a;
        System.out.println(c);*/
              // System.out.println(i);
    }
}
