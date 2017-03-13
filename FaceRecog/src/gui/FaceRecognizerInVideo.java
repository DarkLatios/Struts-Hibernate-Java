/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.sun.org.apache.xalan.internal.xsltc.dom.LoadDocument;
import java.awt.Frame;
import java.io.File; 
 
 
 import java.awt.Graphics; 
 import java.awt.Image; 
import java.awt.Rectangle;
 import java.awt.image.BufferedImage; 
 import java.io.ByteArrayInputStream; 
import java.io.IOException;
import java.util.List;
 import javax.imageio.ImageIO; 
import org.opencv.contrib.FaceRecognizer;
 import org.opencv.core.Core; 
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
import org.opencv.utils.Converters;

 
 
 /** 
  * This is an example how to detect face in a video file with javacv 
  * @author Vincent He (chinadragon0515@gmail.com) 
  * 
  */ 
 public class FaceRecognizerInVideo extends javax.swing.JFrame {
     class DaemonThread implements Runnable{
        DaemonThread myThread = null; 
     int count = 0; 
     VideoCapture webSource = null; 
     Mat frame = new Mat(); 
     MatOfByte mem = new MatOfByte();
 
     
     public  void main(String[] args) throws Exception {
        if (args.length < 2) { 
             System.out.println("Two parameters are required to run this program, first parameter is the analized video and second parameter is the trained result for fisher faces."); 
         } 
 
 
         String videoFileName = args[0]; 
         String trainedResult = args[1]; 
 
 
         CascadeClassifier face_cascade = new CascadeClassifier( 
                 "data\\haarcascade_frontalface_default.xml"); 
          lbphFaceRecognizer lbph=new lbphFaceRecognizer();
        lbph.LoadDocument(trainedResult);
 
 
         File f = new File(videoFileName); 
 
 
         VideoCapture webSource = null;  
         try {
             
             
            webSource.retrieve(frame);
             webSource.grab(); 
         } catch (Exception e) { 
             System.err.println("Failed start the grabber."); 
         } 
 
 
         
         Mat videoMat = new Mat(); 
         while (true) { 
             Frame vf=null;
               vf = webSource.grab();
             videoMat =Converters.vector_double_to_Mat((List<Double>) vf);
             Mat videoMatGray = new Mat(); 
             // Convert the current frame to grayscale: 
 
 
             Point p = new Point(); 
             Rect faces = new Rect(); 
             // Find the faces in the frame: 
             face_cascade.detectMultiScale(vf,faces); 
 
 
             // At this point you have the position of the faces in 
             // faces. Now we'll get the faces, make a prediction and 
             // annotate it in the video. Cool or what?
             Size k=  faces.size();
             { 
                 Rect face_k=null; 
               
 
 
                 Mat face = new Mat(videoMatGray, face_k); 
                 // If fisher face recognizer is used, the face need to be 
                 // resized. 
                 // resize(face, face_resized, new Size(im_width, im_height), 
                 // 1.0, 1.0, INTER_CUBIC); 
 
 
                 // Now perform the prediction, see how easy that is: 
                 int prediction = lbph
 
 
                 // And finally write all we've found out to the original image! 
                 // First of all draw a green rectangle around the detected face: 
 
                Core.rectangle(face, face_k, p, videoFrame);
                 // Create the text we will annotate the box with: 
                 String box_text = "Prediction = " + prediction; 
                 // Calculate the position for annotated text (make sure we don't 
                 // put illegal values in there): 
                 int pos_x = (int) Math.max(face_k.tl().x - 10, 0); 
                 int pos_y = (int) Math.max(face_k.tl().y - 10, 0); 
                 // And now put it into the image: 
                 Core.putText(videoMat, box_text, new Point(pos_x, pos_y),Core.FONT_HERSHEY_PLAIN, 1.0, new Scalar(0, 255, 0, 2.0)); 
              
             // Show the result: 
           videoFrame("face_recognizer", videoMat); 
 
 
             char key = (char) waitKey(20); 
             // Exit this loop on escape: 
             if (key == 27) { 
                 destroyAllWindows(); 
               break; 
             } 
         } 
    } 


        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
 } 

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
 }
 }