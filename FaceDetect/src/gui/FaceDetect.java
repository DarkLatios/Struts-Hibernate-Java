

package gui;





import java.lang.String;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;


public class FaceRecognizer extends Algorithm {

    protected FaceRecognizer(long addr) { super(addr); }

    
    /**
     *
     * @param filename
     */
    public  void load(String filename)
    {

        load_0(nativeObj, filename);

        return;
    }
    
    
    
    
    public  void predict(Mat src, int[] label, double[] confidence)
    {
        double[] label_out = new double[1];
        double[] confidence_out = new double[1];
        predict_0(nativeObj, src.nativeObj, label_out, confidence_out);
        if(label!=null) {
            label[0] = (int)label_out[0];
        }
        if(confidence!=null) {
            confidence[0] = (double)confidence_out[0];
        }
        return;
    }
    
    
    
    
     public  void save(String filename)
    {

        save_0(nativeObj, filename);

        return;
    }
     
     
     
     
     
      public  void train(List<Mat> src, Mat labels)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        train_0(nativeObj, src_mat.nativeObj, labels.nativeObj);

        return;
    }
      
      
      
      
      public  void update(List<Mat> src, Mat labels)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        update_0(nativeObj, src_mat.nativeObj, labels.nativeObj);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void FaceRecognizer::load(string filename)
    private static native void load_0(long nativeObj, String filename);

    // C++:  void FaceRecognizer::predict(Mat src, int& label, double& confidence)
    private static native void predict_0(long nativeObj, long src_nativeObj, double[] label_out, double[] confidence_out);

    // C++:  void FaceRecognizer::save(string filename)
    private static native void save_0(long nativeObj, String filename);

    // C++:  void FaceRecognizer::train(vector_Mat src, Mat labels)
    private static native void train_0(long nativeObj, long src_mat_nativeObj, long labels_nativeObj);

    // C++:  void FaceRecognizer::update(vector_Mat src, Mat labels)
    private static native void update_0(long nativeObj, long src_mat_nativeObj, long labels_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
