import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
  private BusStop busStop;
  private Person person;
  private Bus bus;

  @Before
  public void setUp() {
    busStop = new BusStop("Waverly");
    person = new Person();
    bus = new Bus("Waverly", 80);
  }

  @Test
  public void hasName() {
    assertEquals("Waverly", busStop.getName());
  }

  @Test
  public void startsWithEmptyQueue() {
    assertEquals(0, busStop.getQueue());
  }

  @Test
  public void addPersonToQueue() {

    busStop.addPerson(person);
      assertEquals(1, busStop.getQueue());
  }

  @Test
  public void removePersonFromQueue() {
    busStop.addPerson(person);
    assertEquals(1, busStop.getQueue());
    busStop.removePerson();
    assertEquals(0, busStop.getQueue());
  }

  @Test
  public void canPickUpPersonFromBusStop() {
    busStop.addPerson(person);
    assertEquals(1, busStop.getQueue());
    busStop.pickUp(bus);
    assertEquals(0, busStop.getQueue());
    assertEquals(1, bus.passengerCount());
  }
}
