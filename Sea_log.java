package kz.aitu.oop.assignment6;

public class Sea_log extends Logistics {
    public Traffic newTraffic() {
        return new Vessel();
    }
    public void importationPlan () {
        System.out.println("The shipping address is deleted and sealed out by sea. I select sea shipping");
    }
}