import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Main {
    public static void main(String[] args) throws Exception {
        String a;
        Taller Main;
        Integer b = 0;
        Integer c = 0;
        UIManager.put("OptionPane.background", new ColorUIResource(49, 192, 227));
        UIManager.put("Panel.background", new ColorUIResource(49, 192, 227));
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(255, 255, 255));
        do {
            Main = new Taller();
            Main.leer();
            do {
                a = JOptionPane.showInputDialog(null, "Desea volver a ejecutar? s/n", "Taller26",
                        JOptionPane.PLAIN_MESSAGE);
                if (a.equals("n")) {
                    System.exit(0);
                } else if (a.equals("s")) {
                    b = 1;
                    c = 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Error, ingrese s/n", "Taller 26",
                            JOptionPane.PLAIN_MESSAGE);
                    c = 2;
                }
            } while (c != 1);
        } while (b == 1);

    }
}
