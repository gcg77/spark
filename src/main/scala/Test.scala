import org.apache.spark.{SparkConf, SparkContext}

object Test {
  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setAppName("SparkTest")
    new SparkContext(conf)
    println("hello word")
  }
}
