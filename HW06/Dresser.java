import java.util.*;
public class Dresser{

  private Clothing[][] drawer = new Clothing[5][10];
  
  public Dresser(){
  }
  
  public int drawerIdx = 0;
  public void add(Clothing cInstance){
    if(cInstance.getType().equalsIgnoreCase("Undergarment") && drawerIdx < 10){
      drawer[drawerIdx][0]=cInstance;
      drawerIdx += 1;
    }else if(cInstance.getType().equalsIgnoreCase("Socks") && cInstance.getType().equalsIgnoreCase("Stockings") && drawerIdx < 10){
      drawer[drawerIdx][1]=cInstance;
      drawerIdx += 1;
    }else if(cInstance.getType().equalsIgnoreCase("Top") && drawerIdx < 10){
      drawer[drawerIdx][2]=cInstance;
      drawerIdx += 1;
    }else if(cInstance.getType().equalsIgnoreCase("Bottom") && drawerIdx < 10){
      drawer[drawerIdx][3]=cInstance;
      drawerIdx += 1;
    }else if(cInstance.getType().equalsIgnoreCase("Capes") && drawerIdx < 10){
      drawer[drawerIdx][4]=cInstance;
      drawerIdx += 1;
    }
    else{System.out.println("This drawer is full");}
  }
  
  public void remove(Clothing cInstance){
    if(cInstance.equals(cInstance)){
      cInstance = null;
    }
  }
  public void print(){
    System.out.println(Arrays.toString(drawer));
  }
}