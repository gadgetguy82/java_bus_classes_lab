import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
  private Bus bus;
  private Person person;

  @Before
  public void setUp() {
    bus = new Bus("Edinburgh", 80);
    person = new Person();
  }

  @Test
  public void hasDestination() {
    assertEquals("Edinburgh", bus.getDestination());
  }

  @Test
  public void hasCapacity() {
    assertEquals(80, bus.getCapacity());
  }

  @Test
  public void startsWithZeroPassengers() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPassengersToBus(){
    bus.addPassenger(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void canRemovePassengersFromBus() {
    bus.addPassenger(person);
    assertEquals(1, bus.passengerCount());
    bus.removePassenger();
    assertEquals(0, bus.passengerCount());
  }
}
