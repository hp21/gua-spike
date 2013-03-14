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

    static class A {
        int id;
        String name;

        A(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return com.google.common.base.Objects.toStringHelper(this).add("id", id).add("name", name).toString();
        }
    }

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
        assertThat(Objects.equals(Integer.valueOf(5), 5), equalTo(true)); // JDK7
    }

    @Test
    public void testToStirng() {

        final A qqrq = new A(12, "qqrq");
        assertThat(qqrq.toString(),equalTo("A{id=12, name=qqrq}"));

    }
}
