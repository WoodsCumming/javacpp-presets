// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;


/////////////////////////// Hough Transform ////////////////////////////

//////////////////////////////////////
// HoughLines

/** \addtogroup cudaimgproc_hough
 *  \{
<p>
/** \brief Base class for lines detector algorithm. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class HoughLinesDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HoughLinesDetector(Pointer p) { super(p); }

    /** \brief Finds lines in a binary image using the classical Hough transform.
    <p>
    @param src 8-bit, single-channel binary source image.
    @param lines Output vector of lines. Each line is represented by a two-element vector
    {@code (\rho, \theta)} . {@code \rho} is the distance from the coordinate origin {@code (0,0)} (top-left corner of
    the image). {@code \theta} is the line rotation angle in radians (
    {@code 0 \sim \textrm{vertical line}, \pi/2 \sim \textrm{horizontal line}} ).
    @param stream Stream for the asynchronous version.
    <p>
    @see HoughLines
     */
    public native void detect(@ByVal Mat src, @ByVal Mat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal Mat src, @ByVal Mat lines);
    public native void detect(@ByVal UMat src, @ByVal UMat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal UMat src, @ByVal UMat lines);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat lines, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void detect(@ByVal GpuMat src, @ByVal GpuMat lines);

    /** \brief Downloads results from cuda::HoughLinesDetector::detect to host memory.
    <p>
    @param d_lines Result of cuda::HoughLinesDetector::detect .
    @param h_lines Output host array.
    @param h_votes Optional output array for line's votes.
    @param stream Stream for the asynchronous version.
     */
    public native void downloadResults(@ByVal Mat d_lines, @ByVal Mat h_lines, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat h_votes, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void downloadResults(@ByVal Mat d_lines, @ByVal Mat h_lines);
    public native void downloadResults(@ByVal UMat d_lines, @ByVal UMat h_lines, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat h_votes, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void downloadResults(@ByVal UMat d_lines, @ByVal UMat h_lines);
    public native void downloadResults(@ByVal GpuMat d_lines, @ByVal GpuMat h_lines, @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat h_votes, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void downloadResults(@ByVal GpuMat d_lines, @ByVal GpuMat h_lines);

    public native void setRho(float rho);
    public native float getRho();

    public native void setTheta(float theta);
    public native float getTheta();

    public native void setThreshold(int threshold);
    public native int getThreshold();

    public native void setDoSort(@Cast("bool") boolean doSort);
    public native @Cast("bool") boolean getDoSort();

    public native void setMaxLines(int maxLines);
    public native int getMaxLines();
}
