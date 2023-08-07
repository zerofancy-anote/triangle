#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_top_ntutn_drawtriangle_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_onInit(JNIEnv *env, jobject thiz) {
    // TODO: implement onInit()
}
extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_onUnInit(JNIEnv *env, jobject thiz) {
    // TODO: implement onUnInit()
}
extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_setImageData(JNIEnv *env, jobject thiz, jint format,
                                                        jint width, jint height, jbyteArray bytes) {
    // TODO: implement setImageData()
}
extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_onSurfaceCreated(JNIEnv *env, jobject thiz) {
    // TODO: implement onSurfaceCreated()
}
extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_onSurfaceChanged(JNIEnv *env, jobject thiz, jint width,
                                                            jint height) {
    // TODO: implement onSurfaceChanged()
}
extern "C"
JNIEXPORT void JNICALL
Java_top_ntutn_drawtriangle_MyNativeRender_onDrawFrame(JNIEnv *env, jobject thiz) {
    // TODO: implement onDrawFrame()
}