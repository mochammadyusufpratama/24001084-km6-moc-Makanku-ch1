package model

data class computerSpec(
    var processorName : String,
    var processorTotalCore : Int,
    var isHaveIGPU : Boolean,
    var totalRAMInGB : Int,
    var EGPUName : String
)
