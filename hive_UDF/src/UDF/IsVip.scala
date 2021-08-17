package UDF
import org.apache.hadoop.hive.ql.exec.UDF
/**
 * @author training
 */
class IsVip extends UDF{
  val vip_countries = List("MEX", "ESP", "PER")

  def evaluate(value: String): Int = {
    if (vip_countries.contains(value)) {
      1
    }
    else{
      0
    }
  }
}