import javax.swing.JOptionPane;

public class Taller {
    public int Vec[][] = new int[20][20];
    public int i, j, n = 0;
    public String cadena = "";
    public String mat = "";
    public boolean flag;

    public void leer() {
        do {
            try {
                n = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "dimension del vector: ", "Taller 26",
                                JOptionPane.PLAIN_MESSAGE));
                flag = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, ingrese un numero", "Taller 26", JOptionPane.PLAIN_MESSAGE);
                flag = true;
            }
        } while (flag);
        ingresar(n);
    }

    public void ingresar(int n) {
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                do {
                    try {
                        Vec[i][j] = Integer.parseInt(
                                JOptionPane.showInputDialog(null,
                                        "ingrese el vector [" + (i + 1) + "][" + (j + 1) + "]",
                                        "Taller 26",
                                        JOptionPane.PLAIN_MESSAGE));
                        flag = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error, ingrese un numero", "Taller26",
                                JOptionPane.PLAIN_MESSAGE);
                        flag = true;
                    }
                } while (flag);
            }
        }
        matriz(n, Vec);
        procesar(n, Vec);
    }

    public void matriz(int n, int Vec[][]) {
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (Vec[i][j] >= 10) {
                    mat += Vec[i][j] + "  ";
                } else {
                    mat += "0" + Vec[i][j] + "  ";
                }
            }
            mat += "\n";
        }
    }

    public void procesar(int n, int Vec[][]) {
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                cadena += "     ";
                if ((i + j) == (n - 2)) {
                    if (Vec[i][j] >= 10) {
                        cadena += Vec[i][j];
                    } else {
                        cadena += "0" + Vec[i][j];
                    }
                }
            }
            cadena += "\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz\n\n" + mat + "\n" + "Diagonal secundaria mayor\n" + cadena,
                "Taller 26", JOptionPane.PLAIN_MESSAGE);
    }
}
