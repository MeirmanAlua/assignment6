package kz.aitu.oop.assignment6;

public class RoadLog extends Log {
	public Transport identifyTrans() {
		return new Truck();
	};
	public void reasonDistribute () {
		System.out.println("In this case, it is approachable to use road, so I will use road in order to deliver products");};
}
