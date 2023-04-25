fun main(args: Array<String>) {
   println( story("Mercy"))
    println(story(""))

    var currentAccount =CurrentAccount("2457658963","Orishaba",350000.0)
    currentAccount.balance
    currentAccount.deposit(3456.6)
    currentAccount.deposit(398.4)
    currentAccount.balance
    currentAccount.details()
    currentAccount.





}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun story(word:String):Char{
    var storys=word.length
   var stor =word[0]
    var sto =word[4]
//   return story
    return sto
   return stor


}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun digits (passward:String):Boolean{
   for (num in 8<){
       if (passward > 16){
        println("not")
   }
       else{
           println("valid")
       }
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiple(){
        for (num in 1..1000){
            if (num *6 && num*8){
                println(num)
            }
        }
    }
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
  class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)

    }
     fun withdraw(amount:Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println( "Account ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }

}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingAccount(var savingAccount: String)
   fun withdraw(){
      var withdr =
   }






