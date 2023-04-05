import java.lang.RuntimeException

fun main() {
      var arr = listOf<Int>(1, 2, 5, 7)
      var target = 11

      twoSum(arr, target)
}

fun twoSum(arr: List<Int>, target: Int) {
      var l = 0
      var r = arr.size - 1

      while (l < r) {
            if ((arr[l] + arr[r]) > target)
                  r--
            else if ((arr[l] + arr[r]) < target)
                  l++
            else if (arr[l] + arr[r] == target) {
                  print("index $l: ${arr[l]} & $r: ${arr[r]} with target $target")
                  return
            }
      }
}