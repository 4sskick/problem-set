import java.util.*

fun main() {

      //define array
      var arr = arrayOf(
            10, 3, 23, 86, 8, 9, 44, 5, 7
      )
      twoLargest(arr)
//      twoLargest_(arr)
}

fun swap(arr: Array<Int>, x: Int, y: Int) {
      val temp: Int = arr[x]
      arr[x] = arr[y]
      arr[y] = temp
}

fun bubbleSort(arr: Array<Int>): Array<Int> {

      var temp = 0
      var i = 0
      while (i < arr.size) {

            var j = if (i < 1) 1 else i
            while (j < (arr.size - i)) {
                  //swap values
                  if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1]
                        arr[j - 1] = arr[j]
                        arr[j] = temp
                  }
                  j++
            }
            i++
      }


      return arr
}

fun twoLargest_(arr: Array<Int>) {

      println("unsort ${Arrays.deepToString(arr)}")

//      Collections.sort(arr)
      var arr = bubbleSort(arr)

      println("sort ${Arrays.deepToString(arr)}")

      var f = arr[arr.size - 1]
      var s = arr[arr.size - 2]

      println("twoLargest_ first: $f\nsecond: $s")
}

fun twoLargest(arr: Array<Int>) {

      var f = Int.MIN_VALUE
      var s = Int.MAX_VALUE
      var ind = 0;

      while (ind < arr.size) {
            if (f < arr[ind]) {
                  s = f
                  f = arr[ind]
            } else if (s < arr[ind]) {
                  s = arr[ind]
            }

            ind++
      }

      println("first: $f\nsecond: $s")
}