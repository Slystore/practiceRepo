Given the following classes:
sample/Animal.java	 	 		 	 	
package sample;
public abstract class Animal {
  protected int age;
  protected abstract String noise();
  protected abstract boolean canFly();
  public Animal(int age) {
    this.age = age;
  }
  protected int getAge() {
    return age;
  }
  @Override
  public String toString() {
    // this.getClass().getSimpleName() -> prints this class name
    // this.getClass().getSuperclass().getSimpleName() -> prints this super class name
    String val = "-Animal:\t" + this.getClass().getSimpleName() + "\n";
    val += "-Type:\t\t" + this.getClass().getSuperclass().getSimpleName() + "\n";
    val += "-Noise:\t" + this.noise() + "\n";  val += "-Age:\t\t" + this.getAge() + "\n";
    val += "-Can fly:\t" + this.canFly();
    return val;
  }
}
sample/Test.java
package sample;
public class Test {
  public static void main(String[] args) {
    printAnimal(new Dog(2));     printAnimal(new Cat(1));     printAnimal(new Duck(3));
  }
  private static void printAnimal(Animal animal) {
    System.out.println("----------");
    System.out.println(animal.toString());
  }
}

Implement required classes to get this output when Test is executed:
----------
-Animal:	Dog
-Type:		Mammal
-Noise:	wow
-Age:		2
-Can fly:	false
----------
-Animal:	Cat
-Type:		Mammal
-Noise:	meow
-Age:		1
-Can fly:	false
----------
-Animal:	Duck
-Type:		Bird
-Noise:	cuac
-Age:		3
-Can fly:	true


You are given an array of integers. 
	Write an algorithm that brings all nonzero elements to the left of the array, 
	and returns the number of nonzero elements. 
	The algorithm should operate in place, i.e. shouldn't create a new array. 
	The order of the nonzero elements does not matter. 
	The numbers that remain in the right portion of the array can be anything. 
	Example: given the array [ 1, 0, 2, 0, 0, 3, 4 ], 
	a possible answer is [ 4, 1, 3, 2, ?, ?, ? ], 4 non-zero elements, where "?" can be any number. 
	Code should have good complexity and minimize the number of writes to the array.
	*/

	[ 1, 0, -2, 0, 0, 3, 4, 0, 0]
	[ 4, 1, 3, -2, ?, ?, ? ] return 4

- What is the complexity of your algorithm?
