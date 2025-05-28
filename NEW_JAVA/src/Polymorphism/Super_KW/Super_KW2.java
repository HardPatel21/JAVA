/*
✈ Problem Statement 1: Airplane System with Multi-Level Inheritance

Title: Build an Inheritance Hierarchy for an Airplane System Using super

Objective:
Design a class hierarchy to model an airplane system. The system should consist of:

🔹 Class Aircraft (Base Class)

* Fields: manufacturer, maxSpeed, altitude
* Constructor to initialize these fields
* Method fly() that prints:
  "Aircraft by [manufacturer] is flying at altitude [altitude] feet with max speed [maxSpeed] km/h"

🔹 Class CommercialPlane (Extends Aircraft)

* Additional field: passengerCapacity
* Overrides fly() method:

  * First call super.fly() to reuse parent logic
  * Then print:
    "Commercial plane can carry [passengerCapacity] passengers"

🔹 Class CargoPlane (Extends Aircraft)

* Additional field: cargoCapacity
* Overrides fly() method similarly, adding:
  "Cargo plane can carry [cargoCapacity] tons of cargo"

🔹 Class HybridPlane (Extends CommercialPlane)

* Additional field: dualModeType (e.g., "passenger-cargo")
* Overrides fly() again to include:

  * super.fly() to get commercial flight details
  * Then print:
    "Hybrid plane supports mode: [dualModeType]"

Requirements:

* Use super in each constructor to initialize parent class attributes
* Use super to call overridden fly methods
* Demonstrate polymorphism by creating objects of all 3 subclasses and calling fly() on each

Goal:
Build a layered flight system that shows how super works across multiple levels of inheritance, with method overriding and constructor chaining.

---

*/

package Polymorphism.Super_KW;

import Polymorphism.IIB.IIB_Vehicle;

public class Super_KW2 {
    public static void main(String[] args) {
        CommercialPlane c = new CommercialPlane("Air India", 5000.80, 500.90, 200);
        CargoPlane ca = new CargoPlane("Indigo", 5500.25, 400.34, 250);
        HybridPlane h = new HybridPlane("SouthWest Airlines", 4000.67, 600.00, 350, "passenger-cargo");

        c.fly();
        ca.fly();
        h.fly();
    }
}
