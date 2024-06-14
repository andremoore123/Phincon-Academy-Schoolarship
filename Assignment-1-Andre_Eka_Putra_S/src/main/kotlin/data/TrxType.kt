package data

sealed class TrxType(val name: String) {
    data class IN(val type: String = "In"): TrxType(name = type)
    data class OUT(val type: String = "Out"): TrxType(name = type)
}