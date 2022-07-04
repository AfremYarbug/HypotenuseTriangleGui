import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    double x;
    double y;
    double z;

    x =
      Double.parseDouble(JOptionPane.showInputDialog(null, "What is side x?"));
    y =
      Double.parseDouble(JOptionPane.showInputDialog(null, "What is side y?"));

    z = Math.sqrt((x * x) + (y * y));

    JOptionPane.showMessageDialog(null, "Side z is " + z);
  }
}
