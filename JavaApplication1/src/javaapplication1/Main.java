package javaapplication1;
public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        new Login_page().setVisible(true);
    }
});
    }
}
