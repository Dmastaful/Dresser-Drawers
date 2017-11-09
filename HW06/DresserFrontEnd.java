import java.util.*;
public class DresserFrontEnd{

  public static void main(String[] args){
    
    Scanner kb = new Scanner(System.in);
    Clothing clothing = new Clothing();
    Dresser drawers = new Dresser();
    
    int input = 9;
    while(input!=0){
      input = kb.nextInt();
      kb.nextLine();
      switch(input){
        case 1:
          System.out.print("Input a type of clothing: ");
          clothing.setType(kb.nextLine());
          System.out.print("Input the clothing's color: ");
          clothing.setColor(kb.nextLine());
          System.out.println(clothing.toString());
          drawers.add(clothing);
          break;
        case 2:
          System.out.print("Input a type of clothing: ");
          clothing.setType(kb.nextLine());
          System.out.print("Input the clothing's color: ");
          clothing.setColor(kb.nextLine());
          break;
        case 3:
          drawers.print();
      }
    }
  }
}