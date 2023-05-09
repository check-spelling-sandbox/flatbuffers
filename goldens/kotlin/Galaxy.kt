// automatically generated by the FlatBuffers compiler, do not modify

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class Galaxy : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Galaxy {
        __init(_i, _bb)
        return this
    }
    val numStars : Long
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getLong(o + bb_pos) else 0L
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_8()
        fun getRootAsGalaxy(_bb: ByteBuffer): Galaxy = getRootAsGalaxy(_bb, Galaxy())
        fun getRootAsGalaxy(_bb: ByteBuffer, obj: Galaxy): Galaxy {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createGalaxy(builder: FlatBufferBuilder, numStars: Long) : Int {
            builder.startTable(1)
            addNumStars(builder, numStars)
            return endGalaxy(builder)
        }
        fun startGalaxy(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addNumStars(builder: FlatBufferBuilder, numStars: Long) = builder.addLong(0, numStars, 0L)
        fun endGalaxy(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
