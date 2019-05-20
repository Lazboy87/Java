package eksamen.animals;

public class Testanimal {

public static void main (String[]args){


Stable thefarm = new Stable("lake","BOX1","Erlandsgaard");

goat g1 = new goat("Billy","First gen",14,thefarm,"Tincan");


System.out.println(System.getProperty("line.separator")+g1);

System.out.println(System.getProperty("line.separator")+g1.feedanimal("Spinnach"));



System.out.println(System.getProperty("line.separator")+g1.feedanimal("Tincan"));



lion L1=new lion("Tywin","Second gen",25);
System.out.println(System.getProperty("line.separator")+L1);

  }




}
