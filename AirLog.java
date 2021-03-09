package kz.aitu.oop.assignment6;

public class AirLog  extends Log {
    public Transport identifyTrans() {
        return new AirPlane();};
    public void reasonDistribute () {
        System.out.println("In  this case, it is approachable to use sea, so I will use sea in order to deliver products");};
}
