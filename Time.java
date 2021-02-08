public class Time {
    int seconds;
    int minutes;
    int hours;
    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public static Time diff(Time start, Time stop)
    {
        Time diff =new Time(0,0,0);
        if(stop.seconds > start.seconds){
            --start.minutes;
            start.seconds += 60;
        }
        
        if(stop.minutes > start.minutes){
            --start.hours;
            start.minutes += 60;
        }
        diff.minutes = start.minutes - stop.minutes;
        diff.hours = start.hours - stop.hours;
        diff.seconds = start.seconds - stop.seconds;
        return(diff);
    }
    public static void main(String[] args)
    {
        Time start  = new  Time(12,34,55);
        Time stop = new Time(8,12,15);
        Time diff;
        diff = diff(start,stop);
        System.out.println("time periods are : ");
        System.out.println(start.hours+ " : " + start.minutes+ " : "+ start.seconds);
        System.out.println(stop.hours+ " : " + stop.minutes+ " : "+ stop.seconds);
        System.out.println("TIME DiFFERENCE  = "+diff.hours+" : "+diff.minutes+" : "+diff.seconds);
    }
}
