import java.util.*;

public class Driver{
  public static void main(String[] args){
    HashMap<String, Day> days = new HashMap<String, Day>();

    Scanner s = new Scanner(System.in);
    boolean b = true;
    while(b){
    System.out.println("What would you like to do? \n 1. View Calendar Events \n 2. Create a calendar event \n 3. Delete a calendar event \n 4. Exit");
    int response = s.nextInt();
    s.nextLine();
    switch(response){
      case 1: viewEvents(days); break;
      case 2:
        System.out.println("Enter a month for the event (eg. January): ");
        String month = s.nextLine();
        System.out.println("Enter a date for the event (eg. 24): ");
        int date = s.nextInt();
        System.out.println("Enter an hour for the event (eg. 09): ");
        s.nextLine();
        String hour = s.nextLine();
        System.out.println("Enter a minute for the event (eg. 30): ");
        String minute = s.nextLine();
        System.out.println("Enter an event name: ");
        String name = s.nextLine();

        Day d = new Day(date, month);
        Event e = new Event(name, hour, minute);
        d.addEvent(e);
        if(days.containsKey(month + " " + date)){
          days.get(month + " " + date).addEvent(e);
        }
        else{
          days.put(month + " " + date, d);
        }
        System.out.println("Event created");
        break;
      case 3:
        System.out.println("Enter the event month: ");
        String month1 = s.nextLine();
        System.out.println("Enter the event date: ");
        int date1 = s.nextInt();
        s.nextLine();
        System.out.println("Enter the event hour: ");
        String hour1 = s.nextLine();
        System.out.println("Enter the event minute: ");
        String minute1 = s.nextLine();
        System.out.println("Enter the event name: ");
        String name1 = s.nextLine();
        Event e1 = new Event(name1, hour1, minute1);
        if(days.containsKey(month1 + " " + date1)){
          days.get(month1 + " " + date1).removeEvent(e1);
          System.out.println("Event removed");
        }
        else System.out.println("Event not found");
        break;
      case 4: b= false; break;
      default: break;
    }
    }

  }
  private static void viewEvents(HashMap<String, Day> days){ //prints out all events stored in system
    for(Map.Entry<String, Day> e: days.entrySet()){
      System.out.println(e.getValue());
      }
    }
}
