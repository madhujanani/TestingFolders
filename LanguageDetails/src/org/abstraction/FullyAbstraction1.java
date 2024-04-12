package org.abstraction;

public interface FullyAbstraction1 {
	/*    Project   :BikeInformation
     Package   :org.bike
     Interface :Bike
     Methods   :cost(),speed()

     Class     :Ktm
     Methods   :cost(),speed()

Description:
cost(),speed() is just a templete in Bike Interface and You have to override the method cost(),speed() in Ktm class.
*/
 void cost(int rate);
 void speed(float km);

}
