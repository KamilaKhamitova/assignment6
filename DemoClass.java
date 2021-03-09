package kz.aitu.oop.assignment6;

import java.util.Scanner;

public class DemoClass {

    public static void main(String[] args) {
        System.out.print("Enter the case: ");
        Scanner sc = new Scanner(System.in);
        String traffic = sc.nextLine();
        Logistics case1 = newLogistics(traffic);
        Traffic transport = case1.newTraffic();
        case1.importationPlan();
        transport.importation();
    }
    public static Logistics newLogistics(String traffic){
        if(traffic.equals("Vessel")){
            return new Sea_log();
        } if(traffic.equals("Lorry")){
            return new Road_log();
        } else {
            return null;
        }
    }
}