package top.ntutn.drawtriangle

import androidx.annotation.Keep

@Keep
class MyNativeRender {
    init {
        System.loadLibrary("drawtriangle")
    }

    external fun onInit()
    external fun onUnInit()
    external fun setImageData(format: Int, width: Int, height: Int, bytes: ByteArray)
    external fun onSurfaceCreated()
    external fun onSurfaceChanged(width: Int, height: Int)
    external fun onDrawFrame()
}