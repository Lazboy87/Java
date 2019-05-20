package eksamen.animals;

public abstract class animal{



  private String name,generation;
  private int age;

  private Stable stable;



  public animal(){}

  public animal(String generation, String name){
    this.generation= generation;
    this.name=name;

  }

  public animal(String generation, String name,int age){
    this.generation= generation;
    this.name=name;
    this.age =age;
  }

  public animal(String generation, String name,int age,Stable stable){
    this.generation= generation;
    this.name=name;
    this.age =age;
    this.stable=stable;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getGeneration() {
    return generation;
  }

  public String getName() {
    return name;
  }




  @Override
  public abstract String toString();




          }