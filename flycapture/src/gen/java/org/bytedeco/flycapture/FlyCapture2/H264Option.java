// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Options for saving H264 files. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class H264Option extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public H264Option(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public H264Option(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public H264Option position(long position) {
            return (H264Option)super.position(position);
        }
    
        /** Frame rate of the stream */
        public native float frameRate(); public native H264Option frameRate(float frameRate);

        /** Width of source image */
        public native @Cast("unsigned int") int width(); public native H264Option width(int width);

        /** Height of source image */
        public native @Cast("unsigned int") int height(); public native H264Option height(int height);

        /** Bitrate to encode at */
        public native @Cast("unsigned int") int bitrate(); public native H264Option bitrate(int bitrate);

        /** Reserved for future use */
        public native @Cast("unsigned int") int reserved(int i); public native H264Option reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public H264Option() { super((Pointer)null); allocate(); }
        private native void allocate();
    }