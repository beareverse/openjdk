/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_security_mscapi_Key */

#ifndef _Included_sun_security_mscapi_Key
#define _Included_sun_security_mscapi_Key
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_security_mscapi_Key_serialVersionUID
#define sun_security_mscapi_Key_serialVersionUID -1088859394025049194i64
/*
 * Class:     sun_security_mscapi_Key
 * Method:    cleanUp
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_sun_security_mscapi_Key_cleanUp
  (JNIEnv *, jclass, jlong, jlong);

/*
 * Class:     sun_security_mscapi_Key
 * Method:    getContainerName
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sun_security_mscapi_Key_getContainerName
  (JNIEnv *, jclass, jlong);

/*
 * Class:     sun_security_mscapi_Key
 * Method:    getKeyType
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sun_security_mscapi_Key_getKeyType
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif