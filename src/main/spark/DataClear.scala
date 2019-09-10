import org.apache.spark.HashPartitioner
import org.apache.spark.sql.SparkSession

/**
  * @ Author     ：zsp
  * @ Date       ：Created in 13:23 2019/8/6
  * @ Description：
  * @ Modified By：
  * @ Version:     
  */
object DataClear {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("DataClear")
      .master("local[2]")
      .getOrCreate()
    val sc = spark.sparkContext

    val lines = sc.textFile("F:\\scala-workspace\\myscala\\data\\two")
    lines.filter(_.trim.length>0)
      .map(line => (line.trim, ""))
      .groupByKey()
      .sortByKey()
      .keys.collect()
      .foreach(println)

    val lines2 = sc.textFile("F:\\scala-workspace\\myscala\\data\\three")
    var idx = 0
    val res = lines2.filter(_.trim.length>0).map(num => (num.trim.toInt, ""))
      .partitionBy(new HashPartitioner(1))
      .sortByKey()
      .map(t => {
        idx += 1
        (idx, t._1)
      }).collect()
      .foreach(x => println(x._1 + "\t" + x._2))
  }

}
