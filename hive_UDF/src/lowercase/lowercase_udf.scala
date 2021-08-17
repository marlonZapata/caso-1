package lowercase
import org.apache.hadoop.hive.ql.exec.UDF
/**
 * @author training
 */
class lowercase_udf extends UDF{
  def evaluate(value: String): String = {
    val result = value.toLowerCase()
    result
  }
}