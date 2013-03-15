package gua.spike.strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Strings;

/**
 * Created with IntelliJ IDEA. Date: 2013.03.14. Time: 22:48 To change this
 * template use File | Settings | File Templates.
 */
public class StringsTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testStrings1() {

        String qqrq = "";
        boolean actual = Strings.isNullOrEmpty(qqrq);
        assertThat(actual, equalTo(true));

        qqrq = null;
        actual = Strings.isNullOrEmpty(qqrq);
        assertThat(actual, equalTo(true));

        qqrq = "";
        String stringActual = Strings.emptyToNull(qqrq);
        assertThat(stringActual, equalTo(null));

        String a = "qwertasddfg";
        String b = "qwertghghghjgj";

        String res = Strings.commonPrefix(a, b);
        assertThat(res, equalTo("qwert"));

    }

    @Test
    public void testBlankStrings() {

        String qqrq;
        boolean actual;

        qqrq = "    ";
        actual = Strings.isNullOrEmpty(qqrq);
        assertThat(actual, equalTo(false));

        qqrq = "     ";
        String qqrqA = Strings.nullToEmpty(qqrq).trim();
        assertThat(Strings.isNullOrEmpty(qqrqA), equalTo(true));

        qqrq = null;
        qqrqA = Strings.nullToEmpty(qqrq).trim();
        assertThat(Strings.isNullOrEmpty(qqrqA), equalTo(true));
    }

    @Test
    public void testPads() {
        String qqrq = "W";
        assertThat(Strings.padStart(qqrq, 5, '%'), equalTo("%%%%W"));

        qqrq = "QWERT";
        assertThat(Strings.padStart(qqrq, 5, '%'), equalTo("QWERT"));

        qqrq = "QWERTY";
        assertThat(Strings.padStart(qqrq, 5, '%'), equalTo("QWERTY"));


        /////////////////////////////////////////

         qqrq = "W";
        assertThat(Strings.padEnd(qqrq, 5, '%'), equalTo("W%%%%"));

        qqrq = "QWERT";
        assertThat(Strings.padEnd(qqrq, 5, '%'), equalTo("QWERT"));

        qqrq = "QWERTY";
        assertThat(Strings.padEnd(qqrq, 5, '%'), equalTo("QWERTY"));

    }

}
