public class DateRunner
{
    public static void main()
    {
        Date c = new Date(2,22,1983);
        
 
  
        System.out.println(c);
        Date tomorrow = c.getTomorrow();
        System.out.println(tomorrow);
        
        c.setDay(23);
        c.setMonth(2);
        c.setYear(2525);
        System.out.println(c);
    }
}
