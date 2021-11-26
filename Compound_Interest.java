import javax.swing.JOptionPane;
public class CompoundInterest
{
   public static void main()
   {
      String pStr = JOptionPane.showInputDialog("Enter the principal value.");
      double p = Double.parseDouble(pStr);
      String rStr = JOptionPane.showInputDialog("Enter the interest rate (in percent).");
      double r2 = Double.parseDouble(rStr);
      double r = r2/100;
      String nStr = JOptionPane.showInputDialog("Enter the number of times it's compounded per year.");
      double n = Double.parseDouble(nStr);
      String tStr = JOptionPane.showInputDialog("Enter the time in years.");
      double t = Double.parseDouble(tStr);
      double A = p * Math.pow(1+(r/n),n*t);
      System.out.println("The value of the account after "+t+" is "+A);
}
}
