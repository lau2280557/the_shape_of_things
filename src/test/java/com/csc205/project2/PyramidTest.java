package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//write a test class for Pyramid
public class PyramidTest {

    private Pyramid pyramid;

    @BeforeEach
    public void setUp() {
        pyramid = new Pyramid(3.0, 4.0);
    }

    @Test
    public void testGetBaseLength() {
        assertEquals(3.0, pyramid.getBaseLength());
    }

    @Test
    public void testSetBaseLength() {
        pyramid.setBaseLength(5.0);
        assertEquals(5.0, pyramid.getBaseLength());
    }

    @Test
    public void testGetHeight() {
        assertEquals(4.0, pyramid.getHeight());
    }

    @Test
    public void testSetHeight() {
        pyramid.setHeight(6.0);
        assertEquals(6.0, pyramid.getHeight());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(39.68626966596886, pyramid.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(12.0, pyramid.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Pyramid {baseLength=3.0, height=4.0, surface area=39.68626966596886, volume=12.0}";
        assertEquals(expected, pyramid.toString());
    }
}
