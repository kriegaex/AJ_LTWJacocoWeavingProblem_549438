package de.scrum_master.app;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
  @Test
  public void testCircle() {
    Assert.assertEquals(Math.PI * 5 * 5, new Circle(5).getArea(), 1E-6);
    Assert.assertEquals(2 * Math.PI * 7, new Circle(7).getCircumference(), 1E-6);
  }
}
