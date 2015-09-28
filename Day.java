import java.util.*;

public class Day{
  public final int date;
  public final String month;
  private ArrayList<Event> events;


  public Day(int date, String month){
    this.date = date;
    this.month = month;
    events = new ArrayList<Event>();
  }

  public void addEvent(Event e){
    events.add(e);
  }

  public void removeEvent(Event e){
    for(int i = 0; i< events.size(); i++){
      if(events.get(i).equals(e)){
        events.remove(i);
        System.out.println("Event found");
    }
      }
  }

  public String toString(){
    String s;
    s = month + ", " + date;
    for(int i = 0; i< events.size(); i++){
      s += "\n  " + events.get(i);
    }
    return s;
  }

  public boolean equals(Day d){
    if(this.date == d.date && this.month == d.month) return true;
    else return false;
  }
}
