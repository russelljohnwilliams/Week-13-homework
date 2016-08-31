import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class VinylTest {

  Vinyl item1;
  Vinyl item2;


  @Before
  public void before(){
    item1 = new Vinyl("Miles Davis", "Sketches of Spain", "full", 13.99, "180gm");
    item2 = new Vinyl("Divine Comedy", "Casanova", "bogof", 15.99, "undefined");
  }

  @Test
  public void productHasAnArtist(){
    assertEquals("Miles Davis", item1.getProductArtist());
  }

  @Test
  public void productHasATitle(){
    assertEquals("Casanova", item2.getProductTitle());
  }

  @Test
  public void productHasAnId(){
    assertEquals("bogof", item2.getProductId());
  }

  @Test
  public void productHasAPrice(){
    assertEquals(15.99, item2.getProductPrice(), 0.01);
  }

  @Test
  public void productHasAWeight(){
    assertEquals("180gm", item1.getWeight());
  }


}