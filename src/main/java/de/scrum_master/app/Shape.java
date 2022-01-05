package de.scrum_master.app;

/**
 * Use sealed interface as a Java 17 feature in order to verify that the Maven compiler is set correctly
 */
sealed interface Shape permits Circle {
  double getArea();
  double getCircumference();
}
