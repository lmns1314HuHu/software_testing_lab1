package cn.triangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by yunhao on 17-3-10.
 */

@RunWith(Parameterized.class)
public class TriangleTest {

    private int a;
    private int b;
    private int c;
    private String expected;
    private Triangle triangle = null;

    public TriangleTest(int a, int b, int c, String expected){
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Test
    public void testKind(){
        assertEquals(this.expected, triangle.kind(this.a, this.b, this.c));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {1, 2, 3, "not a triangle"},
                {2, 3, 4, "scalene"},
                {2, 2, 3, "isosceles"},
                {3, 3, 3, "equilateral"}
        });
    }

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }
}