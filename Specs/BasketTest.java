// import static org.junit.Assert.*;
// import org.junit.*;

// import ShoppingBasket.*;
// import java.util.*;

// public class BasketTest {

//   Product item1;
//   Product item2;
//   Product item3;
//   Basket basket;

//   @Before
//   public void before(){
//     item1 = new Product("CD", "bogof", 4.99);
//     item2 = new Product("DVD", "full price", 9.99);
//     item3 = new Product("LP", "bogof", 24.99);
//     basket = new Basket();
//     basket.addItemToBasket(item2);
//     basket.addItemToBasket(item3);
//     basket.addItemToBasket(item1);
//   }

//   @Test
//   public void canAddItemToBasket(){
//     assertEquals(3, basket.countBasketContents());
//   }

//   @Test
//   public void canFindIndexOfItemInBasket(){
//     assertEquals(1, basket.getIndexOfItemInBasket(item3));
//   }

//   @Test
//   public void CanRemoveItemFromBasket(){
//     basket.removeItemFromBasket(item3);
//     assertEquals(2, basket.countBasketContents());
//     assertEquals(-1, basket.getIndexOfItemInBasket(item3));
//   }

//   @Test
//   public void canEmptyAllItemsFromTheBasket(){
//     basket.removeAllItems();
//     assertEquals(0, basket.countBasketContents());
//   }

// }