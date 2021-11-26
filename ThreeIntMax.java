import javax.swing.JOptionPane;
public class ThreeIntMax
{
   public static void main()
   {
      String iStr = JOptionPane.showInputDialog("Enter an integer.");
      int i = Integer.parseInt(iStr);
      String i2Str = JOptionPane.showInputDialog("Enter another integer");
      int i2 = Integer.parseInt(i2Str); 
      String i3Str = JOptionPane.showInputDialog("Enter another integer again.");
      int i3 = Integer.parseInt(i3Str);
      int num = Math.max(i,i2);
      int num2 =Math.max(i2,i3);
      int num3 = Math.max(num,num2);
      System.out.println(num3+" is the largest value");
}
}
