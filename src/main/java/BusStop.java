import java.util.ArrayList;

public class BusStop {
  private String name;
  private ArrayList<Person> queue;

  public BusStop(String name) {
    this.name = name;
    this.queue = new ArrayList<Person>();
  }

  public String getName() {
    return this.name;
  }

  public int getQueue() {
    return this.queue.size();
  }

  public void addPerson(Person person) {
    this.queue.add(person);
  }

  public Person removePerson() {
    return this.queue.remove(0);
  }

  public void pickUp(Bus bus) {
    bus.addPassenger(removePerson());
  }
}
