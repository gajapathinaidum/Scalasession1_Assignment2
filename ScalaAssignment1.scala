package acadgildclassesobjects

import scala.util.control.Breaks._
import scala.util.control.Breaks

object ScalaAssignment1 {

  def main(args:Array[String]){
    var names=List[String]("alpha","gamma","omega","zeta","beta")
    //1.find out all strings length 4
    for(name<-names if name.length()==4)println(name)
    //2.convert list of string to list of integers ,where each string is mapped to its corresponding length
    val namesLength=for(name<-names)yield name.length()
    println(namesLength)
    //3.find count of all strings which contain alphabet 'm'
    var count=0
    for(name<-names if(name.contains('m')))
      count=count+1   
    println("Count of strings contain 'm' :"+count);  
    //4.find the count of all strings which start with the alphabet 'a'
    count=0
    for(name<-names if(name.startsWith("a")))
      count=count+1   
    println("Count of strings start with 'a' :"+count); 
  }
}