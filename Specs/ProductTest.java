import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class ProductTest {

  Product item1;
  Product item2;
  Product item3;

  @Before
  public void before(){
    item1 = new Product("CD", "bogof", 4.99);
    item2 = new Product("DVD", "full price", 9.99);
    item3 = new Product("LP", "bogof", 24.99);
  }

  @Test
  public void productHasADescription(){
    assertEquals("CD", item1.getProductDescription());
  }

  @Test
  public void productHasAnId(){
    assertEquals("bogof", item3.getProductId());
  }

  @Test
  public void productHasAPrice(){
    assertEquals(9.99, item2.getProductPrice(), 0.01);
  }

}