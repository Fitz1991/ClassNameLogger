package ru.fitz.classnamelogger

import android.util.Log
import kotlin.reflect.KClass

class ClassNameLogger<T : Any>(val classLog: KClass<T>) {
    fun log(message: String) {
        Log.d(classLog.simpleName, message)
    }
}