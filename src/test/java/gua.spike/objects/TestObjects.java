package gua.spike.objects;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Objects;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA. Date: 2013.03.14. Time: 14:44 To change this
 * template use File | Settings | File Templates.
 */
public class TestObjects {

    @Before
    public void setUp() {
    }

    @Test
    public void testObjects() {

        assertThat(null == null, equalTo(true));
        assertThat(Objects.equals("A", "A"), equalTo(true)); // JDK 7!!
        assertThat(Objects.equals(null, "A"), equalTo(false)); // JDK 7!!
        assertThat(Objects.equals("A", null), equalTo(false)); // JDK 7!!
        assertThat(Objects.equals(null, null), equalTo(true)); // JDK 7!!
        assertThat(Objects.equals(Integer.valueOf(5), 5), equalTo(true));
    }
}
