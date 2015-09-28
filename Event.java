public class Event{
    public String name;
    public String hour;
    public String minute;

    public Event(String name, String hour, String minute){
      this.name = name;
      this.hour = hour;
      this.minute = minute;

    }

    public String toString(){
      String s;
      s = hour + ":" + minute + ": ";
      s += name;
      return s;
    }

    public boolean equals(Event e){
      if(this.name.equals(e.name)) return true;
      else return false;
    }
}
