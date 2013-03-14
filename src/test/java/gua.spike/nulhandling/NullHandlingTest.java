package gua.spike.nulhandling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

/**
 * Created with IntelliJ IDEA. Date: 2013.03.14. Time: 13:59
 */
public class NullHandlingTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testOptional() {

        Integer qqrq = 6;
        final Optional<Integer> optional = Optional.of(qqrq);

        assertThat(optional.get(), equalTo(6));
        assertThat(optional.get(), sameInstance(qqrq));
        assertThat(optional.isPresent(), equalTo(true));

        Integer qqrq1 = null;
        final Optional<Integer> optional1 = Optional.fromNullable(qqrq1);

        assertThat(optional1 == Optional.<Integer> absent(), equalTo(true));
        assertThat(optional1.isPresent(), equalTo(false));
        assertThat(optional1.orNull(), equalTo(null));

    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        Integer qqrq = null;
        final Optional<Integer> optional = Optional.<Integer> of(qqrq);
    }

}
