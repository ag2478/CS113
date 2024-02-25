public class Dog {

    private int age;
    private String breed;
    
    public Dog(int age, String breed){

        this.age = age;
        this.breed = breed;

    }
    
    public int getAge(){

        return age;

    }

    public String getBreed(){

        return breed;

    }

    public void setAge(){

        this.age = age;

    }

    public void setBreed(){

        this.breed = breed;

    }

    public String toString(){

        return "Breed: " + breed + ", Age: " + age;
    }

    public boolean equals(Dog otherDog){

        if (this.breed == otherDog.breed){

            return true;

        }

        else{

            return false;
        }

    }

    public int compareTo(Dog otherDog){

        if (this.age < otherDog.age){

            return -1;

        }

        else if (this.age > otherDog.age) {

            return 1;

        }

        else{

            return 0;

        }

    }


}
