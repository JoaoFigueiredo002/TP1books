package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
    private final BookShop bookShop = new BookShop("Academia");
    private int[] books = {3,1,1,1,1};

    @Test
    public void myFirstTest(){
        assertEquals(42, bookShop.cost(books));
    }
}