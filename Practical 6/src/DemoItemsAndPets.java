public class DemoItemsAndPets {
    public static void main(String[] args){
        ItemSold itemSold = new ItemSold();
        PetSold petSold = new PetSold();
        petSold.setVaccinated(true);
        petSold.setNeuterted(true);
        petSold.setHouseBroken(false);
        itemSold.setInvoiceNumber(0001);
        itemSold.setPrice(200);
        itemSold.setDescription("A Black dog");
        System.out.println("The store have sold " + itemSold.getDescription() + " with the price of " + itemSold.getPrice()
        + " and the invoice number is: " + itemSold.getInvoiceNumber() + " The pet vaccination is " + petSold.getVaccinated()
        + " Neuterted is " + petSold.getNeuterted() + " HouseBroken is " + petSold.getHouseBroken());
    }
}
