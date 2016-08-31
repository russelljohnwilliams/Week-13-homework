import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class CompactDiscTest {

  CompactDisc item1;
  CompactDisc item2;


  @Before
  public void before(){
    item1 = new CompactDisc("Neil Young", "After The Goldrush", "budget", 4.99);
    item2 = new CompactDisc("Bobby Conn", "The Golden Age", "bogof", 9.99);
  }

  @Test
  public void productHasAnArtist(){
    assertEquals("Neil Young", item1.getProductArtist());
  }

  @Test
  public void productHasATitle(){
    assertEquals("The Golden Age", item2.getProductTitle());
  }

  @Test
  public void productHasAnId(){
    assertEquals("bogof", item2.getProductId());
  }

  @Test
  public void productHasADifferentId(){
    assertEquals("budget", item1.getProductId());
  }

  @Test
  public void productHasAPrice(){
    assertEquals(9.99, item2.getProductPrice(), 0.01);
  }

}