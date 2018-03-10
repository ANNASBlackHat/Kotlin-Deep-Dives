package types

fun main(args: Array<String>) {
    val product = Product()

    // First way : Adding @Nullable annotation in getCategory method
    val category = product.category
    println(category?.length)


    val subCategory: String? = product.subCategory
    println(subCategory?.length)

}