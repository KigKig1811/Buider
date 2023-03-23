package com.example.buider

class CustomBuilderClass(proper1: String,proper2: String, proper3: String) {

    constructor(builder: Builder) : this(
        builder.proper1,
        builder.proper2,
        builder.proper3
    )

    class Builder {
        var proper1: String = ""
            private set
        var proper2: String = ""
            private set
        var proper3: String = ""
            private set

        fun setProper1(proper: String) = apply { this.proper1 = proper }
        fun setProper2(proper: String) = apply { this.proper2 = proper }fun setProper3(proper: String) = apply { this.proper3 = proper }

        fun build(): CustomBuilderClass = CustomBuilderClass(this)

    }


}