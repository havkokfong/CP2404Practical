public abstract class PhoneCall {
    String phoneNum;
    double price;
    public PhoneCall(String phoneNum){
        price = 0.0;
    }

    private String getPhoneNum(){
        return phoneNum;
    }

    private double getPrice(){
        return price;
    }

    private void displayInfo(){
        System.out.println(phoneNum + price);
    }
}
