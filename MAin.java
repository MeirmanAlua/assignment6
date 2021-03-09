package kz.aitu.oop.assignment6;

public class MAin {
    public static void main(String[] args) {
        Log logistics = new RoadLog();
        Transport delivery = logistics.identifyTrans();
        logistics.reasonDistribute();
        delivery.distribute();
    }
}
//https://refactoring.guru/design-patterns/factory-method - implement factory method looking at the example with Logistics

     //   upload everything to git repository