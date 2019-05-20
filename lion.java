package eksamen.animals;

public class lion extends animal {

  private String name,generation;
  private int age;

  private Stable stable;

  public lion(){}

  public lion(String name,String generation){

    this.name =name;

    this.generation= generation;}

  public lion(String name,String generation,int age){

      this.name =name;
      this.age = age;
      this.generation= generation;}


  public lion(String generation, String name,int age,Stable stable){
    this.generation= generation;
    this.name=name;
    this.age =age;
    this.stable=stable;
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



  @Override
  public String toString() {
    return "My name is: " +getName()+System.getProperty("line.separator")
            +" IM a lion "+System.getProperty("line.separator")
            +" My generation is: "+ getGeneration()
            +System.getProperty("line.separator")
            +" MY age is: "+getAge();
  }
}
