package com.leeha.study.kotlin.chapter03.section4

import java.util.concurrent.locks.ReentrantLock

// 보호가 필요한 공유 자원
var sharable = 1

fun main() {
    var reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    // Good, 함수 참조로 호출하는 방법을 사용하는 것이 좋다
    lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc() {
    // 공유 자원 접근 코드 사용
    sharable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}