package gua.spike.immut;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableSet;

/**
 * Created with IntelliJ IDEA. Date: 2013.03.14. Time: 13:59
 */
public class ImmutTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testImmutable() {

        String a = "A";
        String b = "B";

        String c = "C";

        final Set<String> strings = new HashSet<>();
        strings.add(a);
        strings.add(b);
        strings.add(c);

        final ImmutableSet<String> immutableSet = ImmutableSet.<String>copyOf(strings);


        int i = -1;
        for (String str: immutableSet){
                  i++;
            switch (i%3){
                case 0: assertThat(a,sameInstance(str));
                    break;
                case 1: assertThat(b,sameInstance(str));
                    break;
                case 2: assertThat(c,sameInstance(str));
                    break;
            }
        }

        final ImmutableList<String> list = ImmutableList.of("Q", "W", "R");


    }
}
