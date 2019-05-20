package eksamen.animals;

public class goat extends animal implements Feedable {

  private String favouritefood;
  private String name,generation;
  private int age;

  private Stable stable;

public goat(){}


  public goat(String name,String generation){

    this.name =name;
    this.generation= generation;}



  public goat(String name,String generation,int age){

    this.name =name;
    this.age = age;
    this.generation= generation;

  }


  public goat(String name,String generation, int age, String favouritefood){

  this.name =name;
  this.age = age;
  this.generation= generation;
  this.favouritefood = favouritefood;
}

  public goat( String name,String generation,int age,Stable stable,String favouritefood){
    this.generation= generation;
    this.name=name;
    this.age =age;
    this.stable=stable;
    this.favouritefood = favouritefood;
  }

  public void setFavouritefood(String favouritefood) {
    this.favouritefood = favouritefood;
  }


  public String getFavouritefood() {
    return favouritefood;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public void setGeneration(String generation) {
    this.generation = generation;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getGeneration() {
    return generation;
  }

  @Override
  public int getAge() {
    return age;
  }

  public String feedanimal(String Food){

  if (Food == favouritefood){
    return "you have feed "+getName()+" some "+Food+  ", "+getName()+" likes the "+Food+" you feed him";}
  else{
    return "you have feed "+getName()+" some "+Food+", " +getName()+" does not!! like the "+Food+" you feed him";}
}


  @Override
  public String toString() {
    return "My name is: " +this.getName()+
            System.getProperty("line.separator") +"Im a: goat "+System.getProperty("line.separator")+
            "My generation is: "+ this.getGeneration()+System.getProperty("line.separator")+
            "My age is: "+this.getAge() + System.getProperty("line.separator")+
            stable.toString()+ System.getProperty("line.separator")+
            "I am pleased if you feed me favoriteFood "+this.getFavouritefood();
  }
}
