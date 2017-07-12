

public class Dog {
	/*Ñreate class Dog with fields name, breed, age. 
	Declare enum for field breed. 
	Create 3 instances of type Dog. 
	Check if there is no two dogs with the same name. 
	Display the name and the kind of the oldest dog. 
	*Add Unit Tests to each task, publish code on GitHub*/

	
	public enum Breed{
		Labrador, Bulldogs, Siberian_Huskies; 
		}
	private String name;
	private Breed breed;
	private int age;
	
	Dog(String name,Breed breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name =name;
	}
	public Breed getBreed(){
		return breed;
	}
	public void setBreed(Breed breed){
		this.breed = breed;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean EqualsName(Dog dogs){
		return this.name.equals(dogs.name);
	}
	
	@Override
	public String toString() {
		return  "Name: " + name + ". Age: "+  age + ". Breed: " + breed;
	}
	 
	static boolean sameDog(Dog dogA,Dog dogB)
	    {    
	      if(dogA.name.equals(dogB.name))
	         return true;  
	      else
	    return false;
	    }
	 
	 public String name_kind() {
			return "name: " + this.name + ", breed: " + this.breed;
		}

	 public boolean oldest(Object obj){
			Dog other = (Dog)obj;
			return this.age > other.age;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Buddy",Breed.Labrador,3);
		Dog dog2 = new Dog("Rocky",Breed.Siberian_Huskies,1);
		Dog dog3 = new Dog("Buddy",Breed.Bulldogs,5);   
	
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		System.out.println("If dog1 and dog2 have the same name, the result will be 'true', if not something 'false':");
		System.out.println(sameDog(dog1,dog2));
		System.out.println("If dog1 and dog3 have the same name, the result will be 'true', if not something 'false':");
	    System.out.println(sameDog(dog1,dog3));
	    System.out.println("If dog2 and dog3 have the same name, the result will be 'true', if not something 'false':");
	    System.out.println(sameDog(dog2,dog3)); 
	        

	    if(dog1.oldest(dog2) && dog1.oldest(dog3)) {
			System.out.println("Oldest: " + dog1.name_kind());
		}
		else {
			if(dog2.oldest(dog1) && dog2.oldest(dog3)) {
				System.out.println("Oldest: " + dog2.name_kind());
			}
			else {
				System.out.println("Oldest: " + dog3.name_kind());
			}
		}
	    
	    
	 
	}
	   

}
