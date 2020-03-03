// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanOptions(Pointer p) { super(p); }


  public static native @SharedPtr ScanOptions Make(@SharedPtr @ByVal Schema schema);

  // Construct a copy of these options with a different schema.
  public native @SharedPtr ScanOptions ReplaceSchema(@SharedPtr @ByVal Schema schema);

  // Indicate if the Scanner should make use of the ThreadPool found in the
  // ScanContext.
  public native @Cast("bool") boolean use_threads(); public native ScanOptions use_threads(boolean setter);

  // Filter
  public native @SharedPtr @ByRef Expression filter(); public native ScanOptions filter(Expression setter);

  // Evaluator for Filter
  public native @SharedPtr ExpressionEvaluator evaluator(); public native ScanOptions evaluator(ExpressionEvaluator setter);

  // Schema to which record batches will be reconciled
  public native @Const @SharedPtr @ByRef Schema schema();

  // Projector for reconciling the final RecordBatch to the requested schema.
  public native @ByRef RecordBatchProjector projector(); public native ScanOptions projector(RecordBatchProjector setter);

  // Return a vector of fields that requires materialization.
  //
  // This is usually the union of the fields referenced in the projection and the
  // filter expression. Examples:
  //
  // - `SELECT a, b WHERE a < 2 && c > 1` => ["a", "b", "a", "c"]
  // - `SELECT a + b < 3 WHERE a > 1` => ["a", "b"]
  //
  // This is needed for expression where a field may not be directly
  // used in the final projection but is still required to evaluate the
  // expression.
  //
  // This is used by Fragments implementation to apply the column
  // sub-selection optimization.
  public native @ByVal StringVector MaterializedFields();
}