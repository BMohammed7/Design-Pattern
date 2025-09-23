# Software Design & Architecture Assignment 1 (Smart Home Devices)

**Author(s):** Hanzalah Imran, Mohid Sohail, Burhanuddin Mohammed

> This project applies the Abstract Factory and Factory Method design patterns to build and manage smart home devices.
> We created an interface that both factories use to make the smart devices.
---

## Repository Contents

- `uml diagram/`  
  Contains the class diagrams and any other designs we might have used (PNG, SVG).

- `factory/`  
  **Factory (Interface):** Declares the `make()` method and acts as the product interface that all concrete products (bulb, lock) must implement.

- `SmartBulb` (Interface – Abstract Product)  
  Defines what every smart bulb must do (configure usage, return, print itself).

- `SmartLock` (Interface – Abstract Product)  
  Defines what every smart lock must do (configure usage, return, print itself).

- `UsageDataReader` (Utility – Helper Class)  
  Not a part of Abstract Factory directly. Provides the actual "energy usage" values. Every bulb/lock depends on this class to simulate consumption.

- `BrandASmartBulb` (Concrete Product – implements SmartBulb)  
  Represents a Brand A smart bulb. Uses `UsageDataReader` to simulate usage.

- `BrandBSmartBulb` (Concrete Product – implements SmartBulb)  
  Same idea as Brand A's bulb, but for Brand B.

- `BrandASmartLock` (Concrete Product – implements SmartLock)  
  Represents a Brand A smart lock. Uses `UsageDataReader`.

- `BrandBSmartLock` (Concrete Product – implements SmartLock)  
  Same as above, but for Brand B.

- `SmartDeviceFactory` (Interface – Abstract Factory)  
  Defines methods that all factories must provide: a way to create a bulb and a lock.

- `BrandFactoryA` (Concrete Factory)  
  Knows how to create Brand A devices.

- `BrandFactoryB` (Concrete Factory)  
  Knows how to create Brand B devices.

- `Main` (Test/Demo Class – Client)  
  Uses the Abstract Factory pattern to create devices without knowing their exact brand. This shows how easy it is to swap brands without changing the client code.
