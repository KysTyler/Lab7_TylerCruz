package lab7_tylercruz;

import javax.swing.JProgressBar;

public class Thread2 extends Thread{
     private JProgressBar JProgressBar_Empleado2;
     private boolean vive;
    public Thread2() {
    }

    public Thread2(JProgressBar JProgressBar_Empleado2) {
        this.JProgressBar_Empleado2 = JProgressBar_Empleado2;
        this.vive = true;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
     @Override
    public void run() {
        while (vive) {
//                int d = 1;
//                if (JProgressBar_Empleado1.getValue() > 0) {
//                    d = JProgressBar_Empleado1.getValue();
//                }
//                progBar_c.setValue(progBar_c.getMaximum()
//                        - d / (Integer.parseInt(
//                                sp_consumo.getValue().toString()))
//                );
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException ex) {
//            }
        }

    }
    
    
}
