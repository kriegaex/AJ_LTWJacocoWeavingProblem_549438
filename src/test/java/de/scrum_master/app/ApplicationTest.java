package de.scrum_master.app;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
  @Test
  public void testGreet() {
    Assert.assertEquals("Hello world", new Application().greet("world"));
  }
}
