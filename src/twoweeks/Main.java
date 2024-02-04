package twoweeks;

public class Main {
    public static void main(String[] args) {

       Beauty beauty = new Beauty("Diptyque", 290000, 0.1);
       Grocery grocery = new Grocery("ARMAND",750000,0.75);
       LargeAppliance largeAppliance = new LargeAppliance("Sub-Zero",30000000,350);

       int beautyDeliveryCharge = beauty.getDeliveryCharge(beauty.getPrice(290000),beauty.getWeight(0.1));
       int groceryDeliveryCharge = grocery.getDeliveryCharge(grocery.getPrice(750000),beauty.getWeight(0.75));
       int largeApplianceDeliveryCharge = largeAppliance.getDeliveryCharge(largeAppliance.getPrice(30000000),beauty.getWeight(350));

       System.out.println(beauty.getName("Diptyque ") + "배송비: " + beautyDeliveryCharge);
       System.out.println(beauty.getName("ARMAND ") + "배송비: " + groceryDeliveryCharge);
       System.out.println(beauty.getName("Sub-Zero ") + "배송비: " + largeApplianceDeliveryCharge);
    }
}