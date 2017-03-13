package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics; 
 import java.awt.Image; 
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.TextField;
 import java.awt.image.BufferedImage; 
 import java.io.ByteArrayInputStream; 
import java.io.File;
import java.io.IOException;
 import javax.imageio.ImageIO; 
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.opencv.contrib.FaceRecognizer;
 import org.opencv.core.Core; 
import org.opencv.core.CvType;
 import org.opencv.core.Mat; 
 import org.opencv.core.MatOfByte; 
 import org.opencv.core.MatOfRect; 
 import org.opencv.core.Point; 
 import org.opencv.core.Rect; 
 import org.opencv.core.Scalar; 
 import org.opencv.core.Size; 
 import org.opencv.highgui.Highgui; 
 import org.opencv.highgui.VideoCapture; 
 import org.opencv.imgproc.Imgproc; 
 import org.opencv.objdetect.CascadeClassifier; 
import sun.awt.image.PNGImageDecoder;
import org.opencv.objdetect.Objdetect;
public class FaceDetection extends javax.swing.JFrame {

Label l1,l2;
 TextField t1,t2;
   
    private DaemonThread myThread = null; 
     int count = 0; 
     VideoCapture webSource = null; 
     Mat frame = new Mat(); 
     Mat frame1=new Mat();
     MatOfByte mem = new MatOfByte(); 
     CascadeClassifier faceDetector = new CascadeClassifier(FaceDetection.class.getResource("haarcascade_frontalface_alt.xml").getPath().substring(1)); 
     MatOfRect faceDetections = new MatOfRect();
      private static class jFileChooser {
        private static int APPROVE_OPTION;
        

        public jFileChooser() {
        }
    }
     class DaemonThread implements Runnable { 
 
 
         protected volatile boolean runnable = false; 
 
 
         @Override 
         public void run() { 
             synchronized (this) { 
                 while (runnable) { 
                     if (webSource.grab()) { 
                         try { 
                             webSource.retrieve(frame); 
                             Graphics g = getGraphics();
                             faceDetector.detectMultiScale(frame, faceDetections); 
                             for (Rect rect : faceDetections.toArray()) { 
               Core.rectangle(frame, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), 
                                         new Scalar(0, 255,0));
               String boxtext="ASSASSIN";
               Core.putText(frame, boxtext,new Point(rect.x, rect.y),Core.FONT_HERSHEY_PLAIN+Core.FONT_ITALIC,1.0,new Scalar(0, 255,0));                  
    System.out.println(new Point(rect.x, rect.y)+"\t"+new Point(rect.x + rect.width, rect.y + rect.height));//previous begin
    
    
                           
    
                             }//previous ends  
                             Highgui.imencode(".bmp",frame, mem); 
                             Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray())); 
                             BufferedImage buff = (BufferedImage) im; 
                            if (g.drawImage(buff, 0, 0, getWidth(), getHeight()-150 , 0, 0, buff.getWidth(), buff.getHeight(), null))//previous 
                            
                            
                            
                            
                            {//previous ends
                            System.out.println("Frame 1 is running");
                                { 
                                 if (runnable == false) {
                                     System.out.println("Paused ..... "); 
                                     this.wait(); 
                                } 
                             }
                            }
                         } catch (IOException | InterruptedException ex) { 
                             System.out.println("Error"); 
                         } 
                     } 
                 } 
             } 
         } 
    } 
 
 
 
class FacePanel extends javax.swing.JFrame{  
     private static final long serialVersionUID = 1L;  
     private BufferedImage image;  
     // Create a constructor method  
     public FacePanel(){  
          super();   
     }  
     /*  
      * Converts/writes a Mat into a BufferedImage.  
      *   
      * @param matrix Mat of type CV_8UC3 or CV_8UC1  
      * @return BufferedImage of type TYPE_3BYTE_BGR or TYPE_BYTE_GRAY  
      */       
     public boolean matToBufferedImage(Mat matrix) {  
          MatOfByte mb=new MatOfByte();  
          Highgui.imencode(".jpg", matrix, mb);  
          try {  
               this.image = ImageIO.read(new ByteArrayInputStream(mb.toArray()));  
          } catch (IOException e) {  
               return false; // Error  
          }  
       return true; // Successful  
     }  
     public void paintComponent(Graphics g){  
          super.paintComponents(g);   
          if (this.image==null) {
             return;
         }         
           g.drawImage(this.image,10,10,this.image.getWidth(),this.image.getHeight(), null);
           System.out.println("Image Drawn");
     }
 
}  //previous begins
 














public FaceDetection() {//previous ends
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jButton1.setLabel("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Snapshot");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Pause");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton1)
                .addGap(104, 104, 104)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        webSource =new VideoCapture(0);
        myThread = new DaemonThread();
            Thread t = new Thread(myThread);
            t.setDaemon(true);
            myThread.runnable = true;
            t.start();
			 jButton1.setEnabled(false);  //start button
            jButton2.setEnabled(true);  // stop button
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        myThread.runnable = false;
            jButton2.setEnabled(false);   
            jButton1.setEnabled(true);
            
            webSource.release();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int returnVal = jFileChooser1.showSaveDialog(this);
if(returnVal==JFileChooser.APPROVE_OPTION){
File file=jFileChooser1.getSelectedFile();
Highgui.imwrite(file.getPath(),frame);
System.out.println("Frame is Captured");

}
else
{
System.out.println("File Access Cancelled");      
    }                                        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        
        
        
        
     
  //previous
         System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
         
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FaceDetection().setVisible(true);
               
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

