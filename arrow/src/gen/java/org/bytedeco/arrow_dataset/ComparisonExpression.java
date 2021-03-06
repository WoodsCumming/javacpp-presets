// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ComparisonExpression extends ComparisonExpressionImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ComparisonExpression(Pointer p) { super(p); }

  public ComparisonExpression(CompareOperator op, @SharedPtr @ByVal Expression left_operand,
                         @SharedPtr @ByVal Expression right_operand) { super((Pointer)null); allocate(op, left_operand, right_operand); }
  private native void allocate(CompareOperator op, @SharedPtr @ByVal Expression left_operand,
                         @SharedPtr @ByVal Expression right_operand);
  public ComparisonExpression(@Cast("arrow::compute::CompareOperator") byte op, @SharedPtr @ByVal Expression left_operand,
                         @SharedPtr @ByVal Expression right_operand) { super((Pointer)null); allocate(op, left_operand, right_operand); }
  private native void allocate(@Cast("arrow::compute::CompareOperator") byte op, @SharedPtr @ByVal Expression left_operand,
                         @SharedPtr @ByVal Expression right_operand);

  public native @StdString String ToString();

  public native @Cast("bool") boolean Equals(@Const @ByRef Expression other);

  public native @SharedPtr @ByVal Expression Assume(@Const @ByRef Expression given);

  public native CompareOperator op();

  public native @ByVal DataTypeResult Validate(@Const @ByRef Schema schema);
}
