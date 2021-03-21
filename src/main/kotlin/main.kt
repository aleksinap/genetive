fun main(){
    val likes =111
    val remainder = if((likes-11)%100 == 0) 0 else likes%10
    val genetive = if(remainder == 1) "человеку" else "людям"
    println("Понравилось $likes $genetive")
}