package eksamen.animals;

public class Stable {
  private String location,box,farm;


  public Stable(){}

  public Stable(String location,String box,String farm) {
    this.location = location;
    this.box=box;
    this.farm=farm;
  }

  public void setBox(String box) {
    this.box = box;
  }

  public void setFarm(String farm) {
    this.farm = farm;
  }

  public void setLocation(String location) {
    this.location = location;
  }


    public String getBox() {
    return box;
  }

  public String getFarm() {
    return farm;
  }

  public String getLocation() {
    return location;
  }

  @Override
  public String toString() {
    return  ". I live at the farm "+getFarm()+System.getProperty("line.separator")+"Right at the "+getLocation()+System.getProperty("line.separator")+ " and in the stablebox: " +getBox();
  }
}
