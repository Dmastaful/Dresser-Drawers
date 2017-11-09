public class Clothing{

  private String type;
  private String color;
  
  public Clothing(){
    this.type = "Top";
    this.color = "Red";
  }
  public Clothing(String inputType, String inputColor){
   setType(inputType);
   setColor(inputColor);
  }
  public void setType(String input){
    this.type = input;
  }
  public String getType(){
    return type;
  }
  public void setColor(String input){
    this.color = input;
  }
  public String getColor(){
    return color;
  }
  public String toString(){
    return getType() + " " + getColor();
  }
  public boolean equals(Clothing instance){
    boolean bool = true;
    if(instance.type.equals(type) && instance.color.equals(color)) {bool=true;}
    else {bool = false;}
     return bool;
  }
}