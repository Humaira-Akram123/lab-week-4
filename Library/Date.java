public class Date{
private int year;
private int month;
private int day;

Date(int day,int month,int year){
setDay(day);
setMonth(month);
setYear(year);
 }
Date(Date other){
this.day=other.day;
this.month=other.month;
this.year=other.year;
}
public boolean equals(Date other){
if((this.year==other.year)&&(this.month==other.month)&&(this.day==other.day))
{return true;}
else{return false;}}
 public void showDate(){
        System.out.printf("%d %d %d ", day,month,year);
    }


    public void setDay(int day){
        if(day>0 && day <=31)
            this.day = day;
    }


    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        if(month>0 && month<=12)
            this.month = month;

    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
            this.year=year;

    }

    public int getYear(){
        return year;
    }


   



}