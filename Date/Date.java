public class Date
{
    private int day;
    private int month;
    private int year;
    public static final int SUNDAY = 0,
                            MONDAY = 1, 
                            TUESDAY = 2, 
                            WEDNESDAY = 3, 
                            THURSDAY = 4, 
                            FRIDAY = 5, 
                            SATURDAY = 6;

    public Date(int m, int d, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    public int getD()
    {
        return day;
    }

    public int getM()
    {
        return month;
    }

    public int getY()
    {
        return year;
    }

    public String toString()
    {
        return month+"/"+day+"/"+year;
    }

    public Date getTomorrow()
    {
        Date retDate = new Date(month,day+1,year);
        return retDate;
    }

    public void setDay( int day2)
    {
        day = day2;
    }

    public void setMonth(int mon2)
    {
        month = mon2;
    }

    public void setYear(int year2)
    {
        year = year2;
    }

    public int compareTo(Date other)
    {
        int y = this.getY();
        int yo = other.getY();
        int m = this.getM();
        int mo = other.getM();
        int d = this.getD();
        int doo = other.getD();
        if( y > yo)
        {
            return 3435;
        }
        else if (y<yo)
        {
            return -355;
        }
        else
        {
            if(m>mo)
            {
                return 3547557;
            }
            else if (m<mo)
            {
                return -53458;
            }
            else
            {
                if(d>doo)
                {
                    return 345;

                }
                else if(d<doo)
                {
                    return -545;
                }
                else 
                {
                    return 0;
                }
            }
        }
    }

    public boolean equals(Date other)
    {
        int y = other.getY();
        int d = other.getD();
        int m = other.getM();
        if(day==d)
        {
            if(m==month)
            {
                if(y==year)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public static void equalsTester()
    {
        Date d = new Date(7,4,1776);

        Date d1 = new Date(7,4,1776);
        Date d2 = new Date(7,5,1777);
        Date d3 = new Date(8,4,1777);
        Date d4 = new Date(8,5,1776);

        System.out.println(d.equals(d1));
        System.out.println(d.equals(d2));
        System.out.println(d.equals(d3));
        System.out.println(d.equals(d4));

    }

    public boolean isALeapYear()
    {
        if(year%400 == 0)
        {
            return true;
        }
        else if(year%100 == 0)
        {
            return false;
        }
        else if(year%4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void leapYearTester()
    {
        int[] leapYears = new int[]{2012,2016, 1996, 3600, 2800};
        int[] nonLeapYears = new int[]{1325,2100,3500,2453};

        System.out.println("Leap Years");

        for(int year: leapYears)
        {
            Date d = new Date(7,4,year);
            System.out.println(d.getY()+" "+d.isALeapYear());
        }

        System.out.println("\nNon Leap Years");

        for(int year: nonLeapYears)
        {
            Date d = new Date(7,4,year);
            System.out.println(d.getY()+" "+d.isALeapYear());
        }
    }

    public int numDaysInMonth()
    {
        if(month == 1|| month ==3 || month == 5 || month == 7 || month == 8|| month==10 || month==12)
        {
            return 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        else if(isALeapYear() && month == 2)
        {
            return 29;
        }
        else
        {
            return 28;
        }
    }

    public static void numDaysInMonthTester()
    {
        int[] vals = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        boolean allGood = true;
        for(int i = 0; i < vals.length; i++)
        {
            Date d = new Date(i+1,15,1985);
            if(vals[i] != d.numDaysInMonth())
            {
                allGood = false;
                System.out.println("Incorrect Value:"+d+"Expected: "+vals[i]+", Found:"+d.numDaysInMonth());
            }
        }

        Date d = new Date(2,22,2000);

        if(d.numDaysInMonth() != 29)
        {
            allGood = false;
            System.out.println("Incorrect Value:"+d+"Expected: 29, Found:"+d.numDaysInMonth());
        }

        if(allGood)
            System.out.println("numDaysInMonth is functional");
        else
            System.out.println("Fix Errors and Try Again");

    }

    public void incrementDay()
    {
        Date d = new Date(month,day,year);
        if(d.numDaysInMonth()== 31 && day==31 )
        {
            day = 1;
            month += 1;
        }
        else if(d.numDaysInMonth()== 30 && day == 30 )
        {
            day = 1;
            month += 1;
        }
        else if(d.numDaysInMonth()== 29 && isALeapYear() && day == 29 )
        {
            day = 1;
            month += 1;
        }
        else if(d.numDaysInMonth()== 28  && day==28)
        {
            day = 1;
            month += 1;
        }
       
        else
        {
            day += 1;
        }
        
          
            
       
       
        if(month == 13)
        {
            month = 1;
            year += 1;
        }
        else
        {
           month=month;
        }
        
    }

    public static void incrementDayTester()
    {
        Date d = new Date(1,1,2001);
        System.out.println(d);

        for(int i = 0; i < 366; i++)
        {           
            d.incrementDay();
            System.out.println(d);
        }
    }
    
    public int getDayOfWeek()
    {
        int dayValue;
        int monthValue;
        int centuryValue;
        int yearValue;
        int dayOfWeek;
        int dayOfWeek2;
        
        int century = year/100; 
        centuryValue = 2*(3 - (century % 4));
        
        int lastTwoOfYear = year-year/100*100;
         yearValue = lastTwoOfYear + lastTwoOfYear/ 4; 
        
        if((month == 1 && isALeapYear()) || month == 7 || month == 4)
        {
            monthValue = 6 ;
        }
        else if(month == 5)
        {
            monthValue =1;
        }
         else if(month == 8 || (month == 2 && isALeapYear()))
        {
            monthValue = 2;
        }
         else if(month == 2 || month == 3 || month == 11)
        {
            monthValue = 3;
        }
         else if(month == 6)
        {
            monthValue = 4;
        }
        else if(month == 9 || month == 12)
        {
            monthValue = 5;
        }
        else
        {
            monthValue = 0;
        }
        
        dayValue = day;
        dayOfWeek = monthValue + dayValue + centuryValue + yearValue;
        dayOfWeek2 = dayOfWeek%7;
        return dayOfWeek2;
    }
    
    public static void DayOfWeekTester()
    {
      Date d = new Date(4,26,1999);
      String l = d.getDayOfWeekString();
      
      System.out.println(l);
    }
    
    public String getDayOfWeekString()
    {
        String l;
      if(getDayOfWeek() == SUNDAY)
      {
          l="Sunday";
      }
      else if(getDayOfWeek() == MONDAY)
      {
          l="Monday";
      }
      else if(getDayOfWeek() == TUESDAY)
      {
          l="Tuesday";
      }
      else if(getDayOfWeek() == WEDNESDAY)
      {
          l="Wednesday";
      }
      else if(getDayOfWeek() == THURSDAY)
      {
          l="Thursday";
      }
      else if(getDayOfWeek() == FRIDAY)
      {
          l="Friday";
      }
      else
      {
          l="Saturday";
      }
      return l;
    }
}



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
