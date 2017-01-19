import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    ArrayList arrayList;

    @Before
    public void before() {
        arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i);
        }
    }

    @Test
    public void testGet() {
        for (int i = 0; i < arrayList.size; i++) {
            assertEquals(i, arrayList.get(i));
        }
    }

}
