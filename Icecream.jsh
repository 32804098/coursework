int studentNumber = 804098;
int vanillaPrice = studentNumber % 100;
int chocolatePrice = (studentNumber / 100) % 100;
int strawberryPrice = (studentNumber / 10000) % 100;
int scoops = 0; // 将 scoops 变量的定义移动到这里
private static int getValidScoops(Scanner scanner, String flavor) {
      int scoops = 0;
      boolean validScoops = false;
      while (!validScoops) {
            System.out.print("How many scoops would you like? ");
            if (scanner.hasNextInt()) {
                  scoops = scanner.nextInt();
                  if (scoops == 1 || scoops == 2 || scoops == 3) {
                        validScoops = true;
                  } else {
                        System.out.println("That's too many scoops to fit in a cone.");
                  }
            } else {
                  System.out.println("We don't sell just a cone.");
                  scanner.next();
            }
      }
      return scoops;
}
Scanner scanner = new Scanner(System.in);
System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
String flavor = scanner.nextLine().toLowerCase();
boolean validFlavor = true;
switch (flavor) {
      case "v":
        scoops = getValidScoops(scanner, "vanilla"); // 移除 scoops 变量的定义
        break;
      case "c":
        scoops = getValidScoops(scanner, "chocolate"); // 移除 scoops 变量的定义
        break;
      case "s":
        scoops = getValidScoops(scanner, "strawberry"); // 移除 scoops 变量的定义
        break;
      default:
        validFlavor = false;
        System.out.println("We don't have that flavor.");
        break;
}
if (validFlavor) {
      int pricePerScoop = 0;
      switch (flavor) {
            case "v":
              pricePerScoop = vanillaPrice;
              break;
            case "c":
              pricePerScoop = chocolatePrice;
              break;
            case "s":
              pricePerScoop = strawberryPrice;
              break;
      }
      int totalCost = 100 + (scoops * pricePerScoop);
      System.out.println("That will be " + (totalCost / 100.0) + " please.");
}