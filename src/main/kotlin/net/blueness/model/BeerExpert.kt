package net.blueness.model

class BeerExpert{
    fun getBrands(color: String):ArrayList<String>{
        val brands = arrayListOf<String>()
        if (color == "amber") {
            brands.add("Jack Amber")
            brands.add("Red Moose")
        }
        else {
            brands.add("Jail Pale Ale")
            brands.add("Gout Stout")
        }
        return brands
    }
}