public static double sphere(double d) {
      double radius = d / 2;
      return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
}
double volume = sphere(20.24);
System.out.println("The volume of the sphere is: " + volume);