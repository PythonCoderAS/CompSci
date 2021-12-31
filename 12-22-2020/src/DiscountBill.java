public class DiscountBill extends GroceryBill {
    private boolean preferred;
    private int discounted;
    private double discountPrice;
    
    public DiscountBill(Employee clerk, boolean p){
        super(clerk);
        preferred = p;
    }
    
    public void add(Item item){
        if (item.getDiscount() != 0 && preferred){
            discounted++;
            discountPrice += item.getDiscount();
        }
        super.add(item);
    }
    
    public int getDiscountCount(){
        return discounted;
    }
    
    public double getDiscountAmount(){
        return discountPrice;
    }
    
    public double getDiscountPercent(){
        if (!preferred){
            return 0;
        }
        return 100.0 - Math.abs((super.getTotal() - getDiscountAmount()) / super.getTotal()) * 100;
    }
    
    public double getTotal(){
        return Math.rint((super.getTotal() - discountPrice) * 100) / 100.0;
    }
}