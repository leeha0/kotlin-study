package com.leeha.study.kotlin.chapter05.section6.dependency

class Patient(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

// Doctor 클래스를 생성하기 위해 Patient 객체가 필요
class Doctor(val name: String, val p: Patient) {
    val customerId: Int = p.id

    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    // Patient 클래스가 먼저 생성되어야 함
    val patient1 = Patient("Kildong", 1234)
    val doc1 = Doctor("KimSabu", patient1)
    doc1.patientList(patient1)
}