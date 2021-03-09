package kz.aitu.oop.assignment6;

public class Road_log extends Logistics {
    public Traffic newTraffic() {
        return new Lorry();
    }
    public void importationPlan () {
        System.out.println("The address is near, so I select road shipping");
    }
}
