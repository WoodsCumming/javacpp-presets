// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Name("PyArrayIterObject_tag") @Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayIterObject extends PyObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayIterObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayIterObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayIterObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayIterObject position(long position) {
        return (PyArrayIterObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyArrayIterObject ob_base(PyObject ob_base);
        public native int nd_m1(); public native PyArrayIterObject nd_m1(int nd_m1);            /* number of dimensions - 1 */
        public native @Cast("npy_intp") long index(); public native PyArrayIterObject index(long index);
        public native @Cast("npy_intp") long size(); public native PyArrayIterObject size(long size);
        public native @Cast("npy_intp") long coordinates(int i); public native PyArrayIterObject coordinates(int i, long coordinates);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer coordinates();/* N-dimensional loop */
        public native @Cast("npy_intp") long dims_m1(int i); public native PyArrayIterObject dims_m1(int i, long dims_m1);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer dims_m1();    /* ao->dimensions - 1 */
        public native @Cast("npy_intp") long strides(int i); public native PyArrayIterObject strides(int i, long strides);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer strides();    /* ao->strides or fake */
        public native @Cast("npy_intp") long backstrides(int i); public native PyArrayIterObject backstrides(int i, long backstrides);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer backstrides();/* how far to jump back */
        public native @Cast("npy_intp") long factors(int i); public native PyArrayIterObject factors(int i, long factors);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer factors();     /* shape factors */
        public native PyArrayObject ao(); public native PyArrayIterObject ao(PyArrayObject ao);
        public native @Cast("char*") BytePointer dataptr(); public native PyArrayIterObject dataptr(BytePointer dataptr);        /* pointer to current item*/
        public native @Cast("npy_bool") byte contiguous(); public native PyArrayIterObject contiguous(byte contiguous);

        public native @Cast("npy_intp") long bounds(int i, int j); public native PyArrayIterObject bounds(int i, int j, long bounds);
        @MemberGetter public native @Cast("npy_intp(*)[2]") SizeTPointer bounds();
        public native @Cast("npy_intp") long limits(int i, int j); public native PyArrayIterObject limits(int i, int j, long limits);
        @MemberGetter public native @Cast("npy_intp(*)[2]") SizeTPointer limits();
        public native @Cast("npy_intp") long limits_sizes(int i); public native PyArrayIterObject limits_sizes(int i, long limits_sizes);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer limits_sizes();
        public native npy_iter_get_dataptr_t translate(); public native PyArrayIterObject translate(npy_iter_get_dataptr_t translate);
} 
