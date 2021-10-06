package Main;

import org.junit.Before;

public class ProductManagerImplTest {
    ProductManager scenario;

    @Before
    public void setUp() {
        scenario = ProductManagerImpl.getInstance();
    }
}
