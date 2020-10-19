/*
MIT License

Copyright (c) 2020 Jean-Jacques François Reibel

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

class Car{
    int wheels = 0;
    int doors = 0;
    int cylinders = 0;
    public Car(int wheels, int doors, int cylinders){
      this.wheels = wheels;
      this.doors = doors;
      this.cylinders = cylinders;
    }

    void addWheels(int wheels){
      this.wheels = this.wheels + wheels;
    }

    void addDoors(int doors){
      this.doors = this.doors + doors;
    }

    void addCylinder(int cylinders){
      this.cylinders = this.cylinders + cylinders;
    }

    void deleteWheels(int wheels){
      this.wheels = this.wheels - wheels;
    }

    void deleteDoors(int doors){
      this.doors = this.doors - doors;
    }

    void deleteCylinder(int cylinders){
      this.cylinders = this.cylinders - cylinders;
    }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Creating car.");
    Car subaru = new Car(4, 4, 4);
    System.out.println("Adding wheel directly to car object.");
    subaru.wheels = 5;
    System.out.println("Wheels check: " + subaru.wheels);
    System.out.println("Doors check: " + subaru.doors);
    System.out.println("Cylinders check: " + subaru.cylinders);
    System.out.println("");
    System.out.println("Removing wheel using class method.");
    subaru.deleteWheels(1);
    System.out.println("Wheels check: " + subaru.wheels);
    System.out.println("Doors check: " + subaru.doors);
    System.out.println("Cylinders check: " + subaru.cylinders);
    System.out.println("");
  }
}