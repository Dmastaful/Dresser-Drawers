import java.util.*;
public class Dresser{

  private Clothing[][] drawer = new Clothing[5][10];
  
  public Dresser(){
  }
  
  public void add(Clothing cInstance){
    int drawerIdx = 0;
    int clothingIdx = 0;
    if(cInstance.getType().equalsIgnoreCase("undergarment")){
      drawerIdx = 0;
      
      while(clothingIdx<10){
        if(drawer[drawerIdx][clothingIdx]==null){
          drawer[drawerIdx][clothingIdx] = cInstance;
          break;
        }else{
          clothingIdx++;
          if(clothingIdx>=10) System.out.println("The drawer is full.");
        }
      }
      
    }else if(cInstance.getType().equalsIgnoreCase("socks") && cInstance.getType().equalsIgnoreCase("stockings")){
      drawerIdx = 1;
      
      while(clothingIdx<10){
        if(drawer[drawerIdx][clothingIdx]==null){
          drawer[drawerIdx][clothingIdx] = cInstance;
          break;
        }else{
          clothingIdx++;
          if(clothingIdx>=10) System.out.println("The drawer is full.");
        }
      }
      
    }else if(cInstance.getType().equalsIgnoreCase("top")){
      drawerIdx = 2;
      
      while(clothingIdx<10){
        if(drawer[drawerIdx][clothingIdx]==null){
          drawer[drawerIdx][clothingIdx] = cInstance;
          break;
        }else{
          clothingIdx++;
          if(clothingIdx>=10) System.out.println("The drawer is full.");
        }
      }
      
    }else if(cInstance.getType().equalsIgnoreCase("bottom")){
      drawerIdx = 3;
      
      while(clothingIdx<10){
        if(drawer[drawerIdx][clothingIdx]==null){
          drawer[drawerIdx][clothingIdx] = cInstance;
          break;
        }else{
          clothingIdx++;
          if(clothingIdx>=10) System.out.println("The drawer is full.");
        }
      }
      
    }else if (cInstance.getType().equalsIgnoreCase("cape")){
      drawerIdx = 4;
      
      while(clothingIdx<10){
        if(drawer[drawerIdx][clothingIdx]==null){
          drawer[drawerIdx][clothingIdx] = cInstance;
          break;
        }else{
          clothingIdx++;
          if(clothingIdx>=10) System.out.println("The drawer is full.");
        }
      }
      
    }else{}
  }
  
  public void remove(Clothing cInstance){
    int drawerIdx = 0;
    int clothingIdx = 0;
    while(clothingIdx<10){
      if(cInstance.getType().equalsIgnoreCase("undergarment")){
        drawerIdx = 0;
        while(clothingIdx<10){
          if(drawer[drawerIdx][clothingIdx].equals(cInstance)){
            drawer[drawerIdx][clothingIdx] = null;
            break;
          }
          clothingIdx++;
        }
      }else if(cInstance.getType().equalsIgnoreCase("socks") && cInstance.getType().equalsIgnoreCase("stockings")){
        drawerIdx = 1;
        while(clothingIdx<10){
          if(drawer[drawerIdx][clothingIdx].equals(cInstance)){
            drawer[drawerIdx][clothingIdx] = null;
            break;
          }
          clothingIdx++;
        }
      }else if(cInstance.getType().equalsIgnoreCase("top")){
        drawerIdx = 2;
        while(clothingIdx<10){
          if(drawer[drawerIdx][clothingIdx].equals(cInstance)){
            drawer[drawerIdx][clothingIdx] = null;
            break;
          }
          clothingIdx++;
        }
      }else if(cInstance.getType().equalsIgnoreCase("bottom")){
        drawerIdx = 3;
        while(clothingIdx<10){
          if(drawer[drawerIdx][clothingIdx].equals(cInstance)){
            drawer[drawerIdx][clothingIdx] = null;
            break;
          }
          clothingIdx++;
        }
      }else if(cInstance.getType().equalsIgnoreCase("cape")){
        drawerIdx = 4;
        while(clothingIdx<10){
          if(drawer[drawerIdx][clothingIdx].equals(cInstance)){
            drawer[drawerIdx][clothingIdx] = null;
            break;
          }
          clothingIdx++;
        }
      }else{}
    }
  }  

  public void print(){
    for(int i = 0; i < 5; i++){
      System.out.println("Drawer " + i);
      for(int j = 0; j < 10; j++){
        if(drawer[i][j]==null) System.out.print(""); 
        else System.out.print(drawer[i][j]+" ");
      }
      System.out.println("");
    }
  }
}