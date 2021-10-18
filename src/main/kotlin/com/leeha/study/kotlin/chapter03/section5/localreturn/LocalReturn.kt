package com.leeha.study.kotlin.chapter03.section5.localreturn

fun main() {
    // 만약 shortFunc가 inline이 아니라면 return문에서 오류 발생
    shortFunc(3) {
        // 람다식에서 return 사용
        println("First call: $it")
        // 비 지역 반환(Non-local Return)
        // 람다식 함수에서 return문을 만났지만 의도하지 않게 처리된 것일 수 있다
        return
    }
}

// 람다식이 인라인으로 처리되어 return문이 포함된다
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
