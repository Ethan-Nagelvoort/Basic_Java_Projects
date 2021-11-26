import java.util.ArrayList;
public class DateSorter
{
    public static void main()
    {
        ArrayList<Date> dates = new ArrayList<Date>();
        ArrayList<Date> unsorted= new ArrayList<Date>();

        System.out.println("Creating 50 random Dates...");

        for( int i =0; i<50; i++)
        {
            Date d = new Date((int)(Math.random()*12)+1,(int)(Math.random()*28)+1,(int)(Math.random()*3)+2010);
            unsorted.add(d);
            dates.add(d);
        }        

        System.out.println("Sorting using compareTo...\n");
        for(int i = 0; i < dates.size()-1;i++)
        {
            int bigIndex = i;
            for(int j =i; j < dates.size();j++)
            {

                if(dates.get(j).compareTo(dates.get(bigIndex))>0)
                    bigIndex = j;

            }

            Date tmp = dates.remove(bigIndex);
            dates.add(i,tmp);            
        }

        System.out.println("    Unsorted\t\t\t    Sorted");
        for(int i = 0; i < dates.size() ; i++)
        {
            System.out.println( "   "+unsorted.get(i)+" \t\t\t   "+dates.get(i));   
        }

    }
}
