package top.ntutn.drawtriangle

import android.content.Context
import android.opengl.GLES20
import android.opengl.GLSurfaceView
import android.util.AttributeSet
import android.util.Log
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyGLSurfaceView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null): GLSurfaceView(context, attrs) {
    private val nativeRender: MyNativeRender
    private val glRenderer: MyGLRender

    init {
        setEGLContextClientVersion(3)
        nativeRender = MyNativeRender()
        glRenderer = MyGLRender(nativeRender)
        setRenderer(glRenderer)
        renderMode = RENDERMODE_WHEN_DIRTY
    }

    class MyGLRender(private val nativeRender: MyNativeRender): Renderer {
        companion object {
            private const val TAG = "MyGLRender"
        }

        override fun onDrawFrame(gl: GL10?) {
            Log.d(TAG, "onDrawFrame: gl=$gl")
//            nativeRender.onDrawFrame()
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)
        }

        override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
            Log.d(TAG, "onSurfaceChanged: gl=$gl, width=$width, height=$height")
//            nativeRender.onSurfaceChanged(width, height)
            GLES20.glViewport(0, 0, width, height)
        }

        override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
            Log.d(TAG, "onSurfaceCreated: gl=$gl, config=$config")
//            nativeRender.onSurfaceCreated()
            GLES20.glClearColor(1f, 0f, 0f, 1f)
        }
    }
}