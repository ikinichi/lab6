import task3.Ape;
import task3.Fish;
import task3.Human;

public class Test3 {
   public static void main(String[] args){
       Fish floppy = new Fish(1);
       floppy.setAlive(false);
       if(floppy.isAlive()==false)
           System.out.println("Мои соболезнования");
       Ape garry = new Ape(3,102,135,4);
       garry.cripple(2);
       Human harold = new Human("Harold",32,175,98,3);
       harold.goToWork();
       System.out.println(harold.isDepression());
    }

}
